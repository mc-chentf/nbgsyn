package com.hzmc.nbgsyn.business.dao.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import com.hzmc.nbgsyn.business.dao.IRequestLogDao;
import com.hzmc.nbgsyn.enums.MsgEnum;
import com.hzmc.nbgsyn.persistence.ApplyDate;
import com.hzmc.nbgsyn.persistence.ResultBean;
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
	public void saveRequestLog(HashMap<String, Object> reqInfo, String resultInfo, String uuid, String method, String isSuccess) {
		// TODO Auto-generated method stub
		Date now = new Date();
		RequestLog requestLog = new RequestLog();
		requestLog.setAction(reqInfo.get("action").toString());
		requestLog.setCreateTime(now);
		requestLog.setEntity(reqInfo.get("entity").toString());
		requestLog.setMaxResend(0);
		requestLog.setNowResend(0);
		requestLog.setModifyTime(now);
		requestLog.setRequestData(JSONObject.fromObject(reqInfo).toString());
		requestLog.setResponseData(resultInfo);
		requestLog.setSessionId(uuid);
		requestLog.setType(reqInfo.get("type").toString());
		requestLog.setUserName(reqInfo.get("toNode").toString());
		requestLog.setMethod(method);
		requestLog.setIsSuccess(isSuccess);
		this.saveRequestLog(requestLog);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<RequestLog> findNeedReSendLogByCount(Date now, Integer i) {
		// TODO Auto-generated method stub
		HashMap<String, Object> par = new HashMap<>();
		par.put("count", i);
		par.put("now", now);
		return this.getSqlMapClientTemplate().queryForList("findNeedReSendLogByCount", par);
	}

	@Override
	public void modifyRequestLog(RequestLog requestLog) {
		// TODO Auto-generated method stub
		Date now = new Date();
		requestLog.setModifyTime(now);
		this.getSqlMapClientTemplate().update("modifyRequestLog", requestLog);
	}

}
