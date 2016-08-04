package com.hzmc.nbgsyn.business.dao.impl;

import java.util.List;

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

	@SuppressWarnings("unchecked")
	@Override
	public List<EntityView> findAllEntityViews() {
		// TODO Auto-generated method stub
		return (List<EntityView>) this.getSqlMapClientTemplate().queryForList("findAllEntityViews");
	}

}
