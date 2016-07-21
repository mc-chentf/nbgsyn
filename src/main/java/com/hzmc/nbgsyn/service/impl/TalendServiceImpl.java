package com.hzmc.nbgsyn.service.impl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import javax.xml.ws.BindingProvider;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hzmc.nbgsyn.business.dao.IEntityViewDao;
import com.hzmc.nbgsyn.enums.MsgEnum;
import com.hzmc.nbgsyn.exception.TalendException;
import com.hzmc.nbgsyn.persistence.ApplyDate;
import com.hzmc.nbgsyn.persistence.ResultBean;
import com.hzmc.nbgsyn.persistence.ResultInfo;
import com.hzmc.nbgsyn.pojo.EntityView;
import com.hzmc.nbgsyn.service.TalendService;
import com.hzmc.nbgsyn.util.Constant;
import com.hzmc.nbgsyn.util.XmlStrToJsonUtil;
import com.mchz.nbg.talendservice.TMDMService;
import com.mchz.nbg.talendservice.TMDMService_Service;
import com.mchz.nbg.talendservice.WSDataClusterPK;
import com.mchz.nbg.talendservice.WSDataModelPK;
import com.mchz.nbg.talendservice.WSDeleteItem;
import com.mchz.nbg.talendservice.WSGetItems;
import com.mchz.nbg.talendservice.WSItemPK;
import com.mchz.nbg.talendservice.WSPutItem;
import com.mchz.nbg.talendservice.WSPutItemWithReport;
import com.mchz.nbg.talendservice.WSStringPredicate;
import com.mchz.nbg.talendservice.WSWhereCondition;
import com.mchz.nbg.talendservice.WSWhereItem;
import com.mchz.nbg.talendservice.WSWhereOperator;
import com.mchz.nbg.talendservice.WSWhereOr;

import net.sf.json.JSON;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Service
public class TalendServiceImpl implements TalendService {

	private Logger log = Logger.getLogger(TalendServiceImpl.class);

	private final String S_URL = Constant.S_URL;

	private final static URL WSDL_LOCATION;

	static {
		URL url = null;
		try {
			url = new URL(Constant.WS_URL);
		} catch (MalformedURLException e) {
			java.util.logging.Logger.getLogger(TMDMService_Service.class.getName()).log(java.util.logging.Level.INFO, "Can not initialize the default wsdl from {0}",
					"file:/d:/talend/soap.wsdl");
		}
		WSDL_LOCATION = url;
	}

	@Autowired
	private IEntityViewDao entityViewDao;

