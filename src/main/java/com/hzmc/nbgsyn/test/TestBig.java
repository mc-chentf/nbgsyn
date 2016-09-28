package com.hzmc.nbgsyn.test;

import java.math.BigDecimal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestBig {
	public static void main(String[] args) {

		BigDecimal bigDecimal = new BigDecimal(1);
		bigDecimal = bigDecimal == null ? new BigDecimal("1000") : bigDecimal;
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
