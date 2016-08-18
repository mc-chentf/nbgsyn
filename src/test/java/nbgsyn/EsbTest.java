package nbgsyn;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.HashMap;

import javax.xml.ws.BindingProvider;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hzmc.nbgsyn.service.impl.SendServiceImpl;
import com.hzmc.nbgsyn.util.Constant;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.nbport.ediesb.service.EDIESBService;
import com.nbport.ediesb.service.EDIESBServicePortType;

public class EsbTest {

	private final static String EDI_S_URL = Constant.EDI_S_URL;

	private final static URL WSDL_LOCATION;

	static {
		URL url = null;
		try {
			url = new URL(Constant.EDI_WS_URL);
		} catch (MalformedURLException e) {
			Logger.getLogger(SendServiceImpl.class).error(e);
		}
		WSDL_LOCATION = url;
	}

	public static void main(String[] args) throws SQLException, InterruptedException {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		SqlMapClient client = (SqlMapClient) applicationContext.getBean("sqlMapClient");
		Connection connection = client.getDataSource().getConnection();
		Statement statement = connection.createStatement();
		ResultSet rs = statement.executeQuery("select * from JOINTEST t  where x_id >= 49 and x_id <= 52 order by x_id");
		HashMap<String, String> data = new HashMap<String, String>();
		while (rs.next()) {
			String key = rs.getString(1);
			String value = rs.getString(2);
			data.put(key, value);
		}
		rs.close();
		statement.close();

		Object[] keys = data.keySet().toArray();
		Arrays.sort(keys);

		for (int i = 0; i < keys.length; i++) {
			String key = (String) keys[i];
			String applyDataStr = data.get(key);
			String id = key;
			System.out.println(applyDataStr);
			System.out.println("-------------call-----------------");
			String res = "";
			try {
				res = EsbTest.callEDIESBService("hzmc", "MDM", "mdm_publish", applyDataStr, "", "");
				System.out.println(res);
			} catch (Exception e) {
				e.printStackTrace();
				res = "error";
				System.out.println("ESB-ERROR");
			}
			// 吧resUpdate 到 测试表中
			Statement statement2 = connection.createStatement();
			res = res.replace("'", "''");
			if (res.length() > 3500)
				res = res.substring(0, 3000);
			String sql = "update jointest set x_jointest = '" + res + "' where x_id = '" + id + "'";
			System.out.println(sql);
			statement2.executeUpdate(sql);
			statement2.close();
			System.out.println("-------------end-----------------");
			System.out.println("---------------------------------");
			System.out.println("---------------------------------");
			System.out.println("---------------------------------");
			System.out.println("---------------------------------");
			System.out.println("---------------------------------");
			System.out.println("---------------------------------");
			System.out.println("---------------------------------");
			System.out.println("---------------------------------");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			Thread.sleep(1 * 1000);
		}

	}

	/**
	 * 调用ESB服务总线
	 * 
	 * @param fromNode
	 * @param toNode
	 * @param esbID
	 * @param applyData
	 * @param userID
	 * @param password
	 * @return
	 * @throws Exception
	 */
	private static String callEDIESBService(String fromNode, String toNode, String esbId, String applyData, String userId, String password) throws Exception {
		EDIESBService ediesbService = new EDIESBService(WSDL_LOCATION);
		EDIESBServicePortType ediesbServicePortType = ediesbService.getEDIESBServicePort();
		BindingProvider bp = (BindingProvider) ediesbServicePortType;
		bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, EDI_S_URL);
		String res = "";
		try {
			res = ediesbServicePortType.callEDIESBPub(fromNode, toNode, esbId, applyData, userId, password);
		} catch (Exception e) {
			throw e;
		}

		return res;
	}
}
