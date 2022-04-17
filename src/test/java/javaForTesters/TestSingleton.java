package javaForTesters;

public class TestSingleton {

	private TestSingleton() {

	}

	private static TestSingleton instance;

	public static TestSingleton getInstance() {

		// Check whether ONLY ONE object is created or NOT

		if (instance == null) {

			instance = new TestSingleton(); // Even though the constructor is PRIVATE, we can call it, since it is from
											// the same class.
		}

		return instance;
	}
}
