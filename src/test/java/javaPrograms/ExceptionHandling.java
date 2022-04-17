package javaPrograms;

public class ExceptionHandling {

	public static void main(String[] args) {

		int a = 5;
		int b = 0;

		try {

			divide(a, b);

		} catch (Exception e) {

			// System.out.println(e.getMessage());
		}
	}

	static void divide(int a, int b) throws ArithmeticException {

		if (b == 0) {

			throw new ArithmeticException("Please do not enter ZERO");
		}
	}
}
