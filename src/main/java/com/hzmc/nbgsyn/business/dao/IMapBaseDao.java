package com.hzmc.nbgsyn.business.dao;

import java.util.HashMap;

/**
 * 
 * @author tfche
 *
 */
public interface IMapBaseDao {
	public Integer getMaxIdByCondition(HashMap<String,Object> par);
}
