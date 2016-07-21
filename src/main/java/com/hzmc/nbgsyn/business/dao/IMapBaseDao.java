package com.hzmc.nbgsyn.business.dao;

import java.util.List;

import com.hzmc.nbgsyn.pojo.EntityView;
import com.hzmc.nbgsyn.pojo.MapBase;

/**
 * 
 * @author tfche
 *
 */
public interface IMapBaseDao {
	public List<MapBase> getMapBasesByCondition(EntityView entityView);
}
