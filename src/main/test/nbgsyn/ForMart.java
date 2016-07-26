package nbgsyn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import com.hzmc.nbgsyn.util.DateJsonValueProcessor;

import net.sf.json.JSON;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import net.sf.json.xml.XMLSerializer;

public class ForMart {

	public static void main(String[] args) throws DocumentException, ParseException {
		Date date = new Date();
		Map<String, Object> jo = new HashMap<String, Object>();
		jo.put("time", date);
		JsonConfig config = new JsonConfig();
		config.registerJsonValueProcessor(Date.class, new DateJsonValueProcessor());

		System.out.println(JSONObject.fromObject(jo, config).toString());
		String s = "2016-07-21T00:01:59";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		Date d = simpleDateFormat.parse(s);
		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(simpleDateFormat2.format(d));
		ForMart.method2();
	}

	public static void method1() throws DocumentException {
		String str = "<RD_NATIONALITY><NATIONALITY_CODE>CNH</NATIONALITY_CODE></RD_NATIONALITY>";
		System.out.println(str);
		Document document = DocumentHelper.parseText(str);
		Element root = document.getRootElement();
		System.out.println(root.getName());
		System.out.println(root.getStringValue());
		Iterator<Element> iterator = root.elementIterator();
		while (iterator.hasNext()) {
			Element e = iterator.next();
			System.out.println(e.getName());
			System.out.println(e.getText());
		}
	}

	public static void method2() throws DocumentException {

		String str = "<result><RD_NATIONALITY><NATIONALITY_CODE>AE</NATIONALITY_CODE><NATIONALITY_CNAME>&#38463;&#32852;&#37195;</NATIONALITY_CNAME><NATIONALITY_ENAME>United Arab Emirates</NATIONALITY_ENAME><NATIONALITY_ACTIVE_FLAG>Y</NATIONALITY_ACTIVE_FLAG></RD_NATIONALITY></result>";
		// str = "<totalCount>180</totalCount>";
		XMLSerializer xmlSerializer = new XMLSerializer();
		JSON json = xmlSerializer.read(str);
		if (json instanceof JSONArray) {
			System.out.println(((JSONArray) json).getInt(0));
		} else {
			System.out.println(json);
			JSONObject jo = (JSONObject) json;
			Iterator<String> iterator = jo.keys();
			while (iterator.hasNext()) {
				String key = iterator.next();
				System.out.println(jo.getJSONObject(key));
			}
		}

	}

}
