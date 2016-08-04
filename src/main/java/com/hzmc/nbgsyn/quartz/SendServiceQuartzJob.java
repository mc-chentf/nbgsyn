package com.hzmc.nbgsyn.quartz;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import com.hzmc.nbgsyn.service.ISendService;

/**
 * 用于下发的定时任务
 * 
 * @author tfche
 *
 */
public class SendServiceQuartzJob {

	private int counter;

	@Autowired
	private ISendService sendService;

	public SendServiceQuartzJob() {
		// TODO Auto-generated constructor stub
	}

	public void execute() {

		sendService.sendSeviceQuartzJob();

		long ms = System.currentTimeMillis();
		System.out.println("\t\t" + new Date(ms));
		System.out.println("(" + counter++ + ")");
		// 运行JOB的方法
	}
}
