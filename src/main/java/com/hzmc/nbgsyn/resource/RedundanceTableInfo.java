package com.hzmc.nbgsyn.resource;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.StringTokenizer;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class RedundanceTableInfo {
	private Properties prop = new Properties();

	private static RedundanceTableInfo redundanceTableInfo;

	private HashMap<String, HashSet<String>> redundance = new HashMap<String, HashSet<String>>();

	private Long iniTime;

	private RedundanceTableInfo() {
		init();
	}

	public static RedundanceTableInfo getInstacne() {
		if (redundanceTableInfo == null)
			redundanceTableInfo = new RedundanceTableInfo();
		return redundanceTableInfo;
	}

	/**
	 * @return the redundance
	 */
	public HashMap<String, HashSet<String>> getRedundance() {
		Date now = new Date();
		if (now.getTime() - iniTime > 5 * 3600) {
			// 重新加载
			this.init();
		}
		return redundance;
	}

	private void init() {
		// TODO Auto-generated constructor stub
		try {
			prop.load(this.getClass().getResourceAsStream("/redundance.properties"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 循环配置文件
		Iterator<Object> iterator = prop.keySet().iterator();
		while (iterator.hasNext()) {
			String key = (String) iterator.next();
			String value = prop.getProperty(key);
			StringTokenizer stringTokenizer = new StringTokenizer(value, ",");
			HashSet<String> strings = new HashSet<String>();
			while (stringTokenizer.hasMoreElements()) {
				String temp = stringTokenizer.nextToken();
				strings.add(temp);
			}
			redundance.put(key, strings);
		}

		Date now = new Date();
		iniTime = now.getTime();
	}

}
