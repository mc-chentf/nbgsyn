package com.hzmc.nbgsyn.business.dao;

import com.hzmc.nbgsyn.pojo.EntityView;

/**
 * 
 * @author tfche
 *
 */
public interface IEntityViewDao {
	/**
	 * 根据entity name 查找entityview
	 * 
	 * @param entityName
	 * @return
	 */
	public EntityView findEntityViewByEntityName(String entityName);
}
