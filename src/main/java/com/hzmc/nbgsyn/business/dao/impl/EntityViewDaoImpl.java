package com.hzmc.nbgsyn.business.dao.impl;

import org.springframework.stereotype.Service;

import com.hzmc.nbgsyn.business.dao.IEntityViewDao;
import com.hzmc.nbgsyn.pojo.EntityView;

/**
 * 
 * @author tfche
 *
 */
@Service
public class EntityViewDaoImpl extends BaseDao implements IEntityViewDao {

	@Override
	public EntityView findEntityViewByEntityName(String entityName) {
		// TODO Auto-generated method stub
		return (EntityView) this.getSqlMapClientTemplate().queryForObject("findEntityViewByEntityName", entityName);
	}

}
