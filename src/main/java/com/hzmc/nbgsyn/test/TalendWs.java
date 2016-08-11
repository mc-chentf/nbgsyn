package com.hzmc.nbgsyn.test;

import javax.xml.ws.BindingProvider;

import com.mchz.nbg.talendservice.TMDMService;
import com.mchz.nbg.talendservice.TMDMService_Service;
import com.mchz.nbg.talendservice.WSDataClusterPK;
import com.mchz.nbg.talendservice.WSDataModelPK;
import com.mchz.nbg.talendservice.WSPutItem;
import com.mchz.nbg.talendservice.WSPutItemWithReport;

public class TalendWs {

	public static void main(String[] args) {
		TalendWs.method1();
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
			WSPutItem item = new WSPutItem();
			WSDataModelPK dp = new WSDataModelPK();
			WSDataClusterPK dc = new WSDataClusterPK();
			dc.setPk("school");
			dp.setPk("school");
			item.setWsDataModelPK(dp);
			item.setWsDataClusterPK(dc);
			item.setIsUpdate(false);
			// item.setXmlString("<RD_COUNTRY><RD_COUNTRYId>66</RD_COUNTRYId><COUNTRY_CODE>25</COUNTRY_CODE></RD_COUNTRY>");
			item.setXmlString(
					"<student><studentId>112</studentId><dt>2012-01-01T13:13:13</dt></student>");

			// WSPutItem item1 = new WSPutItem();
			// item1.setWsDataModelPK(dp);
			// item1.setWsDataClusterPK(dc);
			// item1.setIsUpdate(false);
			// item1.setXmlString("<RD_COUNTRY><RD_COUNTRYId>71</RD_COUNTRYId><COUNTRY_CODE>25</COUNTRY_CODE></RD_COUNTRY>");

			WSPutItemWithReport itemrp = new WSPutItemWithReport();
			itemrp.setSource("cbos-call");
			itemrp.setWsPutItem(item);
			// itemrp.setWsPutItem(item1);
			itemrp.setInvokeBeforeSaving(true);

			String rtnMessage = port.putItemWithReport(itemrp).getIds().toString();
			// String rtnMessage1=port.putItem(item).getIds().toString();
			System.out.println("Result=>" + rtnMessage);

		} catch (Exception e) {

			System.out.println("error");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}
}
