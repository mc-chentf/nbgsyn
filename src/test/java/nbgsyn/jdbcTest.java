package nbgsyn;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hzmc.nbgsyn.business.dao.IEntityViewDao;
import com.hzmc.nbgsyn.pojo.EntityView;
import com.ibatis.sqlmap.client.SqlMapClient;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class JdbcTest {

	public static void main(String[] args) throws SQLException {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		// IIncMdDataListDao incMdDataListDao = (IIncMdDataListDao) applicationContext.getBean("incMdDataListDaoImpl");
		//
		// List res = incMdDataListDao.findIncMdDataListsByDateAndCountAndType(new Date(), 10, "C");
		// System.out.println(res.size());
		JdbcTest jdbcTest = new JdbcTest();
		// ISendService sendService = (ISendService) applicationContext.getBean("sendServiceImpl");
		// sendService.reSendSeviceQuartzJob();
		// jdbcTest.methodOne();
		jdbcTest.method2(applicationContext);
		// JdbcTest jdbcTest = new JdbcTest();
		// jdbcTest.method3();
	}

	public void methodOne() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		IEntityViewDao entityViewDao = (IEntityViewDao) applicationContext.getBean("entityViewDaoImpl");
		List<EntityView> entityViews = entityViewDao.findAllEntityViews();

		for (EntityView entityView : entityViews) {
			JSONArray ja = new JSONArray();
			JSONObject jo = new JSONObject();
			jo.put("action", "TRANSFOR");
			jo.put("model", "MDM_NBG");
			jo.put("type", "R");
			jo.put("entity", entityView.getEntityName());
			jo.put("username", "hzmc");
			jo.put("password", "hzmc");
			jo.put("pagesize", 10);
			jo.put("page", 1);
			ja.add(jo);
			System.out.println(ja);
			System.out.println();
			System.out.println();
			JSONObject jo2 = new JSONObject();
			jo2.put("action", "TRANSFOR");
			jo2.put("model", "MDM_NBG");
			jo2.put("type", "D");
			jo2.put("entity", entityView.getEntityName());
			jo2.put("username", "hzmc");
			jo2.put("password", "hzmc");

			JSONObject dataJo = new JSONObject();
			if (entityView.getEntityKey().contains("ID"))
				dataJo.put(entityView.getEntityKey(), 1);
			else
				dataJo.put(entityView.getEntityKey(), "wow");
			JSONArray ja2 = new JSONArray();
			ja2.add(dataJo);
			jo2.put("data", ja2);
			JSONArray ja3 = new JSONArray();
			ja3.add(jo2);
			System.out.println(ja3);
		}
	}

	public void method2(ApplicationContext applicationContext) throws SQLException {
		String tableName = "MD_COMPANY_CTNOWNER";

		HashSet<String> removeCol = new HashSet<String>();
		removeCol.add("X_TALEND_TASK_ID");
		removeCol.add("X_ERROR_FLAG");
		removeCol.add("X_INSERT_TIME");
		removeCol.add("X_TALEND_TASK_ID");
		removeCol.add("X_TALEND_TIMESTAMP");
		removeCol.add("X_UPDATE_TIME");
		removeCol.add("X_TALEND_COMPANY_FLAG");
		removeCol.add("COMPANY_ID_X_COMPANY_ID");

		SqlMapClient client = (SqlMapClient) applicationContext.getBean("sqlMapClient");
		Connection connection = client.getDataSource().getConnection();
		Statement statement = connection.createStatement();

		ResultSet rs = statement.executeQuery("select COLUMN_NAME,DATA_TYPE from user_tab_columns where Table_Name = '" + tableName + "' order by column_name");
		HashMap<String, String> par = new HashMap<String, String>();

		int index = 0;
		while (rs.next()) {
			System.out.println(rs.getString(1));
			if (!removeCol.contains(rs.getString(1))) {
				String key = rs.getString(1);
				key = key.substring(2);
				String type = rs.getString(2);
				String value = "";
				if (key.equals("ACTIVE_FLAG"))
					value = "Y";
				else if (type.equals("VARCHAR2"))
					value = "w";
				else if (type.equals("NUMBER"))
					value = Integer.valueOf(index++).toString();
				else if (type.equals("DATE"))
					value = "2016-08-04T13:11:12";
				else
					System.out.println(type + "-----------------");
				par.put(key, value);
			}
		}

		List<String> rylist = new ArrayList<>();
		System.out.println("-----------------------------------");
		if (tableName.contains("COMPANY")) {
			// 查company表
			rs = statement.executeQuery("select COLUMN_NAME,DATA_TYPE from user_tab_columns where Table_Name = 'MD_COMPANY_BASE' order by column_name");
			index = 0;
			while (rs.next()) {
				System.out.println(rs.getString(1));
				if (!removeCol.contains(rs.getString(1))) {
					String key = rs.getString(1);
					key = key.substring(2);
					String type = rs.getString(2);
					String value = "";
					if (key.equals("ACTIVE_FLAG"))
						value = "Y";
					else if (type.equals("VARCHAR2"))
						value = "c";
					else if (type.equals("NUMBER"))
						value = Integer.valueOf(index++).toString();
					else if (type.equals("DATE"))
						value = "2016-08-04T13:11:12";
					else
						System.out.println(type + "-----------------");
					if (par.containsKey(key))
						rylist.add(key);
					par.put(key, value);
				}
			}
		}

		Iterator iterator = par.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<String, String> entry = (Entry<String, String>) iterator.next();
			System.out.println(entry.getKey() + "---" + entry.getValue());
		}

		// 生成一个 applydate的请求数据
		JSONObject applyDate = new JSONObject();
		applyDate.put("action", "TRANSFOR");
		applyDate.put("model", "MDM_NBG");
		applyDate.put("type", "C");
		applyDate.put("entity", tableName);
		applyDate.put("username", "hzmc");
		applyDate.put("password", "hzmc");
		JSONObject data = JSONObject.fromObject(par);
		JSONArray dataJa = new JSONArray();
		dataJa.add(data);
		applyDate.put("data", dataJa);

		JSONArray fja = new JSONArray();
		fja.add(applyDate);
		System.out.println(fja);
		applyDate.put("type", "U");
		fja.clear();
		fja.add(applyDate);
		System.out.println(fja);
		String rystr = "";
		for (String str : rylist) {
			rystr += "," + str;
		}
		System.out.println(tableName + "=" + rystr.substring(1));
	}

	public void method3() {
		String str = "{\"action\":\"TRANSFOR\",\"entity\":\"MD_TRANSPORT_VESSEL\",\"model\":\"MDM_NBG\",\"password\":\"12345\",\"type\":\"U\",\"username\":\"m'dm\"}";

		JSONObject jo = JSONObject.fromObject(str);
		StringBuffer sb = new StringBuffer();
		sb.append("(");
		Iterator<String> iterator = jo.keySet().iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			String value = jo.getString(key);
			value = value.replace("'", "''");
			sb.append("'" + value + "'");
			sb.append(",");
			System.out.println(jo.getString(key));
		}
		System.out.println(sb.toString());
	}

}
