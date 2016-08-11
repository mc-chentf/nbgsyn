package com.hzmc.nbgsyn.resource;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * 
 * @author chentf
 *
 *         2016年7月13日
 */
public class EntityKeyProperties {

	private Properties prop = new Properties();

	private static EntityKeyProperties properties;

	private EntityKeyProperties() {
		try {
			prop.load(this.getClass().getResourceAsStream("/entityKey.properties"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static EntityKeyProperties getInstacne() {
		if (properties == null)
			properties = new EntityKeyProperties();
		return properties;
	}

	public String getProperty(String key) {
		return prop.getProperty(key);
	}

}
