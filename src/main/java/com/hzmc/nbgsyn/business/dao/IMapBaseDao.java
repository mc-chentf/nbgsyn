package com.hzmc.nbgsyn.business.dao;

import java.util.HashMap;

/**
 * 
 * @author tfche
 *
 */
public interface IMapBaseDao {

	public Integer getMaxIdByCondition(HashMap<String, Object> par);

	/**
	 * 获取seq的下一个值
	 * @param seqName
	 * @return
	 */
	public Integer getSeqNextVal(String seqName);
	
}
