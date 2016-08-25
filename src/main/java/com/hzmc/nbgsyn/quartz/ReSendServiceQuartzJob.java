package com.hzmc.nbgsyn.quartz;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.hzmc.nbgsyn.service.ISendService;

public class ReSendServiceQuartzJob {
	@Autowired
	private ISendService sendService;

	private Logger logger = Logger.getLogger(SendServiceQuartzJob.class);

	public ReSendServiceQuartzJob() {
	}

	public void execute() {
		// 运行JOB的方法
		try {
			sendService.reSendSeviceQuartzJob();
		} catch (InterruptedException e) {
			e.printStackTrace();
			logger.error(e);
		}
	}

}
