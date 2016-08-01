package com.hzmc.nbgsyn.service.impl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import javax.xml.ws.BindingProvider;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hzmc.nbgsyn.business.dao.IEntityViewDao;
import com.hzmc.nbgsyn.business.dao.IRequestLogDao;
import com.hzmc.nbgsyn.business.dao.IServiceRegisterDao;
import com.hzmc.nbgsyn.enums.MsgEnum;
import com.hzmc.nbgsyn.exception.TalendException;
import com.hzmc.nbgsyn.persistence.ApplyDate;
import com.hzmc.nbgsyn.persistence.ResultBean;
import com.hzmc.nbgsyn.persistence.ResultInfo;
import com.hzmc.nbgsyn.pojo.EntityView;
import com.hzmc.nbgsyn.pojo.ServiceRegister;
import com.hzmc.nbgsyn.service.ISendService;
import com.hzmc.nbgsyn.service.ITalendService;
import com.hzmc.nbgsyn.util.Constant;
import com.nbport.ediesb.service.EDIESBService;
import com.nbport.ediesb.service.EDIESBServicePortType;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Service
public class SendService implements ISendService {

	private Logger logger = Logger.getLogger(SendService.class);

	@Autowired
	private IEntityViewDao entityViewDao;

	@Autowired
	private IServiceRegisterDao serviceRegisterDao;

	@Autowired
	private ITalendService talendService;

	@Autowired
	private IRequestLogDao requestLogDao;

	private final String EDI_S_URL = Constant.EDI_S_URL;

	private final static URL WSDL_LOCATION;

	static {
		URL url = null;
		try {
			url = new URL(Constant.EDI_WS_URL);
		} catch (MalformedURLException e) {
			Logger.getLogger(SendService.class).error(e);
		}
		WSDL_LOCATION = url;
	}

	@Override
	public ResultBean sendSevice(ApplyDate applyDate, String uuid) {
		// TODO Auto-generated method stub
		// 查找注册表
		ResultBean resultBean = new ResultBean();
		resultBean.setMsgId(MsgEnum.SUCCESS.getMsgId());
		resultBean.setMsgDesc(MsgEnum.SUCCESS.getMsgDesc());

		String entityName = applyDate.getEntity();
		EntityView entityView = entityViewDao.findEntityViewByEntityName(entityName);

		if (entityView == null) {
			resultBean.setMsgId(MsgEnum.ENTITYKEY_NOTFOUND.getMsgId());
			resultBean.setMsgDesc(MsgEnum.ENTITYKEY_NOTFOUND.getMsgDesc() + ":" + entityName);
			return resultBean;
		}

		// 假如是company_base
		// 假如有外键
		if (StringUtils.equals("Y", entityView.getIsRalate())) {
			// 组合数据
			// 源数据
			JSONArray dataInfos = applyDate.getData();
			String model = applyDate.getModel();
			try {
				talendService.getRalteInfoDateList(dataInfos, entityView, model);
			} catch (TalendException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				resultBean.setMsgId(MsgEnum.ENTITY_RELATE_ERROR.getMsgId());
				resultBean.setMsgDesc(MsgEnum.ENTITY_RELATE_ERROR.getMsgDesc() + ":" + entityName);
				return resultBean;
			}
		}

		// System.out.println("round------------------" + applyDate.getData() + "------------------");

		// 查找注册表
		ServiceRegister serviceRegister = new ServiceRegister();
		serviceRegister.setEntityCode(entityView.getEntityName());

		List<ServiceRegister> serviceRegisterList = serviceRegisterDao.findServiceRegistersByCondition(serviceRegister);

		List<ResultInfo> resultInfos = new ArrayList<ResultInfo>();

		if (serviceRegisterList.size() == 0) {
			resultBean.getResult().put("warn", "没有需要下发的目标");
			return resultBean;
		}

		// 循环调用 下发
		for (ServiceRegister temp : serviceRegisterList) {
			ResultInfo resultInfo = new ResultInfo("success", "成功");
			// 如果包含 就调用ESB总线
			String fromNode = "MDM";
			String toNode = temp.getToNode();
			String esbId = "mdm_subscribe";
			applyDate.setPassword(temp.getPassword());
			applyDate.setUsername(temp.getUsername());
			JSONObject jo = JSONObject.fromObject(applyDate);
			JSONArray ja = new JSONArray();
			ja.add(jo);
			String applyDateStr = ja.toString();
			String userName = "";
			String passWorld = "";
			String isSuccess = "Y";
			try {
				String resultStr = this.callEDIESBService(fromNode, toNode, esbId, applyDateStr, userName, passWorld);
				resultInfo.setMsg(resultStr);
				JSONObject resJo = JSONObject.fromObject(resultStr);
				String msgId = resJo.getString("msgID");
				if (!StringUtils.equals(msgId, MsgEnum.SUCCESS.getMsgId()))
					isSuccess = "N";
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				// 调用失败 需要记录啥
				HashMap<String, Object> reqInfo = new HashMap<String, Object>();
				reqInfo.put("fromNode", fromNode);
				reqInfo.put("toNode", toNode);
				reqInfo.put("esbId", esbId);
				reqInfo.put("applyDateStr", applyDateStr);
				reqInfo.put("userName", userName);
				reqInfo.put("passWorld", passWorld);
				logger.error("edi-esb调用错误，详情:" + reqInfo + "。堆栈信息:" + e);
			}
			resultInfos.add(resultInfo);
			applyDate.setUsername(toNode);
			requestLogDao.saveRequestLog(applyDate, resultInfo, uuid, "sendSevice", isSuccess);
		}

		resultBean.getResult().put("resultInfos", resultInfos);

		MsgEnum resEnum = this.generateMsgEnumByResultInfos(resultInfos);
		resultBean.setMsgId(resEnum.getMsgId());
		resultBean.setMsgDesc(resEnum.getMsgDesc());
		return resultBean;
	}

	/**
	 * 调用ESB服务总线
	 * 
	 * @param fromNode
	 * @param toNode
	 * @param esbID
	 * @param applyData
	 * @param userID
	 * @param password
	 * @return
	 * @throws Exception
	 */
	private String callEDIESBService(String fromNode, String toNode, String esbID, String applyData, String userID, String password) throws Exception {
		// TODO Auto-generated method stub
		EDIESBService ediesbService = new EDIESBService(WSDL_LOCATION);
		EDIESBServicePortType ediesbServicePortType = ediesbService.getEDIESBServicePort();
		BindingProvider bp = (BindingProvider) ediesbServicePortType;
		bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, EDI_S_URL);
		String res = "";
		try {
			res = ediesbServicePortType.callEDIESBPub(fromNode, toNode, esbID, applyData, userID, password);
		} catch (Exception e) {
			// TODO: handle exception
			logger.error(e);
			throw e;
		}

		return res;
	}

	/**
	 * 根据 resultInfos 来判断成功 部分成功 失败
	 * 
	 * @param resultInfos
	 * @return
	 */
	private MsgEnum generateMsgEnumByResultInfos(List<ResultInfo> resultInfos) {
		// TODO Auto-generated method stub
		HashSet<String> resultSet = new HashSet<String>();
		for (ResultInfo resultInfo : resultInfos) {
			resultSet.add(resultInfo.getSuccess());
		}
		// 部分成功
		if (resultSet.contains("success") && resultSet.contains("fail"))
			return MsgEnum.PART_SUCCESS;
		// 成功
		else if (resultSet.contains("success") && (!resultSet.contains("fail")))
			return MsgEnum.SUCCESS;
		else
			return MsgEnum.FAIL;
	}
}
