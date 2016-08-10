package com.hzmc.nbgsyn.business.dao;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import com.hzmc.nbgsyn.persistence.ApplyDate;
import com.hzmc.nbgsyn.persistence.ResultBean;
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
	public void saveRequestLog(HashMap<String, Object> applyDate, String resultInfo, String uuid, String method, String isSuccess);

	/**
	 * 查出需要再次下发的数据
	 * 
	 * @param 条数
	 * @return
	 */
	public List<RequestLog> findNeedReSendLogByCount(Date now, Integer i);

	/**
	 * 更新数据
	 * 
	 * @param requestLog
	 */
	public void modifyRequestLog(RequestLog requestLog);

}
