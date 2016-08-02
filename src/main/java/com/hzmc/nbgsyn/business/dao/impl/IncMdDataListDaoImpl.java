package com.hzmc.nbgsyn.business.dao.impl;

import java.util.List;

import com.hzmc.nbgsyn.business.dao.IIncMdDataListDao;
import com.hzmc.nbgsyn.pojo.IncMdDataList;

public class IncMdDataListDaoImpl extends BaseDao implements IIncMdDataListDao {

	public IncMdDataListDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void modifyIncMdDataList(IncMdDataList incMdDataList) {
		// TODO Auto-generated method stub
		this.getSqlMapClientTemplate().update("modifyIncMdDataList", incMdDataList);
	}

	@Override
	public List<IncMdDataList> findIncMdDataListsByCondition(IncMdDataList incMdDataList) {
		// TODO Auto-generated method stub
		return null;
	}

}
