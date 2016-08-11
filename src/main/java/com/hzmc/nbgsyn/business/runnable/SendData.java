package com.hzmc.nbgsyn.business.runnable;

import java.util.Date;
import java.util.concurrent.CountDownLatch;

import org.apache.log4j.Logger;

import com.hzmc.nbgsyn.business.queue.DataQueue;
import com.hzmc.nbgsyn.context.SpringApplicationContextHolder;
import com.hzmc.nbgsyn.pojo.IncMdDataList;
import com.hzmc.nbgsyn.service.ISendService;

public class SendData implements Runnable {

	private Logger logger = Logger.getLogger(SendData.class);

	private ISendService sendService = (ISendService) SpringApplicationContextHolder.getSpringBean("sendServiceImpl");

	private CountDownLatch threadsSignal;

	public SendData(CountDownLatch threadsSignal) {
		this.threadsSignal = threadsSignal;
	}

	@Override
	public void run() {
		// 从queue 拿出一个 下发
		IncMdDataList incMdDataList = DataQueue.getIncMdDataLists().poll();
		while (incMdDataList != null) {
			Date now = new Date();
			sendService.sendData(incMdDataList, now);
			incMdDataList = DataQueue.getIncMdDataLists().poll();
		}
		threadsSignal.countDown();
		logger.info(Thread.currentThread().getName() + "结束. 还有" + threadsSignal.getCount() + " 个线程");
	}

}
