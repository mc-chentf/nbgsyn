package com.hzmc.nbgsyn.business.queue;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

import com.hzmc.nbgsyn.pojo.IncMdDataList;

/**
 * 线程集合类
 * 
 * @author tfchen
 *
 */
public class DataQueue {
	// 创建一个线程安全的queue
	private static Queue<IncMdDataList> incMdDataLists = new ConcurrentLinkedQueue<IncMdDataList>();

	/**
	 * @return the incMdDataLists
	 */
	public static Queue<IncMdDataList> getIncMdDataLists() {
		return incMdDataLists;
	}

}
