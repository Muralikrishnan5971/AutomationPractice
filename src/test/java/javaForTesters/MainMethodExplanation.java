package javaForTesters;

import java.util.Scanner;

public class MainMethodExplanation {

	public static void main(String[] args) {

		// the command line arguments given are stored in a String array 'args'

		int a = 25;

		System.out.println("The Given integer is " + a);
		// System.out.println(args[1]); // idealy this line would print the command at
		// the 1th place in the array.

		Scanner inout = new Scanner(System.in); // System.in means get input from system
		System.out.println(inout.nextInt());
		inout.close();

		// Wrapper classes adds more functionality to our primitives
		Integer b = 65;
		System.out.println(b.hashCode());
	}
}
