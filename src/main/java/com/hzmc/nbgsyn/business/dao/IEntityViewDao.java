package com.hzmc.nbgsyn.business.dao;

import java.util.List;

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

	/**
	 * 查找所有的entityView
	 */
	public List<EntityView> findAllEntityViews();
}
