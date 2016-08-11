package com.hzmc.nbgsyn.quartz;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.hzmc.nbgsyn.service.ISendService;

/**
 * 用于下发的定时任务
 * 
 * @author tfche
 *
 */
public class SendServiceQuartzJob {

	private Logger logger = Logger.getLogger(SendServiceQuartzJob.class);

	@Autowired
	private ISendService sendService;

	public SendServiceQuartzJob() {
	}

	public void execute() {
		// 运行JOB的方法
		try {
			sendService.sendSeviceQuartzJob();
		} catch (InterruptedException e) {
			e.printStackTrace();
			logger.error(e);
		}
	}
}
