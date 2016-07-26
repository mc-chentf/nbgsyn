package com.hzmc.nbgsyn.business.dao.impl;

import java.util.HashMap;

import org.springframework.stereotype.Service;

import com.hzmc.nbgsyn.business.dao.IMapBaseDao;

/**
 * 
 * @author tfche
 *
 */
@Service
public class MapBaseDaoImpl extends BaseDao implements IMapBaseDao {

	@Override
	public Integer getMaxIdByCondition(HashMap<String, Object> par) {
		// TODO Auto-generated method stub
		return (Integer) this.getSqlMapClientTemplate().queryForObject("getMaxIdByCondition", par);
	}

}
