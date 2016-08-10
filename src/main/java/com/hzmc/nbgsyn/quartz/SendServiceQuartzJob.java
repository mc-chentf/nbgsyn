package com.hzmc.nbgsyn.quartz;

import org.springframework.beans.factory.annotation.Autowired;

import com.hzmc.nbgsyn.service.ISendService;

/**
 * 用于下发的定时任务
 * 
 * @author tfche
 *
 */
public class SendServiceQuartzJob {

	@Autowired
	private ISendService sendService;

	public SendServiceQuartzJob() {
		// TODO Auto-generated constructor stub
	}

	public void execute() {
		// 运行JOB的方法
		sendService.sendSeviceQuartzJob();
	}
}
