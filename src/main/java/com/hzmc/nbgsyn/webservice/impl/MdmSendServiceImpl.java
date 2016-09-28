package com.hzmc.nbgsyn.webservice.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.hzmc.nbgsyn.business.dao.IRequestLogDao;
import com.hzmc.nbgsyn.enums.MsgEnum;
import com.hzmc.nbgsyn.persistence.ResultBean;
import com.hzmc.nbgsyn.pojo.RequestLog;
import com.hzmc.nbgsyn.service.ISendService;
import com.hzmc.nbgsyn.webservice.IMdmSendService;

import net.sf.json.JSONObject;

@Produces({ "application/json" })
public class MdmSendServiceImpl implements IMdmSendService {

	private Logger logger = Logger.getLogger(MdmSendServiceImpl.class);

	@Autowired
	private IRequestLogDao requestLogDao;

	@Autowired
	private ISendService sendService;

	@POST
	@Path("/")
	public String sendDataDownPost(@FormParam("startDate") String startDate, @FormParam("endDate") String endDate) {
		ResultBean res = sendDateDown(startDate, endDate);
		logger.info(res);
		return JSONObject.fromObject(res).toString();
	}

	@GET
	@Path("/")
	public String sendDataDownGet(@QueryParam("startDate") String startDate, @QueryParam("endDate") String endDate) {
		ResultBean res = sendDateDown(startDate, endDate);
		logger.info(res);
		return JSONObject.fromObject(res).toString();
	}

	@POST
	@Path("/findSendDataCount")
	public String findSendDateCountPost(@FormParam("startDate") String startDate, @FormParam("endDate") String endDate) {
		ResultBean res = findSendDateCount(startDate, endDate);
		logger.info(res);
		return JSONObject.fromObject(res).toString();
	}

	@GET
	@Path("/findSendDataCount")
	public String findSendDateCountGet(@QueryParam("startDate") String startDate, @QueryParam("endDate") String endDate) {
		ResultBean res = findSendDateCount(startDate, endDate);
		logger.info(res);
		return JSONObject.fromObject(res).toString();
	}

	private ResultBean findSendDateCount(String startDate, String endDate) {
		// TODO Auto-generated method stub
		ResultBean resultBean = new ResultBean(MsgEnum.SUCCESS.getMsgId(), MsgEnum.SUCCESS.getMsgDesc());
		// 判断是否为空
		if (StringUtils.isEmpty(startDate)) {
			resultBean.setMsgId(MsgEnum.SEND_DATA_NOW_PAR_ERROR.getMsgId());
			resultBean.setMsgDesc(MsgEnum.SEND_DATA_NOW_PAR_ERROR.getMsgDesc());
			return resultBean;
		}

		Date start;
		Date end;
		// 转化时间
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		// 开始时间转化错误 就扔出去
		try {
			start = dateFormat.parse(startDate);
		} catch (ParseException e) {
			logger.error(e);
			resultBean.setMsgId(MsgEnum.SEND_DATA_NOW_PAR_ERROR.getMsgId());
			resultBean.setMsgDesc(MsgEnum.SEND_DATA_NOW_PAR_ERROR.getMsgDesc());
			return resultBean;
		}

		// 结束时间转化错误 就取当前时间
		try {
			if (StringUtils.isEmpty(endDate))
				end = new Date();
			else
				end = dateFormat.parse(endDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			logger.error(e);
			end = new Date();
		}

		int count = requestLogDao.findRequestLogResendCount(start, end);
		resultBean.getResult().put("resend_count", count);
		return resultBean;
	}

	private ResultBean sendDateDown(String startDate, String endDate) {
		ResultBean resultBean = new ResultBean(MsgEnum.SUCCESS.getMsgId(), MsgEnum.SUCCESS.getMsgDesc());
		// 判断是否为空
		if (StringUtils.isEmpty(startDate)) {
			resultBean.setMsgId(MsgEnum.SEND_DATA_NOW_PAR_ERROR.getMsgId());
			resultBean.setMsgDesc(MsgEnum.SEND_DATA_NOW_PAR_ERROR.getMsgDesc());
			return resultBean;
		}

		Date start;
		Date end;
		// 转化时间
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		// 开始时间转化错误 就扔出去
		try {
			start = dateFormat.parse(startDate);
		} catch (ParseException e) {
			logger.error(e);
			resultBean.setMsgId(MsgEnum.SEND_DATA_NOW_PAR_ERROR.getMsgId());
			resultBean.setMsgDesc(MsgEnum.SEND_DATA_NOW_PAR_ERROR.getMsgDesc());
			return resultBean;
		}

		// 结束时间转化错误 就取当前时间
		try {
			if (StringUtils.isEmpty(endDate))
				end = new Date();
			else
				end = dateFormat.parse(endDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			logger.error(e);
			end = new Date();
		}

		int count = requestLogDao.modifyRequestLogMaxResendAdd(start, end);

		resultBean.getResult().put("resend_count", count);

		// 创建线程 调度下发

		Thread resendMain = new Thread(new Runnable() {
			public void run() {
				try {
					sendService.reSendSeviceQuartzJob();
				} catch (InterruptedException e) {
					e.printStackTrace();
					logger.error(e);
				}
			}
		}, "resendMain");

		resendMain.start();

		Date now = new Date();
		UUID uuid = UUID.randomUUID();
		resultBean.getResult().put("reqId", uuid.toString());

		RequestLog requestLog = new RequestLog();
		requestLog.setAction("SEND");
		requestLog.setCreateTime(now);
		requestLog.setModifyTime(now);
		requestLog.setEntity("");
		requestLog.setIsSuccess("Y");
		requestLog.setMaxResend(0);
		requestLog.setNowResend(0);
		requestLog.setType("S");
		requestLog.setUserName("mdm");
		requestLog.setMethod("sendDateDown");
		requestLog.setSessionId(uuid.toString());
		JSONObject jo = new JSONObject();
		jo.put("startDate", startDate);
		jo.put("endDate", endDate);
		requestLog.setRequestData(jo.toString());
		requestLog.setResponseData(JSONObject.fromObject(resultBean).toString());
		requestLogDao.saveRequestLog(requestLog);

		return resultBean;
	}

}
