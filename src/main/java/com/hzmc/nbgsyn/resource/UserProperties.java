package com.hzmc.nbgsyn.resource;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * 用户读取user的信息
 * 
 * @author chentf
 *
 *         2016年7月12日
 */
public class UserProperties {

	private Properties prop = new Properties();

	private static UserProperties properties;

	private UserProperties() {
		// TODO Auto-generated constructor stub
		try {
			prop.load(this.getClass().getResourceAsStream("/userInfo.properties"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static UserProperties getInstacne() {
		if (properties == null)
			properties = new UserProperties();
		return properties;
	}

	public String getProperty(String key) {
		return prop.getProperty(key);
	}

}
