package com.hzmc.nbgsyn.servlet;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author tfchen 2016年7月11日15:10:12
 */
public class WebServiceListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("tomcat启动………………");
		@SuppressWarnings("unused")
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(
				"/applicationContext.xml");
	}

	public static void main(String[] args) {
		WebServiceListener listener = new WebServiceListener();
		listener.contextInitialized(null);
	}
}
