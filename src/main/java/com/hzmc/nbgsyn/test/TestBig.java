package com.hzmc.nbgsyn.test;

import java.math.BigDecimal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.hzmc.nbgsyn.exception.TalendException;
import com.hzmc.nbgsyn.service.impl.TalendServiceImpl;
import com.mchz.nbg.talendservice.WSItem;

public class TestBig {
	public static void main(String[] args) {

		TalendServiceImpl talendServiceImpl = new TalendServiceImpl();
		try {
			WSItem item = talendServiceImpl.getItemInfoInTalend("MDM_NBG", "MD_TRANSPORT_TRUCK", "1");
			System.out.println(item.getContent());
		} catch (TalendException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void method1() {
		System.out.println(BigDecimal.valueOf(10l));
		BigDecimal bigDecimal = new BigDecimal("1.59229227E8");
		System.out.println(bigDecimal.toString());

		String str = "1";
		String pattern = "[+-]?[\\d]+([\\.][\\d]*)?([Ee][+-]?[0-9]{0,2})?";

		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(str);
		System.out.println(m.matches());
	}

}
