package com.hzmc.nbgsyn.quartz;

import java.util.Date;

/**
 * 用于下发的定时任务
 * 
 * @author tfche
 *
 */
public class SendServiceQuartzJob {

	private int counter;

	public SendServiceQuartzJob() {
		// TODO Auto-generated constructor stub
	}

	public void execute() {
		long ms = System.currentTimeMillis();
		System.out.println("\t\t" + new Date(ms));
		System.out.println("(" + counter++ + ")");
	}
}
