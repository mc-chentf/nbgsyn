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
import org.springframework.stereotype.Service;

import com.hzmc.nbgsyn.enums.MsgEnum;
import com.hzmc.nbgsyn.exception.TalendException;
import com.hzmc.nbgsyn.persistence.ApplyDate;
import com.hzmc.nbgsyn.persistence.ResultBean;
import com.hzmc.nbgsyn.persistence.ResultInfo;
import com.hzmc.nbgsyn.resource.EntityKeyProperties;
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
import com.mchz.nbg.talendservice.WSWhereOperator;

import net.sf.json.JSON;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Service
public class TalendServiceImpl implements TalendService {

	private Logger log = Logger.getLogger(TalendServiceImpl.class);

	private final String S_URL = Constant.S_URL;

	public final static URL WSDL_LOCATION;

	static {
		URL url = null;
		try {
			url = new URL(Constant.WS_URL);
		} catch (MalformedURLException e) {
			java.util.logging.Logger.getLogger(TMDMService_Service.class.getName()).log(java.util.logging.Level.INFO,
					"Can not initialize the default wsdl from {0}", "file:/d:/talend/soap.wsdl");
		}
		WSDL_LOCATION = url;
	}

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

	private List<String> getItemsInfoInTalend(String model, String entityName, String entityKey, Integer limitStart,
			Integer limit) throws TalendException {
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

		WSWhereCondition wsWhereCondition = new WSWhereCondition();
		// 配置文件拿
		wsWhereCondition.setLeftPath(entityKey);
		wsWhereCondition.setOperator(WSWhereOperator.NOT_EQUALS);
		wsWhereCondition.setRightValueOrPath("-1");
		wsWhereCondition.setSpellCheck(true);
		wsWhereCondition.setStringPredicate(WSStringPredicate.NONE);

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
		// 硬编码 配置文件
		String entityKey = EntityKeyProperties.getInstacne().getProperty(entityName);
		if (StringUtils.isEmpty(entityKey)) {
			res.setMsgId(MsgEnum.ENTITYKEY_NOTFOUND.getMsgId());
			res.setMsgDesc(MsgEnum.ENTITYKEY_NOTFOUND.getMsgDesc() + ":" + entityName);
			return res;
		}
		Integer page = applyDate.getPage();
		Integer pageSize = applyDate.getPagesize();

		page = page <= 0 ? 1 : page;
		pageSize = (pageSize <= 0 || pageSize > 500) ? 500 : pageSize;

		Integer limitStart = (page - 1) * pageSize;
		Integer limit = pageSize;
		List<String> date = new ArrayList<String>();
		try {
			date = this.getItemsInfoInTalend(model, entityName, entityKey, limitStart, limit);
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
			if (json instanceof JSONArray) {
				int totalCount = ((JSONArray) json).getInt(0);
				result.put("total", totalCount);
				// 计算totalPage
				int totalPage = (totalCount + pageSize - 1) / pageSize;
				result.put("totalpage", totalPage);
				result.put("pagesize", pageSize);
				result.put("page", page);
				result.put("isMore", page == totalPage ? "N" : "Y");
			} else if (json instanceof JSONObject) {
				JSONObject jo = (JSONObject) json;
				@SuppressWarnings("unchecked")
				Iterator<String> joIterator = jo.keys();
				while (joIterator.hasNext()) {
					String key = joIterator.next();
					dataList.add(jo.getJSONObject(key));
				}
			}
		}
		result.put("dataList", dataList);
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
