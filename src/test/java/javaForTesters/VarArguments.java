package javaForTesters;

import java.util.Arrays;

public class VarArguments {

	public static void main(String[] args) {

		func1(25, 65, 321, 14);
	}

	// if we want to pass some values, but we dont know how many, we can give it as
	// ...variable
	// internally it will take as an array of integers
	static void func1(int... variable) {

		System.out.println(Arrays.toString(variable));

	}

	static void func2(int a, int b, String... variable) {

	}
}
