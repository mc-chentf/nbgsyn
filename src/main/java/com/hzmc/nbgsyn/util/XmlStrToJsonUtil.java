package com.hzmc.nbgsyn.util;

import net.sf.json.JSON;
import net.sf.json.xml.XMLSerializer;

public class XmlStrToJsonUtil {

	public XmlStrToJsonUtil() {
		// TODO Auto-generated constructor stub
	}

	public static JSON xmlStrToJson(String str) {
		XMLSerializer xmlSerializer = new XMLSerializer();
		return xmlSerializer.read(str);
	}
}
