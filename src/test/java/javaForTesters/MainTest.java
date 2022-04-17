package javaForTesters;

public class MainTest {

	public static void main(String[] args) {

		TestSingleton obj1 = TestSingleton.getInstance(); // we can't create a new object since we have declared our
															// constructor as private
		System.out.println(obj1);

		TestSingleton obj2 = TestSingleton.getInstance();
		System.out.println(obj2);

		TestSingleton obj3 = TestSingleton.getInstance();
		System.out.println(obj3);

		// here all the references obj1, obj2, obj3 point to the same object***
	}
}
