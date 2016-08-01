package com.hzmc.nbgsyn.business.dao;

import com.hzmc.nbgsyn.persistence.ApplyDate;
import com.hzmc.nbgsyn.persistence.ResultBean;
import com.hzmc.nbgsyn.persistence.ResultInfo;
import com.hzmc.nbgsyn.pojo.RequestLog;

/**
 * 
 * @author tfche
 *
 */
public interface IRequestLogDao {

	public void saveRequestLog(RequestLog requestLog);

	public void saveRequestLog(ApplyDate applyDate, ResultBean resultBean, String method);

	// 下发保存
	public void saveRequestLog(ApplyDate applyDate, ResultInfo resultInfo, String uuid, String method, String isSuccess);

}
