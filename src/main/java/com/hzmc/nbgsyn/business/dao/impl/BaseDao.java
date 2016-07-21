package com.hzmc.nbgsyn.business.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.ibatis.sqlmap.client.SqlMapClient;

/**
 * 加载sqlmapclient的类 很重要
 * 
 * @author tfche 2016年7月19日11:31:16
 */
public class BaseDao extends SqlMapClientDaoSupport {
	@Autowired
	public void setSqlMapClientForAutowire(SqlMapClient sqlMapClient) {
		super.setSqlMapClient(sqlMapClient);
	}

}
