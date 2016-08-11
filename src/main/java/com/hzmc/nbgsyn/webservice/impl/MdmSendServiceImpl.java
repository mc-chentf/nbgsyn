package com.hzmc.nbgsyn.webservice.impl;

import java.util.UUID;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.hzmc.nbgsyn.business.dao.IRequestLogDao;
import com.hzmc.nbgsyn.business.manager.IUserManager;
import com.hzmc.nbgsyn.enums.MsgEnum;
import com.hzmc.nbgsyn.persistence.ApplyDate;
import com.hzmc.nbgsyn.persistence.ResultBean;
import com.hzmc.nbgsyn.service.ISendService;
import com.hzmc.nbgsyn.webservice.IMdmSendService;

import net.sf.json.JSONObject;

public class MdmSendServiceImpl implements IMdmSendService {

	private Logger logger = Logger.getLogger(MdmSendServiceImpl.class);

	@Autowired
	private IUserManager userManager;

	@SuppressWarnings("unused")
	@Autowired
	private ISendService sendService;

	@SuppressWarnings("unused")
	@Autowired
	private IRequestLogDao requestLogDao;

	@POST
	@Path("/")
	public String sendDateDownPost(@QueryParam("applyData") String applyDateStr) {
		String res = sendDateDown(applyDateStr);
		logger.info(res);
		return res;
	}

	@GET
	@Path("/")
	public String sendDateDownGet(@QueryParam("applyData") String applyDateStr) {
		String res = sendDateDown(applyDateStr);
		logger.info(res);
		return res;
	}

	private String sendDateDown(String applyDateStr) {
		// System.out.println("resevice----------" + applyDateStr);
		ResultBean resultBean = new ResultBean();
		resultBean.setMsgId(MsgEnum.SUCCESS.getMsgId());
		resultBean.setMsgDesc(MsgEnum.SUCCESS.getMsgDesc());
		
		
		// 封装applyDate
		ApplyDate applyDate = new ApplyDate();
		try {
			JSONObject applyDateJo = JSONObject.fromObject(applyDateStr);
			applyDate = (ApplyDate) JSONObject.toBean(applyDateJo, ApplyDate.class);
		} catch (Exception e) {
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

		
		// 检查是否在配置文件中
		UUID uuid = UUID.randomUUID();

		// 下发
//		resultBean = sendService.sendSevice(applyDate, uuid.toString());

		resultBean.getResult().put("reqId", uuid.toString());
		
		applyDate.setUsername(username);
//		requestLogDao.saveRequestLog(applyDate, resultBean, "sendDateDown");

		logger.info("下发:--------------" + JSONObject.fromObject(resultBean).toString());
		return JSONObject.fromObject(resultBean).toString();
	}

}
