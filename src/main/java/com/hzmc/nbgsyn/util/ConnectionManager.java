package com.hzmc.nbgsyn.util;


import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.log4j.Logger;


/**
 * 数据库连接类
 * 
 */
public class ConnectionManager {

	private static ConnectionManager	instance	= null;
	private BasicDataSource 			ds;
	private static final Logger			logger		= Logger.getLogger(ConnectionManager.class);

	/**
	 * 设置连接参数 InitialPoolSize:10 MaxPoolSize:30
	 */
	private ConnectionManager() {
		try {
			Property property = new Property();
			property.getJDBCProperties("system.properties");
			ds = new BasicDataSource();
			ds.setDriverClassName(Property.driverClass);
			ds.setUrl(Property.jdbcUrl);
			ds.setUsername(Property.user);
			ds.setPassword(Property.password);
			ds.setInitialSize(Property.initialPoolSize);
			ds.setMaxActive(Property.maxPoolSize);
			ds.setMinIdle(Property.minPoolSize);
			ds.setTestOnBorrow(true);
/*			ds.setJdbcUrl(Property.jdbcUrl);
			ds.setUser(Property.user);
			ds.setPassword(Property.password);
			ds.setInitialPoolSize(Property.initialPoolSize);
			ds.setMaxPoolSize(Property.maxPoolSize);
			ds.setMinPoolSize(Property.minPoolSize);
			// 定义在从数据库获取新连接失败后重复尝试的次数
			ds.setAcquireRetryAttempts(2147483647);
			//两次连接中间隔时间，单位毫秒
			ds.setAcquireRetryDelay(60000);
			// 每次连接验证连接是否可用
			ds.setTestConnectionOnCheckout(true);*/
		} catch (PropertyVetoException e) {
			e.printStackTrace();
			logger.error("ConnectionManager.ConnectionManager():" + e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 取得数据库实例
	 * 
	 * @return instance
	 */
	public static final ConnectionManager getInstance() {
		if (instance == null) {
			try {
				instance = new ConnectionManager();
			} catch (Exception e) {
				e.printStackTrace();
				logger.error("ConnectionManager.getInstance():" + e.getMessage());
			}
		}
		return instance;
	}

	/**
	 * 取得数据库连接
	 * 
	 * @return 数据库连接
	 */
	public synchronized final Connection getConnection() {
		try {
			return ds.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
			logger.error("ConnectionManager.getConnection():" + e.getMessage());
		}
		return null;
	}
}
