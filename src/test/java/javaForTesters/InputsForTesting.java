package javaForTesters;

import java.util.Scanner;

public class InputsForTesting {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter some input : ");

		int rollno = sc.nextInt();

		System.out.println("Your Roll No is : " + rollno);

		int a = 721_000_000;
		System.out.println(a);

		// Type casting
		int num = (int) 56.21f; // it converts 56.21 float type to 56 int type
		System.out.println(num);

		System.out.println("こんにちは");
	}
}
