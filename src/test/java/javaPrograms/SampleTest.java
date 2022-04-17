package javaPrograms;

public class SampleTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		byte a = 10;
		byte b = 20;
//		byte c = a+b; will give compile time error, since output is of int type
		
		System.out.println(a+b);
		Thread.sleep(-1000);
	}

}
