package javaForTesters;

public class LearnStaticBlock {

	static int a = 10;
	static int b;

	// STATIC block will get executed exactly ONCE, when the class is first loaded
	// will only run once, when the first object is created i.e, when the class is
	// first loaded for the first time.

	static {

		System.out.println("Hi there, Iam inside the STATIC BLOCK");

		b = a * 10;
	}

	public static void main(String[] args) {

		System.out.println(LearnStaticBlock.a);

		System.out.println(LearnStaticBlock.b);

		LearnStaticBlock.b += 5;

		System.out.println(LearnStaticBlock.b); // Here, the static block is not called
	}

}
