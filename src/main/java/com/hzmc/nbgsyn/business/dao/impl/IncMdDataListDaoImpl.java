package com.hzmc.nbgsyn.business.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.hzmc.nbgsyn.business.dao.IIncMdDataListDao;
import com.hzmc.nbgsyn.pojo.IncMdDataList;

/**
 * 
 * @author tfche
 *
 */
@Service
@Scope("prototype")
public class IncMdDataListDaoImpl extends BaseDao implements IIncMdDataListDao {

	public IncMdDataListDaoImpl() {
	}

	@Override
	public synchronized void modifyIncMdDataList(IncMdDataList incMdDataList) {
		incMdDataList.setType(incMdDataList.getType());
		incMdDataList.setSendThread(Thread.currentThread().getName());
		this.getSqlMapClientTemplate().update("modifyIncMdDataList", incMdDataList);
	}

	@Override
	public List<IncMdDataList> findIncMdDataListsByCondition(IncMdDataList incMdDataList) {
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<IncMdDataList> findIncMdDataListsByDateAndCountAndType(Date date, Integer count, String type) {
		HashMap<String, Object> par = new HashMap<String, Object>();
		par.put("now", date);
		par.put("count", count);
		par.put("type", type);
		List<IncMdDataList> res = this.getSqlMapClientTemplate().queryForList("findIncMdDataListsByDateAndCountAndType", par);
		if (res != null && res.size() != 0) {
			// 取出ids
			List<Integer> ids = new ArrayList<Integer>();
			for (IncMdDataList temp : res) {
				ids.add(temp.getId());
			}
			this.getSqlMapClientTemplate().update("modifyIncMdDataListStatusPrepareByIds", ids);
		}
		return res;
	}

}
