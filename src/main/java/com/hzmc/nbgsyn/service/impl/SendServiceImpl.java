package com.hzmc.nbgsyn.service.impl;

import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.ws.BindingProvider;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hzmc.nbgsyn.business.dao.IEntityViewDao;
import com.hzmc.nbgsyn.business.dao.IIncMdDataListDao;
import com.hzmc.nbgsyn.business.dao.IRequestLogDao;
import com.hzmc.nbgsyn.business.dao.IServiceRegisterDao;
import com.hzmc.nbgsyn.business.queue.DataQueue;
import com.hzmc.nbgsyn.business.runnable.ReSendLog;
import com.hzmc.nbgsyn.business.runnable.SendData;
import com.hzmc.nbgsyn.enums.MsgEnum;
import com.hzmc.nbgsyn.exception.TalendException;
import com.hzmc.nbgsyn.persistence.ApplyDate;
import com.hzmc.nbgsyn.pojo.EntityView;
import com.hzmc.nbgsyn.pojo.IncMdDataList;
import com.hzmc.nbgsyn.pojo.RequestLog;
import com.hzmc.nbgsyn.pojo.ServiceRegister;
import com.hzmc.nbgsyn.service.ISendService;
import com.hzmc.nbgsyn.service.ITalendService;
import com.hzmc.nbgsyn.util.Constant;
import com.hzmc.nbgsyn.util.XmlStrToJsonUtil;
import com.mchz.nbg.talendservice.WSItem;
import com.nbport.ediesb.service.EDIESBService;
import com.nbport.ediesb.service.EDIESBServicePortType;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Service
public class SendServiceImpl implements ISendService {

	private Logger logger = Logger.getLogger(SendServiceImpl.class);

	@Autowired
	private IEntityViewDao entityViewDao;

	@Autowired
	private IServiceRegisterDao serviceRegisterDao;

	@Autowired
	private ITalendService talendService;

	@Autowired
	private IRequestLogDao requestLogDao;

	@Autowired
	private IIncMdDataListDao incMdDataListDao;

	private final String EDI_S_URL = Constant.EDI_S_URL;

	private final static URL WSDL_LOCATION;

	static {
		URL url = null;
		try {
			url = new URL(Constant.EDI_WS_URL);
		} catch (MalformedURLException e) {
			Logger.getLogger(SendServiceImpl.class).error(e);
		}
		WSDL_LOCATION = url;
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
	private String callEDIESBService(String fromNode, String toNode, String esbId, String applyData, String userId, String password) throws Exception {
		EDIESBService ediesbService = new EDIESBService(WSDL_LOCATION);
		EDIESBServicePortType ediesbServicePortType = ediesbService.getEDIESBServicePort();
		BindingProvider bp = (BindingProvider) ediesbServicePortType;
		bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, EDI_S_URL);
		String res = "";
		try {
			res = ediesbServicePortType.callEDIESBPub(fromNode, toNode, esbId, applyData, userId, password);
		} catch (Exception e) {
			logger.error(e);
			throw e;
		}

		return res;
	}

	@Override
	public void sendSeviceQuartzJob() throws InterruptedException {
		Date now = new Date();

		int count = 5;

		while (true) {
			// 查找 需要下发的数据
			// 查找 需要下发的新增数据
			List<IncMdDataList> createIncMdDataLists = incMdDataListDao.findIncMdDataListsByDateAndCountAndType(now, count, "C");
			if (createIncMdDataLists == null || createIncMdDataLists.size() == 0)
				break;
			this.sendIncMdDataLists(createIncMdDataLists, now);
		}

		while (true) {
			// 查找需要下发的更改数据
			int threadNum = 5;
			int updateCount = count * threadNum;
			// 下发新增数据
			List<IncMdDataList> updateIncMdDataLists = incMdDataListDao.findIncMdDataListsByDateAndCountAndType(now, updateCount, "U");
			if (updateIncMdDataLists == null || updateIncMdDataLists.size() == 0)
				break;
			DataQueue.getIncMdDataLists().addAll(updateIncMdDataLists);

			// 初始化countDown
			CountDownLatch threadSignal = new CountDownLatch(threadNum);

			// 创建固定长度的线程池
			Executor executor = Executors.newFixedThreadPool(threadNum);

			for (int i = 0; i < threadNum; i++) { // 开threadNum个线程
				Runnable sendData = new SendData(threadSignal);
				// 执行
				executor.execute(sendData);
			}
			threadSignal.await();
		}

		while (true) {
			// 查找需要下发的删除数据
			List<IncMdDataList> deleteIncMdDataLists = incMdDataListDao.findIncMdDataListsByDateAndCountAndType(now, count, "D");
			if (deleteIncMdDataLists == null || deleteIncMdDataLists.size() == 0)
				break;
			this.sendIncMdDataLists(deleteIncMdDataLists, now);
		}

	}

