package nbgsyn;

import java.util.Iterator;

import net.sf.json.JSONObject;

public class TestJSON {
	public static void main(String[] args) {

		JSONObject jo = new JSONObject();
		jo.put("A", "a");
		jo.put("B", "[b,c]");
		jo.put("C", "c");
		 jo = JSONObject.fromObject("{\"ACTIVE_FLAG\":\"Y\",\"COMPANY_ADDRESS\":\"0020\",\"COMPANY_CNAME\":\"魔兽世界公司\",\"COMPANY_CODE\":\"wow\",\"COMPANY_DETAIL_ADDRESS\":\"0020\",\"COMPANY_ENAME\":\"wowconpany\",\"COMPANY_FLAG\":\"7\",\"COMPANY_ID\":\"\",\"COMPANY_REG_CODE\":\"wow\",\"COMPANY_SHORT_CNAME\":\"wow办事处\",\"CTNOWNER_CTN_NUM\":\"8\",\"CTNOWNER_DESC\":\"每小时\"}");
		
		System.out.println(jo.getJSONArray("B"));
	}
}
