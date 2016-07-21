package com.hzmc.nbgsyn.webservice.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import javax.jws.WebService;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.hzmc.nbgsyn.business.manager.IUserManager;
import com.hzmc.nbgsyn.enums.MsgEnum;
import com.hzmc.nbgsyn.exception.UserInfoException;
import com.hzmc.nbgsyn.persistence.ApplyDate;
import com.hzmc.nbgsyn.persistence.ResultBean;
import com.hzmc.nbgsyn.persistence.ResultInfo;
import com.hzmc.nbgsyn.persistence.UserInfoBean;
import com.hzmc.nbgsyn.service.TalendService;
import com.hzmc.nbgsyn.webservice.IMdmOutService;

import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;
import net.sf.json.JsonConfig;

/**
 * webservice
 * 
 * @author tfchen 2016年6月28日15:55:51
 *
 */
@WebService(serviceName = "MdmOutService", endpointInterface = "com.hzmc.nbgsyn.webservice.IMdmOutService")
public class MdmOutServiceImpl implements IMdmOutService {

	private Logger logger = Logger.getLogger(MdmOutServiceImpl.class);

	private String SUCCESS = "success";

	private String FAIL = "fail";

	@Autowired
	private IUserManager userManager;

	@Autowired
	private TalendService talendService;

	@Override
	public String publishService(String applyDataStr) {
		// TODO Auto-generated method stub
		System.out.println("now in webservice");
		return this.service(applyDataStr, "publishService");
	}

	@Override
	public String registerService(String applyDataStr) {
		// TODO Auto-generated method stub
		return this.service(applyDataStr, "registerService");
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
		if (resultSet.contains(this.SUCCESS) && resultSet.contains(this.FAIL))
			return MsgEnum.PART_SUCCESS;
		// 成功
		else if (resultSet.contains(this.SUCCESS) && (!resultSet.contains(this.FAIL)))
			return MsgEnum.SUCCESS;
		else
			return MsgEnum.FAIL;
	}