	/**
	 * 下发新增数据
	 * 
	 * @param createIncMdDataLists
	 */
	private void sendIncMdDataLists(List<IncMdDataList> incMdDataLists, Date now) {
		if (incMdDataLists != null && incMdDataLists.size() != 0) {
			for (IncMdDataList incMdDataList : incMdDataLists) {
				this.sendData(incMdDataList, now);
			}
		}
	}

	@Override
	public void sendData(IncMdDataList incMdDataList, Date now) {

		// 获取 table
		String entityName = incMdDataList.getTableName();

		// 去查找 如果 不需要下发 则更改为不需要下发
		EntityView entityView = entityViewDao.findEntityViewByEntityName(entityName);
		if (entityView == null) {
			// 更新掉
			incMdDataList.setSendFlag("N");
			incMdDataList.setModifyTime(now);
			incMdDataListDao.modifyIncMdDataList(incMdDataList);
			return;
		}

		String pkValue = incMdDataList.getPkValue();
		String dataType = incMdDataList.getType();

		// 默认UPDATE
		String type = "U";
		if (StringUtils.equals("I", dataType) || StringUtils.equals("C", dataType)) {
			type = "C";
		} else if (StringUtils.equals("P", dataType)) {
			type = "D";
		}

		// 生成UUID
		UUID uuid = UUID.randomUUID();

		incMdDataList.setSendFlag("Y");

		try {
			// 查找注册表
			ServiceRegister serviceRegister = new ServiceRegister();
			serviceRegister.setEntityCode(entityView.getEntityName());
			serviceRegister.setActiveFlag("Y");
			List<ServiceRegister> serviceRegisterList = serviceRegisterDao.findServiceRegistersByCondition(serviceRegister);

			// 没有下发的目标
			if (serviceRegisterList == null || serviceRegisterList.size() == 0) {
				incMdDataList.setSendFlag("N");
				incMdDataList.setModifyTime(now);
				incMdDataListDao.modifyIncMdDataList(incMdDataList);
			}

			// applydate的dataInfos
			JSONArray dataInfos = new JSONArray();

			if (StringUtils.equals("D", type)) {
				JSONObject jo = new JSONObject();
				jo.put(entityView.getEntityKey(), pkValue);
				dataInfos.add(jo);
			} else {
				// 根据 table 的主键 查找到那条数据 通过talend
				WSItem item = talendService.getItemInfoInTalend(Constant.MODEL, entityName, pkValue);
				String itemContent = item.getContent();
				// 把itemContent 转化为JSON
				JSONObject itemJson = (JSONObject) XmlStrToJsonUtil.xmlStrToJson(itemContent);
				itemJson.remove("ERROR_FLAG");
				itemJson.remove("INSERT_TIME");
				itemJson.remove("UPDATE_TIME");
				Pattern r = Pattern.compile(Constant.E_NOTATION_PATTERN);
				// 去掉科学计数法
				@SuppressWarnings("unchecked")
				Iterator<String> iterator = itemJson.keySet().iterator();
				while (iterator.hasNext()) {
					String key = iterator.next();
					String value = itemJson.getString(key);
					Matcher m = r.matcher(value);
					if (m.matches()) {
						BigDecimal bigDecimal = new BigDecimal(value);
						itemJson.put(key, bigDecimal.toString());
					}
					// 外键[]去除
					if (itemJson.get(key) instanceof JSONArray) {
						JSONArray ja = (JSONArray) itemJson.get(key);
						itemJson.put(key, ja.getString(0));
					}
				}

				dataInfos.add(itemJson);
				// 假如有外键
				if (StringUtils.equals("Y", entityView.getIsRalate())) {
					// 组合数据
					// 源数据
					talendService.getRalteInfoDateList(dataInfos, entityView, Constant.MODEL);
				}
			}

			// 循环调用 下发
			for (ServiceRegister temp : serviceRegisterList) {
				// 如果包含 就调用ESB总线
				ApplyDate applyDate = new ApplyDate();
				applyDate.setAction("TRANSFOR");
				applyDate.setData(dataInfos);
				applyDate.setEntity(entityName);
				applyDate.setModel(Constant.MODEL);
				applyDate.setType(type);
				applyDate.setPagesize(null);
				applyDate.setPage(null);

				String fromNode = "MDM";
				String toNode = temp.getToNode();
				String esbId = temp.getServiceName();
				applyDate.setPassword(temp.getPassword());
				applyDate.setUsername(temp.getUsername());
				JSONObject jo = JSONObject.fromObject(applyDate);
				jo.remove("page");
				jo.remove("pagesize");
				jo.remove("sys_code");

				JSONArray ja = new JSONArray();
				ja.add(jo);
				String applyDateStr = ja.toString();
				String isSuccess = "Y";
				String resultStr = "";

				HashMap<String, Object> reqInfo = new HashMap<String, Object>();
				reqInfo.put("fromNode", fromNode);
				reqInfo.put("toNode", toNode);
				reqInfo.put("esbId", esbId);
				reqInfo.put("applyDateStr", applyDateStr);
				reqInfo.put("action", "TRANSFOR");
				reqInfo.put("entity", entityName);
				reqInfo.put("type", type);

				try {
					resultStr = this.callEDIESBService(fromNode, toNode, esbId, applyDateStr, "", "");
					JSONObject resJo = JSONObject.fromObject(resultStr);
					String msgId = resJo.getString("msgId");
					if (!StringUtils.equals(msgId, MsgEnum.SUCCESS.getMsgId()))
						isSuccess = "N";
				} catch (Exception e) {
					isSuccess = "N";
					e.printStackTrace();
					// 调用失败 需要记录啥
					logger.error("edi-esb调用错误，详情:" + reqInfo + "。堆栈信息:" + e);
				}
				resultStr = Thread.currentThread().getName() + "----" + resultStr;
				requestLogDao.saveRequestLog(reqInfo, resultStr, uuid.toString(), "sendSevice", isSuccess);
			}

		} catch (TalendException e) {
			incMdDataList.setSendFlag("E");
			e.printStackTrace();
			logger.error(e);
		}

		// 更新掉
		incMdDataList.setModifyTime(new Date());
		incMdDataList.setSendTime(new Date());
		incMdDataList.setSendSessionId(uuid.toString());
		incMdDataListDao.modifyIncMdDataList(incMdDataList);
	}

