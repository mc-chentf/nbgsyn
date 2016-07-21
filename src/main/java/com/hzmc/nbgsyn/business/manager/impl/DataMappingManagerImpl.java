package com.hzmc.nbgsyn.business.manager.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hzmc.nbgsyn.business.dao.IMapBaseDao;
import com.hzmc.nbgsyn.business.dao.impl.BaseDao;
import com.hzmc.nbgsyn.business.manager.IDataMappingManager;
import com.hzmc.nbgsyn.pojo.EntityView;
import com.hzmc.nbgsyn.pojo.MapBase;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * 映射实现类
 * 
 * @author tfche 2016年7月20日10:05:28
 */
@Service
public class DataMappingManagerImpl extends BaseDao implements IDataMappingManager {

	@Autowired
	private IMapBaseDao mapBaseDao;

	@Override
	public void getLocalCodeDataList(JSONArray dataList, EntityView entityView) {
		// TODO Auto-generated method stub
		List<String> mdValues = new ArrayList<String>();
		// 循环ja
		// 拿出 ja中需要映射的字段 组成list
		for (int i = 0; i < dataList.size(); i++) {
			JSONObject jo = dataList.getJSONObject(i);
			mdValues.add(jo.getString(entityView.getMappingCloumn()));
		}
		// 根据list以及 entityView的信息 找出映射
		entityView.setMdValues(mdValues);
		List<MapBase> mapBases = mapBaseDao.getMapBasesByCondition(entityView);
		// 组装到ja中

	}

	@Override
	public void getRalteInfoDateList(JSONArray dataList, EntityView entityView) {
		// TODO Auto-generated method stub
		List<String> pks = new ArrayList<String>();

		// 循环ja
		// 拿ja 中的ids
		for (int i = 0; i < dataList.size(); i++) {
			JSONObject jo = dataList.getJSONObject(i);
			JSONArray jsonArray = jo.getJSONArray(entityView.getEntityFk());
			String foreignKey = jsonArray.getString(0);
			pks.add(foreignKey);
		}

		// 根据ids 去 talend 中 找到相应的数据块
		// 组装

	}

}
