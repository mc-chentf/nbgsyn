package com.hzmc.nbgsyn.business.manager;

import com.hzmc.nbgsyn.pojo.EntityView;

import net.sf.json.JSONArray;

/**
 * 用于数据映射
 * 
 * @author tfche 2016年7月20日09:20:52
 */
public interface IDataMappingManager {
	/**
	 * 获取映射代码
	 */
	public void getLocalCodeDataList(JSONArray dataList, EntityView entityView);

	/**
	 * 组合外键的信息
	 * 
	 * @param dataList
	 * @param entityView
	 */
	public void getRalteInfoDateList(JSONArray dataList, EntityView entityView);
}