	private String service(String applyDateStr, String method) {

		// TalendWs.method1();

		ResultBean resultBean = new ResultBean();
		resultBean.setMsgId(MsgEnum.SUCCESS.getMsgId());
		resultBean.setMsgDesc(MsgEnum.SUCCESS.getMsgDesc());

		// 只需要applyDate
		ApplyDate applyDate = new ApplyDate();
		try {
			JSONObject applyDateJo = JSONObject.fromObject(applyDateStr);
			applyDate = (ApplyDate) JSONObject.toBean(applyDateJo, ApplyDate.class);
		} catch (Exception e) {
			// TODO: handle exception
			logger.error(e);
			resultBean.setMsgId(MsgEnum.FORMART_ERROR.getMsgId());
			resultBean.setMsgDesc(MsgEnum.FORMART_ERROR.getMsgDesc());
			return JSONObject.fromObject(resultBean).toString();
		}

		if (applyDate == null) {
			resultBean.setMsgId(MsgEnum.FORMART_ERROR.getMsgId());
			resultBean.setMsgDesc(MsgEnum.FORMART_ERROR.getMsgDesc());
			return JSONObject.fromObject(resultBean).toString();
		}

		String username = applyDate.getUsername();
		String userPassword = applyDate.getPassword();
		username = username == null ? "" : username;
		userPassword = userPassword == null ? "" : userPassword;

		// 验证用户 --- 通讯用户--和下面注册的用户无关
		if (!userManager.validateUser(username, userPassword)) {
			resultBean.setMsgId(MsgEnum.USER_PWD_ERROR.getMsgId());
			resultBean.setMsgDesc(MsgEnum.USER_PWD_ERROR.getMsgDesc());
			return JSONObject.fromObject(resultBean).toString();
		}

		String actionType = applyDate.getAction();
		String type = applyDate.getType();

		if ("publishService".equals(method)) {
			if ("TRANSFOR".equals(actionType)) {
				// 向talend插入数据
				if ("C".equals(type)) {
					resultBean = talendService.saveApplyDate(applyDate);
				}
				// 向talend删除数据
				else if ("D".equals(type)) {
					resultBean = talendService.removeApplyDate(applyDate);
				}
				// 向talend 更新数据
				else if ("U".equals(type)) {
					resultBean = talendService.updateApplyDate(applyDate);
				}
				// 从talend 查找数据
				else if ("R".equals(type)) {
					resultBean = talendService.findApplyDate(applyDate);
				}
			} else {
				resultBean.setMsgId(MsgEnum.ACTION_NO_EXIST.getMsgId());
				resultBean.setMsgDesc(MsgEnum.ACTION_NO_EXIST.getMsgDesc());
			}
		} else if ("registerService".equals(method)) {
			// 注册方法
			if ("SERVICE_REGISTER".equals(actionType)) {
				JsonConfig config = new JsonConfig();
				config.setRootClass(UserInfoBean.class);
				@SuppressWarnings("unchecked")
				List<UserInfoBean> userInfoList = (ArrayList<UserInfoBean>) JSONSerializer.toJava(applyDate.getData(), config);

				// 对应每一个userinfo的返回结果集
				List<ResultInfo> resultInfos = new ArrayList<ResultInfo>();
				if ("C".equals(type)) {
					for (UserInfoBean userInfoBean : userInfoList) {
						ResultInfo temp = new ResultInfo(this.SUCCESS, "成功");
						try {
							userManager.saveRegisterUserInfo(userInfoBean);
						} catch (UserInfoException e) {
							// TODO Auto-generated catch block
							logger.error(e);
							temp.setSuccess(this.FAIL);
							temp.setMsg(e.getMessage());
						}
						resultInfos.add(temp);
					}
				}
				// 删除
				else if ("D".equals(type)) {
					for (UserInfoBean userInfoBean : userInfoList) {
						ResultInfo temp = new ResultInfo(this.SUCCESS, "成功");
						try {
							userManager.removeUserInfo(userInfoBean);
						} catch (UserInfoException e) {
							// TODO Auto-generated catch block
							logger.error(e);
							temp.setSuccess(this.FAIL);
							temp.setMsg(e.getMessage());
						}
						resultInfos.add(temp);
					}
				}
				// 更新
				else if ("U".equals(type)) {
					for (UserInfoBean userInfoBean : userInfoList) {
						ResultInfo temp = new ResultInfo(this.SUCCESS, "成功");
						try {
							userManager.modifyUserInfo(userInfoBean);
						} catch (UserInfoException e) {
							// TODO Auto-generated catch block
							logger.error(e);
							temp.setSuccess(this.FAIL);
							temp.setMsg(e.getMessage());
						}
						resultInfos.add(temp);
					}
				}
				// 查找
				else if ("R".equals(type)) {
					List<UserInfoBean> userInfoBeans = userManager.findAllUserInfo();
					resultBean.getResult().put("dataList", userInfoBeans);
				} else {
					ResultInfo temp = new ResultInfo(this.FAIL, "TYPE不存在");
					resultInfos.add(temp);
				}

				if (!"R".equals(type)) {
					resultBean.getResult().put("resultInfos", resultInfos);
					MsgEnum resEnum = this.generateMsgEnumByResultInfos(resultInfos);
					resultBean.setMsgId(resEnum.getMsgId());
					resultBean.setMsgDesc(resEnum.getMsgDesc());
				}
			} else {
				resultBean.setMsgId(MsgEnum.ACTION_NO_EXIST.getMsgId());
				resultBean.setMsgDesc(MsgEnum.ACTION_NO_EXIST.getMsgDesc());
			}
		} else {
			resultBean.setMsgId(MsgEnum.METHOD_NO_EXIST.getMsgId());
			resultBean.setMsgDesc(MsgEnum.METHOD_NO_EXIST.getMsgDesc());
		}

		return JSONObject.fromObject(resultBean).toString();
	}

}
