package com.hzmc.nbgsyn.service.impl;

import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.ws.BindingProvider;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hzmc.nbgsyn.business.dao.IEntityViewDao;
import com.hzmc.nbgsyn.business.dao.IMapBaseDao;
import com.hzmc.nbgsyn.enums.MsgEnum;
import com.hzmc.nbgsyn.exception.TalendException;
import com.hzmc.nbgsyn.persistence.ApplyDate;
import com.hzmc.nbgsyn.persistence.ResultBean;
import com.hzmc.nbgsyn.persistence.ResultInfo;
import com.hzmc.nbgsyn.pojo.EntityView;
import com.hzmc.nbgsyn.resource.RedundanceTableInfo;
import com.hzmc.nbgsyn.service.ITalendService;
import com.hzmc.nbgsyn.util.Constant;
import com.hzmc.nbgsyn.util.XmlStrToJsonUtil;
import com.mchz.nbg.talendservice.TMDMService;
import com.mchz.nbg.talendservice.TMDMService_Service;
import com.mchz.nbg.talendservice.WSDataClusterPK;
import com.mchz.nbg.talendservice.WSDataModelPK;
import com.mchz.nbg.talendservice.WSDeleteItem;
import com.mchz.nbg.talendservice.WSGetItem;
import com.mchz.nbg.talendservice.WSGetItems;
import com.mchz.nbg.talendservice.WSItem;
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
public class TalendServiceImpl implements ITalendService {

	private Logger log = Logger.getLogger(TalendServiceImpl.class);

	private final String S_URL = Constant.S_URL;

	private final static URL WSDL_LOCATION;

	// 关联表信息
	private static HashMap<String, HashSet<String>> ralateTableInfo;

	// 冗余表信息
	// private static HashMap<String, HashSet<String>> redundanceTableInfo;

	static {
		URL url = null;
		try {
			url = new URL(Constant.WS_URL);
		} catch (MalformedURLException e) {
			Logger.getLogger(TalendServiceImpl.class).error(e);
		}
		WSDL_LOCATION = url;

		// 初始化 ralateTableInfo
		ralateTableInfo = new HashMap<String, HashSet<String>>();
		String companyBase = "COMPANY_SETTLEMENT_CODE,COMPANY_FLAG,COMPANY_TEL,COMPANY_NBPORTGROUP_FLAG,COMPANY_TOWN,COMPANY_LEGAL_PERSON,COMPANY_CITY,COMPANY_EDI_CODE,COMPANY_ENAME,COMPANY_GPS,COMPANY_URL,COMPANY_BUSINESS_SCOPE,COMPANY_FTA_CODE,COMPANY_ORG_CODE,COMPANY_ADDRESS,COMPANY_REG_FUND,COMPANY_CREDIT_CODE,COMPANY_PROVINCE,COMPANY_SHORT_CNAME,COMPANY_CARDNO,COMPANY_INSPECTION_CODE,COMPANY_BANK,COMPANY_COUNTY,COMPANY_SHORT_ENAME,COMPANY_REMARK,COMPANY_REG_CODE,COMPANY_DETAIL_ADDRESS,COMPANY_ID,COMPANY_CIQ_CODE,COMPANY_CUSTOM_CODE,COMPANY_LOGO,COMPANY_ZIP,COMPANY_BANK_ACCOUNT,COMPANY_TAX_CODE,COMPANY_DESC,COMPANY_IMMIGRATE_CODE,COMPANY_REG_ADDRESS,COMPANY_FAX,COMPANY_NATIONALITY_CODE,COMPANY_CODE,COMPANY_CNAME,COMPANY_AREA_CODE,COMPANY_TYPE_CODE,ACTIVE_FLAG";
		StringTokenizer companyBaseStringTokenizer = new StringTokenizer(companyBase, ",");
		HashSet<String> companyBaseSet = new HashSet<String>();
		while (companyBaseStringTokenizer.hasMoreElements()) {
			String temp = companyBaseStringTokenizer.nextToken();
			companyBaseSet.add(temp);
		}
		ralateTableInfo.put("MD_COMPANY_BASE", companyBaseSet);

		// // 初始化 redundanceTableInfo 冗余
		// redundanceTableInfo = new HashMap<String, HashSet<String>>();
		// String companyCtnowner = "COMPANY_CODE,COMPANY_CNAME,COMPANY_ENAME";
		// StringTokenizer companyCtnownerStringTokenizer = new StringTokenizer(companyCtnowner, ",");
		// HashSet<String> companyCtnownerSet = new HashSet<String>();
		// while (companyCtnownerStringTokenizer.hasMoreElements()) {
		// String temp = companyCtnownerStringTokenizer.nextToken();
		// companyCtnownerSet.add(temp);
		// }
		//
		// redundanceTableInfo.put("MD_COMPANY_CTNOWNER", companyCtnownerSet);

	}

