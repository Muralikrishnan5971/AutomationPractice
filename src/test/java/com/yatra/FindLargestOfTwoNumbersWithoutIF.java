package com.yatra;

public class FindLargestOfTwoNumbersWithoutIF {
	
	public static void main(String[] args) {
		
		findLargestUsingTernaryOperator();
		
		findNoOfLowerAndUpperCase();
	}

	public static void findLargestUsingTernaryOperator() {

		int a = 200;
		int b = 30;

		int large = (a > b) ? a : b;

		System.out.println(large);
	}

	public static void findNoOfLowerAndUpperCase() {

		String s = "AutOmaTion mK";

		String upperCase = "", lowerCase = "";
		int upperCaseCount = 0, lowerCaseCount = 0;

		for (int i = 0; i < s.length(); i++) {

			char ch = s.charAt(i);

			if (ch >= 65 && ch <= 90) {

				upperCase = upperCase + ch;
				upperCaseCount++;

			}
			else {
				
				lowerCase = lowerCase + ch;
				lowerCaseCount++;
			}

		}
		
		System.out.println("lower case characters: "+ lowerCase+ " *** upper case characters: "+ upperCase);
		System.out.println("lower case characters count: "+ lowerCaseCount+ " *** upper case characters count: "+ upperCaseCount);
	}
}
