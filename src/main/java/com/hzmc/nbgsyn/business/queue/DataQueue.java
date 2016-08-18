package com.hzmc.nbgsyn.business.queue;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

import com.hzmc.nbgsyn.pojo.IncMdDataList;
import com.hzmc.nbgsyn.pojo.RequestLog;

/**
 * 线程集合类
 * 
 * @author tfchen
 *
 */
public class DataQueue {
	// 创建一个线程安全的queue
	private static Queue<IncMdDataList> incMdDataLists = new ConcurrentLinkedQueue<IncMdDataList>();

	private static Queue<RequestLog> requestLogs = new ConcurrentLinkedQueue<RequestLog>();

	/**
	 * @return the incMdDataLists
	 */
	public static Queue<IncMdDataList> getIncMdDataLists() {
		return incMdDataLists;
	}

	/**
	 * @return the requestLogs
	 */
	public static Queue<RequestLog> getRequestLogs() {
		return requestLogs;
	}

}
