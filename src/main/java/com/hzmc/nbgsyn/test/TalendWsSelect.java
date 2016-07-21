package com.hzmc.nbgsyn.test;

import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.BindingProvider;

import com.mchz.nbg.talendservice.TMDMService;
import com.mchz.nbg.talendservice.TMDMService_Service;
import com.mchz.nbg.talendservice.WSDataClusterPK;
import com.mchz.nbg.talendservice.WSGetItems;
import com.mchz.nbg.talendservice.WSStringArray;
import com.mchz.nbg.talendservice.WSStringPredicate;
import com.mchz.nbg.talendservice.WSWhereCondition;
import com.mchz.nbg.talendservice.WSWhereItem;
import com.mchz.nbg.talendservice.WSWhereOperator;
import com.mchz.nbg.talendservice.WSWhereOr;

public class TalendWsSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TalendWsSelect.method1();
	}

	public static void method1() {
		final String S_URL = "http://127.0.0.1:8080/talendmdm/services/soap";

		try {
			TMDMService_Service tws = new TMDMService_Service();

			TMDMService port = tws.getTMDMPort();
			BindingProvider bp = (BindingProvider) port;

			bp.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, "administrator");
			bp.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, "administrator");
			bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, S_URL);

			WSDataClusterPK dc = new WSDataClusterPK();
			dc.setPk("school");

			WSWhereCondition wsWhereCondition1 = new WSWhereCondition();
			wsWhereCondition1.setLeftPath("studentId");
			wsWhereCondition1.setOperator(WSWhereOperator.EQUALS);
			wsWhereCondition1.setRightValueOrPath("1000");
			wsWhereCondition1.setSpellCheck(true);
			wsWhereCondition1.setStringPredicate(WSStringPredicate.NONE);

			WSWhereCondition wsWhereCondition2 = new WSWhereCondition();
			wsWhereCondition2.setLeftPath("studentId");
			wsWhereCondition2.setOperator(WSWhereOperator.EQUALS);
			wsWhereCondition2.setRightValueOrPath("1001");
			wsWhereCondition2.setSpellCheck(true);
			wsWhereCondition2.setStringPredicate(WSStringPredicate.NONE);

			List<WSWhereItem> whereItems = new ArrayList<WSWhereItem>();
			WSWhereItem wsWhereItem1 = new WSWhereItem();
			wsWhereItem1.setWhereCondition(wsWhereCondition1);
			whereItems.add(wsWhereItem1);
			WSWhereItem wsWhereItem2 = new WSWhereItem();
			wsWhereItem2.setWhereCondition(wsWhereCondition2);
			whereItems.add(wsWhereItem2);

			WSWhereItem wsWhereItem = new WSWhereItem();
			WSWhereOr wsWhereOr = new WSWhereOr();
			wsWhereOr.getWhereItems().addAll(whereItems);
			wsWhereItem.setWhereOr(wsWhereOr);

			WSGetItems wsGetItems = new WSGetItems();
			wsGetItems.setConceptName("student");
			wsGetItems.setMaxItems(5);
			wsGetItems.setSkip(1);
			wsGetItems.setSpellTreshold(-1);
			wsGetItems.setTotalCountOnFirstResult(true);
			wsGetItems.setWsDataClusterPK(dc);
			wsGetItems.setWhereItem(wsWhereItem);

			//
			// WSWhereCondition wsWhereCondition = new WSWhereCondition();
			// wsWhereCondition.setLeftPath("NATIONALITY_CODE");
			// wsWhereCondition.setOperator(WSWhereOperator.NOT_EQUALS);
			// wsWhereCondition.setRightValueOrPath("-1");
			// wsWhereCondition.setSpellCheck(true);
			// wsWhereCondition.setStringPredicate(WSStringPredicate.NONE);

			WSStringArray str = port.getItems(wsGetItems);
			System.out.println(str.getStrings());
		} catch (Exception e) {

			System.out.println("error");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}
}
