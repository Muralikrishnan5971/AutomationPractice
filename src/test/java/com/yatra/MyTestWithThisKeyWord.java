package com.yatra;

public class MyTestWithThisKeyWord {

	int a;
	int b;

	public static void main(String[] args) {

		MyTestWithThisKeyWord obj = new MyTestWithThisKeyWord();
		
		System.out.println(obj.addGivenNumbers(4, 15));
		
	}

	public int addGivenNumbers(int a, int b) {

		 a = this.a;
		 b = this.b;
				 
		return a + b;

	}
}
