package com.hzmc.nbgsyn.test;

import java.util.List;

import javax.xml.ws.BindingProvider;

import com.mchz.nbg.talendservice.TMDMService;
import com.mchz.nbg.talendservice.TMDMService_Service;
import com.mchz.nbg.talendservice.WSDataClusterPK;
import com.mchz.nbg.talendservice.WSDataModelPK;
import com.mchz.nbg.talendservice.WSGetItems;
import com.mchz.nbg.talendservice.WSStringArray;
import com.mchz.nbg.talendservice.WSStringPredicate;
import com.mchz.nbg.talendservice.WSWhereCondition;
import com.mchz.nbg.talendservice.WSWhereOperator;

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
			dc.setPk("MDM_NBG");

			WSGetItems wsGetItems = new WSGetItems();
			wsGetItems.setConceptName("RD_NATIONALITY");
			wsGetItems.setMaxItems(1);
			wsGetItems.setSkip(1);
			wsGetItems.setSpellTreshold(-1);
			wsGetItems.setTotalCountOnFirstResult(true);
			wsGetItems.setWsDataClusterPK(dc);

			WSWhereCondition wsWhereCondition = new WSWhereCondition();
			wsWhereCondition.setLeftPath("NATIONALITY_CODE");
			wsWhereCondition.setOperator(WSWhereOperator.NOT_EQUALS);
			wsWhereCondition.setRightValueOrPath("-1");
			wsWhereCondition.setSpellCheck(true);
			wsWhereCondition.setStringPredicate(WSStringPredicate.NONE);

			WSStringArray str = port.getItems(wsGetItems);
			List<String> strlist = str.getStrings();
			System.out.println(str);
		} catch (Exception e) {

			System.out.println("error");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}
}
