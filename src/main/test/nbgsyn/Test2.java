package nbgsyn;

import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Test2 {

	public static void main(String[] args) {
		HashSet<String> companyBaseSet = new HashSet<String>();
		companyBaseSet.add("COMPANY_ID");
		companyBaseSet.add("COMPANY_CODE");
		companyBaseSet.add("COMPANY_SETTLEMENT_CODE");
		companyBaseSet.add("COMPANY_CREDIT_CODE");
		companyBaseSet.add("COMPANY_ORG_CODE");
		companyBaseSet.add("COMPANY_REG_CODE");
		companyBaseSet.add("COMPANY_CUSTOM_CODE");
		companyBaseSet.add("COMPANY_INSPECTION_CODE");
		companyBaseSet.add("COMPANY_IMMIGRATE_CODE");
		companyBaseSet.add("COMPANY_CIQ_CODE");
		companyBaseSet.add("COMPANY_FTA_CODE");
		companyBaseSet.add("COMPANY_EDI_CODE");
		companyBaseSet.add("COMPANY_CNAME");
		companyBaseSet.add("COMPANY_ENAME");
		companyBaseSet.add("COMPANY_SHORT_CNAME");
		companyBaseSet.add("COMPANY_SHORT_ENAME");
		companyBaseSet.add("COMPANY_TAX_CODE");
		companyBaseSet.add("COMPANY_BANK");
		companyBaseSet.add("COMPANY_BANK_ACCOUNT");
		companyBaseSet.add("COMPANY_REG_FUND");
		companyBaseSet.add("COMPANY_REG_ADDRESS");
		companyBaseSet.add("COMPANY_TYPE_CODE");
		companyBaseSet.add("COMPANY_BUSINESS_SCOPE");
		companyBaseSet.add("COMPANY_LEGAL_PERSON");
		companyBaseSet.add("COMPANY_CARDNO");
		companyBaseSet.add("COMPANY_NATIONALITY_CODE");
		companyBaseSet.add("COMPANY_URL");
		companyBaseSet.add("COMPANY_ADDRESS");
		companyBaseSet.add("COMPANY_ZIP");
		companyBaseSet.add("COMPANY_AREA_CODE");
		companyBaseSet.add("COMPANY_PROVINCE");
		companyBaseSet.add("COMPANY_CITY");
		companyBaseSet.add("COMPANY_COUNTY");
		companyBaseSet.add("COMPANY_TOWN");
		companyBaseSet.add("COMPANY_DETAIL_ADDRESS");
		companyBaseSet.add("COMPANY_GPS");
		companyBaseSet.add("COMPANY_TEL");
		companyBaseSet.add("COMPANY_FAX");
		companyBaseSet.add("COMPANY_REMARK");
		companyBaseSet.add("COMPANY_DESC");
		companyBaseSet.add("COMPANY_LOGO");
		companyBaseSet.add("COMPANY_FLAG");
		companyBaseSet.add("COMPANY_NBPORTGROUP_FLAG");
		StringBuffer sb = new StringBuffer();
		for (String string : companyBaseSet) {
			sb.append(string + ",");
		}
		System.out.println(sb);
		System.out.println("----------------------分割线-------------------------------");
		String companyBaseSetStrs = "COMPANY_SETTLEMENT_CODE,COMPANY_FLAG,COMPANY_TEL,COMPANY_NBPORTGROUP_FLAG,COMPANY_TOWN,COMPANY_LEGAL_PERSON,COMPANY_CITY,COMPANY_EDI_CODE,COMPANY_ENAME,COMPANY_GPS,COMPANY_URL,COMPANY_BUSINESS_SCOPE,COMPANY_FTA_CODE,COMPANY_ORG_CODE,COMPANY_ADDRESS,COMPANY_REG_FUND,COMPANY_CREDIT_CODE,COMPANY_PROVINCE,COMPANY_SHORT_CNAME,COMPANY_CARDNO,COMPANY_INSPECTION_CODE,COMPANY_BANK,COMPANY_COUNTY,COMPANY_SHORT_ENAME,COMPANY_REMARK,COMPANY_REG_CODE,COMPANY_DETAIL_ADDRESS,COMPANY_ID,COMPANY_CIQ_CODE,COMPANY_CUSTOM_CODE,COMPANY_LOGO,COMPANY_ZIP,COMPANY_BANK_ACCOUNT,COMPANY_TAX_CODE,COMPANY_DESC,COMPANY_IMMIGRATE_CODE,COMPANY_REG_ADDRESS,COMPANY_FAX,COMPANY_NATIONALITY_CODE,COMPANY_CODE,COMPANY_CNAME,COMPANY_AREA_CODE,COMPANY_TYPE_CODE";
		StringTokenizer stringTokenizer = new StringTokenizer(companyBaseSetStrs, ",");
		while (stringTokenizer.hasMoreElements()) {
			String s = stringTokenizer.nextToken();
			System.out.println(s);
		}
		System.out.println("----------------------分割线------2-------------------------");
		Iterator<String> iterator = companyBaseSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		iterator = companyBaseSet.iterator();
		System.out.println("----------------------分割线------3-------------------------");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
