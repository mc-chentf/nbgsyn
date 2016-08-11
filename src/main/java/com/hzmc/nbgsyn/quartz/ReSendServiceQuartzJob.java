package com.hzmc.nbgsyn.quartz;

import org.springframework.beans.factory.annotation.Autowired;

import com.hzmc.nbgsyn.service.ISendService;

public class ReSendServiceQuartzJob {
	@Autowired
	private ISendService sendService;

	public ReSendServiceQuartzJob() {
	}

	public void execute() {
		// 运行JOB的方法
		sendService.reSendSeviceQuartzJob();
	}

}
