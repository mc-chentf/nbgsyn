package com.hzmc.nbgsyn.webservice.impl;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

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


	private ISendService sendService;

	@GET
	@Path("/")
	public String sendDateDown(@QueryParam("applyDate") String applyDateStr) {
		// TODO Auto-generated method stub
		ResultBean resultBean = new ResultBean();
		resultBean.setMsgId(MsgEnum.SUCCESS.getMsgId());
		resultBean.setMsgDesc(MsgEnum.SUCCESS.getMsgDesc());

		// 封装applyDate
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

		// 检查是否在配置文件中
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

		// 下发
		resultBean = sendService.sendSevice(applyDate);
		
		return JSONObject.fromObject(resultBean).toString();
	}

}
