package com.hzmc.nbgsyn.business.dao.impl;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.hzmc.nbgsyn.business.dao.IRequestLogDao;
import com.hzmc.nbgsyn.enums.MsgEnum;
import com.hzmc.nbgsyn.persistence.ApplyDate;
import com.hzmc.nbgsyn.persistence.ResultBean;
import com.hzmc.nbgsyn.persistence.ResultInfo;
import com.hzmc.nbgsyn.pojo.RequestLog;

import net.sf.json.JSONObject;

/**
 * 
 * @author tfche
 *
 */
@Service
public class RequestLogDaoImpl extends BaseDao implements IRequestLogDao {

	@Override
	public void saveRequestLog(RequestLog requestLog) {
		// TODO Auto-generated method stub
		this.getSqlMapClientTemplate().insert("insertRequestLog", requestLog);
	}

	@Override
	public void saveRequestLog(ApplyDate applyDate, ResultBean resultBean, String method) {
		// TODO Auto-generated method stub
		Date now = new Date();
		RequestLog requestLog = new RequestLog();
		requestLog.setAction(applyDate.getAction());
		requestLog.setCreateTime(now);
		requestLog.setEntity(applyDate.getEntity());
		requestLog.setMaxResend(0);
		requestLog.setNowResend(0);
		requestLog.setModifyTime(now);
		requestLog.setRequestData(JSONObject.fromObject(applyDate).toString());
		requestLog.setResponseData(JSONObject.fromObject(resultBean).toString());
		requestLog.setSessionId(resultBean.getResult().get("reqId").toString());
		requestLog.setType(applyDate.getType());
		requestLog.setUserName(applyDate.getUsername());
		requestLog.setMethod(method);
		if (resultBean.getMsgId().equals(MsgEnum.SUCCESS.getMsgId()))
			requestLog.setIsSuccess("Y");
		else
			requestLog.setIsSuccess("N");
		this.saveRequestLog(requestLog);
	}

	@Override
	public void saveRequestLog(ApplyDate applyDate, ResultInfo resultInfo, String uuid, String method, String isSuccess) {
		// TODO Auto-generated method stub
		Date now = new Date();
		RequestLog requestLog = new RequestLog();
		requestLog.setAction(applyDate.getAction());
		requestLog.setCreateTime(now);
		requestLog.setEntity(applyDate.getEntity());
		requestLog.setMaxResend(0);
		requestLog.setNowResend(0);
		requestLog.setModifyTime(now);
		requestLog.setRequestData(JSONObject.fromObject(applyDate).toString());
		requestLog.setResponseData(JSONObject.fromObject(resultInfo).toString());
		requestLog.setSessionId(uuid);
		requestLog.setType(applyDate.getType());
		requestLog.setUserName(applyDate.getUsername());
		requestLog.setMethod(method);
		requestLog.setIsSuccess(isSuccess);
		this.saveRequestLog(requestLog);
	}

}
