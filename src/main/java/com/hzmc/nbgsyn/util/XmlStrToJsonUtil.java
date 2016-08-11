package com.hzmc.nbgsyn.util;

import net.sf.json.JSON;
import net.sf.json.xml.XMLSerializer;

public class XmlStrToJsonUtil {

	public XmlStrToJsonUtil() {
	}

	public static JSON xmlStrToJson(String str) {
		XMLSerializer xmlSerializer = new XMLSerializer();
		return xmlSerializer.read(str);
	}

	public static void main(String[] args) {
		String str = "<RD_NATIONALITY><NATIONALITY_CODE>AC</NATIONALITY_CODE><NATIONALITY_CNAME>&#22823;&#35199;&#27915;&#23707;</NATIONALITY_CNAME><NATIONALITY_ENAME>NA</NATIONALITY_ENAME><ACTIVE_FLAG>Y</ACTIVE_FLAG></RD_NATIONALITY>";
		System.out.println(xmlStrToJson(str));
	}
}
