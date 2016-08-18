package com.hzmc.nbgsyn.business.runnable;

import java.util.concurrent.CountDownLatch;

import org.apache.log4j.Logger;

import com.hzmc.nbgsyn.business.queue.DataQueue;
import com.hzmc.nbgsyn.context.SpringApplicationContextHolder;
import com.hzmc.nbgsyn.pojo.RequestLog;
import com.hzmc.nbgsyn.service.ISendService;

public class ReSendLog implements Runnable {

	private Logger logger = Logger.getLogger(ReSendLog.class);

	private ISendService sendService = (ISendService) SpringApplicationContextHolder.getSpringBean("sendServiceImpl");

	private CountDownLatch threadsSignal;

	public ReSendLog(CountDownLatch threadsSignal) {
		this.threadsSignal = threadsSignal;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		// 从queue 拿出一个 下发
		RequestLog requestLog = DataQueue.getRequestLogs().poll();
		while (requestLog != null) {
			sendService.reSendRequestLog(requestLog);
			requestLog = DataQueue.getRequestLogs().poll();
		}
		threadsSignal.countDown();
		logger.info(Thread.currentThread().getName() + "结束. 还有" + threadsSignal.getCount() + " 个线程");
	}

}