	/**
	 * 
	 * @param type
	 * @param model
	 *            entity
	 * @param cluster
	 *            entity
	 * @param xmls
	 * @return
	 * @throws TalendException
	 */
	public String talendSaveOrUpdateWS(String type, String model, String cluster, String xmls) throws TalendException {

		String rtnMessage = "";
		try {
			TMDMService_Service tws = new TMDMService_Service(WSDL_LOCATION);
			TMDMService port = tws.getTMDMPort();
			BindingProvider bp = (BindingProvider) port;
			bp.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, "administrator");
			bp.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, "administrator");
			bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, S_URL);

			WSPutItem item = new WSPutItem();
			WSDataModelPK dp = new WSDataModelPK();
			WSDataClusterPK dc = new WSDataClusterPK();
			dc.setPk(cluster);
			dp.setPk(model);
			item.setWsDataModelPK(dp);
			item.setWsDataClusterPK(dc);
			if ("U".equals(type)) {
				item.setIsUpdate(true);
			} else {
				item.setIsUpdate(false);
			}
			item.setXmlString(xmls);
			WSPutItemWithReport itemrp = new WSPutItemWithReport();
			itemrp.setSource("cbos-call");
			itemrp.setWsPutItem(item);
			itemrp.setInvokeBeforeSaving(true);

			rtnMessage = port.putItemWithReport(itemrp).getIds().toString();
		} catch (Exception e) {
			e.printStackTrace();
			// 扔出异常
			log.error(e);
			throw new TalendException("talend调用错误" + e.getMessage());
		}

		return rtnMessage;
	}

	private List<String> getItemsInfoInTalend(String model, String entityName, Integer limitStart, Integer limit) throws TalendException {
		List<String> res = new ArrayList<String>();

		TMDMService_Service tws = new TMDMService_Service(WSDL_LOCATION);
		TMDMService port = tws.getTMDMPort();
		BindingProvider bp = (BindingProvider) port;

		WSDataClusterPK dc = new WSDataClusterPK();
		dc.setPk(model);

		WSGetItems wsGetItems = new WSGetItems();
		wsGetItems.setConceptName(entityName);
		wsGetItems.setMaxItems(limit);
		wsGetItems.setSkip(limitStart);
		wsGetItems.setSpellTreshold(-1);
		wsGetItems.setTotalCountOnFirstResult(true);
		wsGetItems.setWsDataClusterPK(dc);

		bp.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, "administrator");
		bp.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, "administrator");
		bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, S_URL);
		try {
			res = port.getItems(wsGetItems).getStrings();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			// 扔出异常
			log.error(e);
			throw new TalendException("talend调用错误" + e.getMessage());
		}

		return res;
	}

	private String talendDeleteWS(String inType, String model, String cluster, String xmls) throws TalendException {
		// TODO Auto-generated method stub
		String rtnMessage = "";
		try {
			Document document = DocumentHelper.parseText(xmls);
			Element root = document.getRootElement();
			String entity = root.getName();
			String pkValue = root.getStringValue();

			TMDMService_Service tws = new TMDMService_Service(WSDL_LOCATION);
			TMDMService port = tws.getTMDMPort();
			BindingProvider bp = (BindingProvider) port;
			bp.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, "administrator");
			bp.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, "administrator");
			bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, S_URL);

			WSDataClusterPK wsDataClusterPK = new WSDataClusterPK();
			wsDataClusterPK.setPk(model);
			WSItemPK wsItemPK = new WSItemPK();
			wsItemPK.setConceptName(entity);
			wsItemPK.setWsDataClusterPK(wsDataClusterPK);
			wsItemPK.getIds().add(pkValue);

			WSDeleteItem wsDeleteItem = new WSDeleteItem();
			wsDeleteItem.setWsItemPK(wsItemPK);
			wsDeleteItem.setInvokeBeforeDeleting(true);
			wsDeleteItem.setOverride(true);
			wsDeleteItem.setSource("NBGSYN");
			wsDeleteItem.setWithReport(true);

			rtnMessage = port.deleteItem(wsDeleteItem).getIds().toString();
		} catch (Exception e) {
			e.printStackTrace();
			// 扔出异常
			log.error(e);
			throw new TalendException("talend调用错误" + e.getMessage());
		}
		return rtnMessage;
	}

	@Override
	public ResultBean saveApplyDate(ApplyDate applyDate) {
		// TODO Auto-generated method stub
		return toTalend(applyDate, "C");
	}

	@Override
	public ResultBean removeApplyDate(ApplyDate applyDate) {
		// TODO Auto-generated method stub
		return toTalend(applyDate, "D");
	}

	@Override
	public ResultBean updateApplyDate(ApplyDate applyDate) {
		// TODO Auto-generated method stub
		return toTalend(applyDate, "U");
	}

	@Override
	public ResultBean findApplyDate(ApplyDate applyDate) {
		// TODO Auto-generated method stub
		ResultBean res = new ResultBean(MsgEnum.SUCCESS.getMsgId(), MsgEnum.SUCCESS.getMsgDesc());
		String model = applyDate.getModel();
		String entityName = applyDate.getEntity();

		EntityView entityView = entityViewDao.findEntityViewByEntityName(entityName);
		if (entityView == null) {
			res.setMsgId(MsgEnum.ENTITYKEY_NOTFOUND.getMsgId());
			res.setMsgDesc(MsgEnum.ENTITYKEY_NOTFOUND.getMsgDesc() + ":" + entityName);
			return res;
		}

		// 根据entityName获取对象映射的封装
		// ---------------------- 暂时 这样 最后讨论从配置文件还是从数据库找出来 ---------------------

		Integer page = applyDate.getPage();
		Integer pageSize = applyDate.getPagesize();

		page = page <= 0 ? 1 : page;
		pageSize = (pageSize <= 0 || pageSize > 500) ? 500 : pageSize;

		Integer limitStart = (page - 1) * pageSize;
		Integer limit = pageSize;
		List<String> date = new ArrayList<String>();
		try {
			date = this.getItemsInfoInTalend(model, entityName, limitStart, limit);
		} catch (TalendException e) {
			// TODO Auto-generated catch block
			// 处理异常
			e.printStackTrace();
			String msg = e.getMessage();
			if (msg.length() > 100) {
				msg = msg.substring(0, 100);
			}
			res.setMsgId(MsgEnum.READDAT_FAIL.getMsgId());
			res.setMsgDesc(MsgEnum.READDAT_FAIL.getMsgDesc() + ",详情:" + msg);
			return res;
		}

		HashMap<String, Object> result = res.getResult();
		JSONArray dataList = new JSONArray();

		// 解析data
		Iterator<String> iterator = date.iterator();
		while (iterator.hasNext()) {
			String talendStr = iterator.next();
			// 使用dom4j解析
			JSON json = XmlStrToJsonUtil.xmlStrToJson(talendStr);
			// 总记录数
			if (json instanceof JSONArray) {
				int totalCount = ((JSONArray) json).getInt(0);
				result.put("total", totalCount);
				// 计算totalPage
				int totalPage = (totalCount + pageSize - 1) / pageSize;
				result.put("totalpage", totalPage);
				result.put("pagesize", pageSize);
				result.put("page", page);
				result.put("isMore", page == totalPage ? "N" : "Y");
			}
			// 每条数据
			else if (json instanceof JSONObject) {
				JSONObject jo = (JSONObject) json;
				@SuppressWarnings("unchecked")
				Iterator<String> joIterator = jo.keys();
				while (joIterator.hasNext()) {
					String key = joIterator.next();
					dataList.add(jo.getJSONObject(key));
				}
			}
		}

		// 给dataList加入外键信息 目前 只和一个外键表关联
		if (StringUtils.equals("Y", entityView.getIsRalate())) {
			try {
				this.getRalteInfoDateList(dataList, entityView, model);
			} catch (TalendException e) {
				// TODO Auto-generated catch block
				// 处理异常
				e.printStackTrace();
				String msg = e.getMessage();
				if (msg.length() > 100) {
					msg = msg.substring(0, 100);
				}
				res.setMsgId(MsgEnum.READDAT_FAIL.getMsgId());
				res.setMsgDesc(MsgEnum.READDAT_FAIL.getMsgDesc() + ",详情:" + msg);
				return res;
			}
		}

		// 给dataList加入localCode
		// if (StringUtils.equals("Y", entityView.getHasLocalCode())) {
		// dataMappingManager.getLocalCodeDataList(dataList, entityView);
		// }
		result.put("dataList", dataList);
		return res;
	}

	private void getRalteInfoDateList(JSONArray dataList, EntityView entityView, String model) throws TalendException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		List<String> pks = new ArrayList<String>();

		// 循环ja
		// 拿ja 中的ids
		for (int i = 0; i < dataList.size(); i++) {
			JSONObject jo = dataList.getJSONObject(i);
			JSONArray jsonArray = jo.getJSONArray(entityView.getEntityFk());
			String foreignKey = jsonArray.getString(0);
			jo.remove(entityView.getEntityFk());
			jo.put(entityView.getEntityFk(), foreignKey);
			pks.add(foreignKey);
		}

		// 组装wswhereItem的搜索条件
		WSWhereItem wsWhereItem = new WSWhereItem();
		WSWhereOr wsWhereOr = new WSWhereOr();
		for (String temp : pks) {
			WSWhereItem tempWsWhereItem = new WSWhereItem();
			WSWhereCondition tempWsWhereCondition = new WSWhereCondition();
			tempWsWhereCondition.setLeftPath(entityView.getForeignEntityKey());
			tempWsWhereCondition.setOperator(WSWhereOperator.EQUALS);
			tempWsWhereCondition.setRightValueOrPath(temp);
			tempWsWhereCondition.setSpellCheck(true);
			tempWsWhereCondition.setStringPredicate(WSStringPredicate.NONE);
			tempWsWhereItem.setWhereCondition(tempWsWhereCondition);
			wsWhereOr.getWhereItems().add(tempWsWhereItem);
		}
		wsWhereItem.setWhereOr(wsWhereOr);

		// 根据ids 去 talend 中 找到相应的数据块
		List<String> date = this.getItemsInfoInTalendByCondition(model, entityView.getForeignEntityName(), 0, pks.size(), wsWhereItem);

		JSONArray pkDataList = new JSONArray();
		// 处理返回的信息
		Iterator<String> iterator = date.iterator();
		while (iterator.hasNext()) {
			String talendStr = iterator.next();
			// 使用dom4j解析
			JSON json = XmlStrToJsonUtil.xmlStrToJson(talendStr);
			if (json instanceof JSONObject) {
				JSONObject jo = (JSONObject) json;
				@SuppressWarnings("unchecked")
				Iterator<String> joIterator = jo.keys();
				while (joIterator.hasNext()) {
					String key = joIterator.next();
					pkDataList.add(jo.getJSONObject(key));
				}
			}
		}
		System.out.println(dataList);
		System.out.println(pkDataList);
		// 组装
		// 循环dataList // 查找数据 // 合并jo
		for (int i = 0; i < dataList.size(); i++) {
			JSONObject jo = dataList.getJSONObject(i);
			// 获取PK
			String foreignKey = jo.getString(entityView.getEntityFk());
			// 循环 外键的data
			for (int j = 0; j < pkDataList.size(); j++) {
				JSONObject fkJo = pkDataList.getJSONObject(j);
				String fkJoPk = fkJo.getString(entityView.getForeignEntityKey());
				if (StringUtils.equals(fkJoPk, foreignKey))
					jo.putAll(fkJo);
			}
		}

		System.out.println(dataList);

	}

	private List<String> getItemsInfoInTalendByCondition(String model, String entityName, Integer limitStart, Integer limit, WSWhereItem whereItem)
			throws TalendException {
		List<String> res = new ArrayList<String>();

		TMDMService_Service tws = new TMDMService_Service(WSDL_LOCATION);
		TMDMService port = tws.getTMDMPort();
		BindingProvider bp = (BindingProvider) port;

		WSDataClusterPK dc = new WSDataClusterPK();
		dc.setPk(model);

		WSGetItems wsGetItems = new WSGetItems();
		wsGetItems.setConceptName(entityName);
		wsGetItems.setMaxItems(limit);
		wsGetItems.setSkip(limitStart);
		wsGetItems.setSpellTreshold(-1);
		wsGetItems.setTotalCountOnFirstResult(true);
		wsGetItems.setWsDataClusterPK(dc);
		wsGetItems.setWhereItem(whereItem);

		bp.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, "administrator");
		bp.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, "administrator");
		bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, S_URL);
		try {
			res = port.getItems(wsGetItems).getStrings();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			// 扔出异常
			log.error(e);
			throw new TalendException("talend调用错误" + e.getMessage());
		}

		return res;
	}

	private ResultBean toTalend(ApplyDate applyDate, String type) {
		ResultBean res = new ResultBean(MsgEnum.SUCCESS.getMsgId(), MsgEnum.SUCCESS.getMsgDesc());

		String entity = applyDate.getEntity();
		String inType = type;
		String model = applyDate.getModel();
		String cluster = model;

		// 数据的array
		JSONArray jsonArray = applyDate.getData();
		// 对应每一个data的返回信息
		List<ResultInfo> resultInfos = new ArrayList<ResultInfo>();
		// 遍历数据
		for (int i = 0; i < jsonArray.size(); i++) {
			ResultInfo temp = new ResultInfo("success", "");
			JSONObject dataInfo = (JSONObject) jsonArray.get(i);
			// 组装xmls
			Element root = DocumentHelper.createElement(entity);
			Document document = DocumentHelper.createDocument(root);
			@SuppressWarnings("unchecked")
			Iterator<String> iterator = dataInfo.keys();
			while (iterator.hasNext()) {
				String key = iterator.next().toString();
				root.addElement(key).addText(dataInfo.getString(key));
			}
			String xmls = document.getRootElement().asXML();
			try {
				// 调用toTalendDetail
				String primaryKey = "";
				if (inType.equals("D")) {
					primaryKey = talendDeleteWS(inType, model, cluster, xmls);
					temp.setMsg("调用成功,删除的主键为" + primaryKey);
				} else {
					primaryKey = talendSaveOrUpdateWS(inType, model, cluster, xmls);
					temp.setMsg("调用成功,主键为" + primaryKey);
				}
			} catch (TalendException e) {
				// 处理异常 截取错误
				String msg = e.getMessage();
				if (msg.length() > 100) {
					msg = msg.substring(0, 100);
				}
				temp.setMsg("调用talend失败,详情:" + msg);
				temp.setSuccess("fail");
			}
			resultInfos.add(temp);
		}
		res.getResult().put("resultInfos", resultInfos);
		MsgEnum resEnum = generateMsgEnumByResultInfos(resultInfos);
		res.setMsgId(resEnum.getMsgId());
		res.setMsgDesc(resEnum.getMsgDesc());
		return res;
	}

	/**
	 * 根据 resultInfos 来判断成功 部分成功 失败
	 * 
	 * @param resultInfos
	 * @return
	 */
	private MsgEnum generateMsgEnumByResultInfos(List<ResultInfo> resultInfos) {
		// TODO Auto-generated method stub
		HashSet<String> resultSet = new HashSet<String>();
		for (ResultInfo resultInfo : resultInfos) {
			resultSet.add(resultInfo.getSuccess());
		}
		// 部分成功
		if (resultSet.contains("success") && resultSet.contains("fail"))
			return MsgEnum.PART_SUCCESS;
		// 成功
		else if (resultSet.contains("success") && (!resultSet.contains("fail")))
			return MsgEnum.SUCCESS;
		else
			return MsgEnum.FAIL;
	}

}
