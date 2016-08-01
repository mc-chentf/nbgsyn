package nbgsyn;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class TestJson {

	public static void main(String[] args) {
		JSONObject jo = JSONObject.fromObject("{a:1,b:[2],c:3}");
		if (jo.get("b") instanceof JSONArray) {
			JSONArray new_name = (JSONArray) jo.get("b");
			System.out.println(new_name.get(0));
		}
		System.out.println(jo.get("b"));
	}
}
