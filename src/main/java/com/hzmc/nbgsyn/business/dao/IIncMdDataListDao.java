package com.hzmc.nbgsyn.business.dao;

import java.util.List;

import com.hzmc.nbgsyn.pojo.IncMdDataList;

/**
 * 
 * @author chentf
 *
 */
public interface IIncMdDataListDao {

	// 修改
	public void modifyIncMdDataList(IncMdDataList incMdDataList);

	// 查找
	public List<IncMdDataList> findIncMdDataListsByCondition(IncMdDataList incMdDataList);

}
