package com.hzmc.nbgsyn.service;

import com.hzmc.nbgsyn.exception.TalendException;
import com.hzmc.nbgsyn.persistence.ApplyDate;
import com.hzmc.nbgsyn.persistence.ResultBean;

public interface TalendService {

	public String talendSaveOrUpdateWS(String type, String model, String cluster, String xmls) throws TalendException;

	/**
	 * 保存数据
	 * 
	 * @param applyDate
	 * @return
	 */
	public ResultBean saveApplyDate(ApplyDate applyDate);

	/**
	 * 删除数据
	 * 
	 * @param applyDate
	 * @return
	 */
	public ResultBean removeApplyDate(ApplyDate applyDate);

	/**
	 * 更新数据
	 * 
	 * @param applyDate
	 * @return
	 */
	public ResultBean updateApplyDate(ApplyDate applyDate);

	/**
	 * 查找数据
	 * 
	 * @param applyDate
	 * @return
	 */
	public ResultBean findApplyDate(ApplyDate applyDate);

}