	@Override
	public void reSendSeviceQuartzJob() throws InterruptedException {
		// 查找日志表
		Date now = new Date();
		int count = 10;

		// 先 补发 新增的
		while (true) {
			List<RequestLog> requestLogs = requestLogDao.findNeedReSendLogByCount(now, count, "C");
			if (requestLogs == null || requestLogs.size() == 0) {
				logger.info("处理完毕" + System.currentTimeMillis());
				break;
			}
			this.reSendRequestLogs(requestLogs);
		}

		// 再 补发 修改的
		while (true) {
			int threadNum = 5;
			int updateCount = count * threadNum;

			List<RequestLog> requestLogs = requestLogDao.findNeedReSendLogByCount(now, updateCount, "U");
			if (requestLogs == null || requestLogs.size() == 0) {
				logger.info("处理完毕" + System.currentTimeMillis());
				break;
			}

			DataQueue.getRequestLogs().addAll(requestLogs);

			// 初始化countDown
			CountDownLatch threadSignal = new CountDownLatch(threadNum);

			// 创建固定长度的线程池
			Executor executor = Executors.newFixedThreadPool(threadNum);

			for (int i = 0; i < threadNum; i++) { // 开threadNum个线程
				Runnable sendData = new ReSendLog(threadSignal);
				// 执行
				executor.execute(sendData);
			}

			threadSignal.await();
		}

		// 再 补发 删除的
		while (true) {
			List<RequestLog> requestLogs = requestLogDao.findNeedReSendLogByCount(now, count, "D");
			if (requestLogs == null || requestLogs.size() == 0) {
				logger.info("处理完毕" + System.currentTimeMillis());
				break;
			}
			this.reSendRequestLogs(requestLogs);
		}

	}

	private void reSendRequestLogs(List<RequestLog> requestLogs) {
		// TODO Auto-generated method stub
		// 重新发送数据
		for (RequestLog requestLog : requestLogs) {
			reSendRequestLog(requestLog);
		}
	}

	@Override
	public void reSendRequestLog(RequestLog requestLog) {
		JSONObject jo = JSONObject.fromObject(requestLog.getRequestData());
		@SuppressWarnings("unchecked")
		HashMap<String, String> reqInfo = (HashMap<String, String>) JSONObject.toBean(jo, HashMap.class);
		String resultStr = "";
		String fromNode = reqInfo.get("fromNode");
		String toNode = reqInfo.get("toNode");
		String esbId = reqInfo.get("esbId");
		String applyData = reqInfo.get("applyDateStr");
		String isSuccess = "Y";
		try {
			resultStr = callEDIESBService(fromNode, toNode, esbId, applyData, "", "");
			JSONObject resJo = JSONObject.fromObject(resultStr);
			String msgId = resJo.getString("msgId");
			if (!StringUtils.equals(msgId, MsgEnum.SUCCESS.getMsgId()))
				isSuccess = "N";
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("edi-esb调用错误，详情,堆栈信息:" + e);
			resultStr = "edi-esb调用错误，详情,堆栈信息:" + e;
			isSuccess = "N";
		}
		resultStr = Thread.currentThread().getName() + "----" + resultStr;
		requestLog.setIsSuccess(isSuccess);
		int nowResend = requestLog.getNowResend() + 1;
		requestLog.setNowResend(nowResend);
		requestLog.setResponseData(requestLog.getResponseData() + "--------" + nowResend + "--------" + resultStr);
		requestLogDao.modifyRequestLog(requestLog);
	}
}
