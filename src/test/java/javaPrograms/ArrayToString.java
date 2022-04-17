package javaPrograms;

import java.util.Arrays;

public class ArrayToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str2=null;
		
		String[] str = {"Quentin", "Tarantino", "is", "Awesome"};
		
//		Four ways to convert an Array to String
		
//		1. Using .ToString() method
		
		String str1 = Arrays.toString(str);
		System.out.println(str1);
		
//		2. Using append() method 
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<str.length; i++) {
			
			str2 = sb.append(str[i]).toString();
		}
		
		System.out.println(str2);
	}

}
