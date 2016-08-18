package com.hzmc.nbgsyn.service;

import java.util.Date;

import com.hzmc.nbgsyn.pojo.IncMdDataList;
import com.hzmc.nbgsyn.pojo.RequestLog;

/**
 * 下发服务
 * 
 * @author tfche 2016年7月25日16:45:59
 */
public interface ISendService {

	/**
	 * 定时下发的任务
	 */
	public void sendSeviceQuartzJob() throws InterruptedException;

	/**
	 * 定时下发没有发送成功的任务
	 */
	public void reSendSeviceQuartzJob() throws InterruptedException;

	/**
	 * 下发数据
	 */
	public void sendData(IncMdDataList incMdDataList, Date now);

	/**
	 * 重新下发日志数据
	 * 
	 * @param requestLog
	 */
	public void reSendRequestLog(RequestLog requestLog);

}
