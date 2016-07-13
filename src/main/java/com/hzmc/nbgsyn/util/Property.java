package com.hzmc.nbgsyn.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class Property {
	
	public static String driverClass;
	public static String jdbcUrl;
	public static String user;
	public static String password;
	public static int initialPoolSize;
	public static int maxPoolSize;
	public static int minPoolSize;
	public static boolean isSaveResult;
	
	
	public void getJDBCProperties(String fileName) throws Exception{
		Properties p = new Properties();
		InputStream in = Property.class.getClassLoader().getResourceAsStream(fileName);
		p.load(in);
		in.close();
		driverClass = getValue(p, "driverClass");
		jdbcUrl = getValue(p, "jdbcUrl");
		user = getValue(p, "user");
		password = getValue(p, "password");
		initialPoolSize = Integer.valueOf(getValue(p, "initialPoolSize"));
		maxPoolSize = Integer.valueOf(getValue(p, "maxPoolSize"));
		minPoolSize = Integer.valueOf(getValue(p, "minPoolSize"));
	}
	
	public static Properties getSystemProperties(){
		Properties p = new Properties();
		InputStream in = Property.class.getClassLoader().getResourceAsStream("system.properties");
		try {
			p.load(in);
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p;
	}
	
	private String getValue(Properties p,String s){
		String r = "";
		if (p.containsKey(s)) {
			 r = p.getProperty(s);
		}
		return r;
	}
}
