package com.yatra;

public class SplitGivenString {

	public static void main(String[] args) {
		
		String s = "Selenium, Maven, TestNG, Java";
		
		String[] ss= s.split(", ");
		
		System.out.println(ss);
		
		for (String string : ss) {
			
			System.out.println(string);
		}
		
		String str1 = "ABC";
		String str2 = "XYZ";
		String str3 = "PQR";
		
		System.out.println(str1.concat(str2).concat(str3));
		
		StringBuffer ssb = new StringBuffer(str1);
		
		System.out.println(ssb.append(str2).append(str3));
		
		
	}
}
