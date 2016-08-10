package com.hzmc.nbgsyn.service;

import com.hzmc.nbgsyn.exception.TalendException;
import com.hzmc.nbgsyn.persistence.ApplyDate;
import com.hzmc.nbgsyn.persistence.ResultBean;
import com.hzmc.nbgsyn.pojo.EntityView;
import com.mchz.nbg.talendservice.WSItem;

import net.sf.json.JSONArray;

public interface ITalendService {

	public String talendSaveOrUpdateWS(String type, String model, String cluster, String xmls, String source) throws TalendException;

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

	/**
	 * 
	 * @param dataList
	 * @param entityView
	 * @param model
	 * @throws TalendException
	 */
	public void getRalteInfoDateList(JSONArray dataList, EntityView entityView, String model) throws TalendException;

	/**
	 * 
	 * @param model
	 * @param entityName
	 * @param pkvalue
	 * @return
	 * @throws TalendException
	 */
	public WSItem getItemInfoInTalend(String model, String entityName, String pkvalue) throws TalendException;

}