	@Autowired
	private IEntityViewDao entityViewDao;

	@Autowired
	private IMapBaseDao mapBaseDao;

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
	public String talendSaveOrUpdateWS(String type, String model, String cluster, String xmls, String source) throws TalendException {

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
			itemrp.setSource(source);
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

	public WSItem getItemInfoInTalend(String model, String entityName, String pkvalue) throws TalendException {
		WSItem res = null;
		TMDMService_Service tws = new TMDMService_Service(WSDL_LOCATION);
		TMDMService port = tws.getTMDMPort();
		BindingProvider bp = (BindingProvider) port;
		WSDataClusterPK dc = new WSDataClusterPK();
		dc.setPk(model);

		WSItemPK wsItemPK = new WSItemPK();
		wsItemPK.setConceptName(entityName);
		wsItemPK.getIds().add(pkvalue);
		wsItemPK.setWsDataClusterPK(dc);

		WSGetItem wsGetItem = new WSGetItem();
		wsGetItem.setWsItemPK(wsItemPK);

		bp.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, "administrator");
		bp.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, "administrator");
		bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, S_URL);
		try {
			res = port.getItem(wsGetItem);
		} catch (Exception e) {
			e.printStackTrace();
			// 扔出异常
			log.error(e);
			throw new TalendException("talend调用错误" + e.getMessage());
		}

		return res;
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
			e.printStackTrace();
			// 扔出异常
			log.error(e);
			throw new TalendException("talend调用错误" + e.getMessage());
		}

		return res;
	}

	private String talendDeleteWS(String inType, String model, String cluster, String xmls, String sysCode) throws TalendException {
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
			wsDeleteItem.setSource(sysCode);
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
		// 判断是否存在

		// 存在则返回
		ResultBean res = new ResultBean(MsgEnum.SUCCESS.getMsgId(), MsgEnum.SUCCESS.getMsgDesc());
		// String entity = applyDate.getEntity();
		// EntityView entityView = entityViewDao.findEntityViewByEntityName(entity);
		// if (entityView == null) {
		// res.setMsgId(MsgEnum.ENTITYKEY_NOTFOUND.getMsgId());
		// res.setMsgDesc(MsgEnum.ENTITYKEY_NOTFOUND.getMsgDesc() + ":" + entity);
		// return res;
		// }

		// this.getItemInfoInTalend(Constant.MODEL, applyDate.getModel(), pkvalue);

		res = toTalend(applyDate, "C");
		return res;
	}

	@Override
	public ResultBean removeApplyDate(ApplyDate applyDate) {
		return toTalend(applyDate, "D");
	}

	@Override
	public ResultBean updateApplyDate(ApplyDate applyDate) {
		// 判断是否存在
		// 不存在则返回
		return toTalend(applyDate, "U");
	}

	@Override
	public ResultBean findApplyDate(ApplyDate applyDate) {
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
			// 处理异常
			e.printStackTrace();
			String msg = e.getMessage();
			if (msg.length() > 300) {
				msg = msg.substring(0, 300);
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
				totalPage = totalPage <= 0 ? 1 : totalPage;
				result.put("totalpage", totalPage);
				result.put("pagesize", pageSize);
				result.put("page", page);
				result.put("isMore", page >= totalPage ? "N" : "Y");
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
				// 处理异常
				e.printStackTrace();
				String msg = e.getMessage();
				if (msg.length() > 300) {
					msg = msg.substring(0, 300);
				}
				res.setMsgId(MsgEnum.READDAT_FAIL.getMsgId());
				res.setMsgDesc(MsgEnum.READDAT_FAIL.getMsgDesc() + ",详情:" + msg);
				return res;
			}
		}

		// 移除字段
		// 数字类型转化 科学计数法
		Pattern r = Pattern.compile(Constant.E_NOTATION_PATTERN);
		for (int i = 0; i < dataList.size(); i++) {
			JSONObject jo = (JSONObject) dataList.get(i);
			jo.remove("ERROR_FLAG");
			jo.remove("INSERT_TIME");
			jo.remove("UPDATE_TIME");
			// 循环jo
			@SuppressWarnings("unchecked")
			Iterator<String> joIterator = jo.keySet().iterator();
			while (joIterator.hasNext()) {
				String key = joIterator.next();
				String value = jo.getString(key);
				Matcher m = r.matcher(value);
				if (m.matches()) {
					try {
						BigDecimal bigDecimal = new BigDecimal(value);
						jo.put(key, bigDecimal.toString());
					} catch (Exception e) {
						// TODO: handle exception
						log.error("bigdecimal -- format - error" + e);
					}
				}
				// 外键[]去除
				if (jo.get(key) instanceof JSONArray) {
					JSONArray ja = (JSONArray) jo.get(key);
					jo.put(key, ja.getString(0));
				}
			}
		}

		result.put("dataList", dataList);
		return res;
	}

	public void getRalteInfoDateList(JSONArray dataList, EntityView entityView, String model) throws TalendException {
		List<String> pks = new ArrayList<String>();

		// 循环ja
		// 拿ja 中的ids
		for (int i = 0; i < dataList.size(); i++) {
			JSONObject jo = dataList.getJSONObject(i);
			if (jo.get(entityView.getEntityFk()) instanceof JSONArray) {
				JSONArray tempJa = (JSONArray) jo.get(entityView.getEntityFk());
				String foreignKey = tempJa.getString(0);
				jo.remove(entityView.getEntityFk());
				jo.put(entityView.getEntityFk(), foreignKey);
			}
			pks.add(jo.getString(entityView.getEntityFk()));
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
		// System.out.println(dataList);
		// System.out.println(pkDataList);
		// 组装
		HashSet<String> removeKey = new HashSet<String>();
		removeKey.add("TALEND_COMPANY_FLAG");

		// 循环dataList // 查找数据 // 合并jo
		for (int i = 0; i < dataList.size(); i++) {
			JSONObject jo = dataList.getJSONObject(i);
			// 获取PK
			String foreignKey = jo.getString(entityView.getEntityFk());
			// 循环 外键的data
			for (int j = 0; j < pkDataList.size(); j++) {
				JSONObject fkJo = pkDataList.getJSONObject(j);
				// 移除不需要的属性
				for (String temp : removeKey) {
					fkJo.remove(temp);
				}
				String fkJoPk = fkJo.getString(entityView.getForeignEntityKey());
				if (StringUtils.equals(fkJoPk, foreignKey))
					jo.putAll(fkJo);
			}
		}

		// System.out.println(dataList);

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
			e.printStackTrace();
			// 扔出异常
			log.error(e);
			throw new TalendException("talend调用错误" + e.getMessage());
		}

		return res;
	}

	private ResultBean toTalend(ApplyDate applyDate, String type) {
		ResultBean res = new ResultBean(MsgEnum.SUCCESS.getMsgId(), MsgEnum.SUCCESS.getMsgDesc());

		Date now = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		String nowStr = simpleDateFormat.format(now);

		String entity = applyDate.getEntity();
		String inType = type;
		String model = applyDate.getModel();
		String cluster = model;

		EntityView entityView = entityViewDao.findEntityViewByEntityName(entity);
		if (entityView == null) {
			res.setMsgId(MsgEnum.ENTITYKEY_NOTFOUND.getMsgId());
			res.setMsgDesc(MsgEnum.ENTITYKEY_NOTFOUND.getMsgDesc() + ":" + entity);
			return res;
		}

		// 数据的array
		JSONArray jsonArray = applyDate.getData();
		// 对应每一个data的返回信息
		List<ResultInfo> resultInfos = new ArrayList<ResultInfo>();
		// 遍历数据
		for (int i = 0; i < jsonArray.size(); i++) {
			ResultInfo temp = new ResultInfo("success", "");
			JSONObject dataInfo = (JSONObject) jsonArray.get(i);
			// 如果是创建的话默认添加2个字段
			if (StringUtils.equals("C", type)) {
				dataInfo.put("INSERT_TIME", nowStr);
				dataInfo.put("UPDATE_TIME", nowStr);
			} else if (StringUtils.equals("U", type)) {
				dataInfo.put("UPDATE_TIME", nowStr);
			}

			// 如果关联表的话 dataInfo 要清洗 拆成dataInfoMain 和 dataInFoPK
			if (StringUtils.equals("Y", entityView.getIsRalate())) {
				// 获取配置的set
				// 遍历是否在set 在set 就扔出dataINfoPk
				HashSet<String> entityColumns = ralateTableInfo.get(entityView.getForeignEntityName());
				HashSet<String> redundanceColumns = RedundanceTableInfo.getInstacne().getRedundance().get(entityView.getEntityName());
				redundanceColumns = redundanceColumns == null ? new HashSet<String>() : redundanceColumns;

				JSONObject dataInfoFk = new JSONObject();
				HashSet<String> removeKey = new HashSet<String>();
				@SuppressWarnings("unchecked")
				Iterator<String> iterator = dataInfo.keys();
				while (iterator.hasNext()) {
					String key = iterator.next();
					if (entityColumns.contains(key)) {
						dataInfoFk.put(key, dataInfo.get(key));
						// 如果不是 冗余数据 并且 不是FK的话 添加到移除的set中
						if ((!StringUtils.equals(key, entityView.getEntityFk())) && (!redundanceColumns.contains(key)))
							removeKey.add(key);
					}
				}

				// 遍历removeKey 移除dataInfo中的属性
				for (String tempKey : removeKey) {
					dataInfo.remove(tempKey);
				}

				if (!StringUtils.equals("D", inType)) {
					// 如果是 不是删除 就判断是否含companyId 有更新 没有 插入
					// 先直接扔进去试试
					// 是更新还是插入
					String pkIntype = "U";
					String fk = entityView.getForeignEntityKey();
					if (!dataInfoFk.containsKey(fk) || StringUtils.isEmpty(dataInfoFk.getString(fk)) || "0".equals(dataInfoFk.getString(fk)))
						pkIntype = "C";
					if (pkIntype.equals("C")) {
						// 找到最大值
						HashMap<String, Object> par = new HashMap<String, Object>();
						par.put("table", entityView.getForeignEntityName());
						par.put("col", "X_" + entityView.getForeignEntityKey());
						Integer id = mapBaseDao.getMaxIdByCondition(par);
						id++;
						dataInfoFk.put(entityView.getForeignEntityKey(), id);
					}

					// 组装xmls
					Element root = DocumentHelper.createElement(entityView.getForeignEntityName());
					Document document = DocumentHelper.createDocument(root);
					@SuppressWarnings("unchecked")
					Iterator<String> iteratorFk = dataInfoFk.keys();
					while (iteratorFk.hasNext()) {
						String key = iteratorFk.next().toString();
						root.addElement(key).addText(dataInfoFk.getString(key));
					}
					String xmls = document.getRootElement().asXML();
					String primaryKey = "";
					try {
						primaryKey = talendSaveOrUpdateWS(pkIntype, model, cluster, xmls, applyDate.getUsername());
					} catch (TalendException e) {
						e.printStackTrace();
						String msg = e.getMessage();
						if (msg.length() > 300) {
							msg = msg.substring(0, 300);
						}
						temp.setMsg("调用talend失败,详情:" + msg);
						temp.setSuccess("fail");
						resultInfos.add(temp);
						continue;
					}
					temp.setMsg("调用成功,company_id为" + primaryKey);
					temp.setFk(primaryKey);
					// 如果是删除 则不做操作
					dataInfo.put(entityView.getEntityFk(), primaryKey);
				}

			}

			// 如果是创建的话 设置主键key的id
			if (StringUtils.equals("C", type) && (!StringUtils.isEmpty(entityView.getMdCode()))) {
				// 设置id
				HashMap<String, Object> par = new HashMap<String, Object>();
				par.put("table", entityView.getEntityName());
				par.put("col", "X_" + entityView.getMdCode());
				Integer id = mapBaseDao.getMaxIdByCondition(par);
				id++;
				dataInfo.put(entityView.getEntityKey(), id);
			}

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
					primaryKey = talendDeleteWS(inType, model, cluster, xmls, applyDate.getUsername());
					temp.setMsg("调用成功,删除的主键为" + primaryKey);
				} else {
					primaryKey = talendSaveOrUpdateWS(inType, model, cluster, xmls, applyDate.getUsername());
					temp.setMsg(temp.getMsg() + "调用成功,主键为" + primaryKey);
				}
				temp.setPk(primaryKey);
			} catch (TalendException e) {
				// 处理异常 截取错误
				String msg = e.getMessage();
				if (msg.length() > 300) {
					msg = msg.substring(0, 300);
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
