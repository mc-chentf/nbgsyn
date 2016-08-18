package com.hzmc.nbgsyn.webservice.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.hzmc.nbgsyn.business.dao.IRequestLogDao;
import com.hzmc.nbgsyn.enums.MsgEnum;
import com.hzmc.nbgsyn.persistence.ResultBean;
import com.hzmc.nbgsyn.service.ISendService;
import com.hzmc.nbgsyn.webservice.IMdmSendService;

import net.sf.json.JSONObject;

public class MdmSendServiceImpl implements IMdmSendService {

	private Logger logger = Logger.getLogger(MdmSendServiceImpl.class);

	@Autowired
	private IRequestLogDao requestLogDao;

	@Autowired
	private ISendService sendService;

	@POST
	@Path("/")
	public String sendDateDownPost(@QueryParam("startDate") String startDate, @QueryParam("endDate") String endDate) {
		ResultBean res = sendDateDown(startDate, endDate);
		logger.info(res);
		return JSONObject.fromObject(res).toString();
	}

	@GET
	@Path("/")
	public String sendDateDownGet(@QueryParam("startDate") String startDate, @QueryParam("endDate") String endDate) {
		ResultBean res = sendDateDown(startDate, endDate);
		logger.info(res);
		return JSONObject.fromObject(res).toString();
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

		return resultBean;
	}

}
