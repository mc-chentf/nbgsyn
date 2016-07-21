package com.hzmc.nbgsyn.business.dao.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hzmc.nbgsyn.business.dao.IMapBaseDao;
import com.hzmc.nbgsyn.pojo.EntityView;
import com.hzmc.nbgsyn.pojo.MapBase;

/**
 * 
 * @author tfche
 *
 */
@Service
public class MapBaseDaoImpl extends BaseDao implements IMapBaseDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<MapBase> getMapBasesByCondition(EntityView entityView) {
		// TODO Auto-generated method stub
		return this.getSqlMapClientTemplate().queryForList("getMapBasesByConditionForMapping", entityView);
	}

}
