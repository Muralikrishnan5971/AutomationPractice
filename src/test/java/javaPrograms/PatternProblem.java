package javaPrograms;

public class PatternProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. run the outer loop for No of time of lines. ie., No of Rows
		// 2. identify for every row, how columns are there or type of element (1,2, *,
		// % etc)
		// 3. When one row printed, we need to add a new line

		testPattern005(4);

	}

	static void testPattern001(int n) {
		// *
		// **
		// ***
		// ****

		// every row runs n times
		for (int row = 1; row <= n; row++) {

			// every col runs row'th times
			for (int col = 1; col <= row; col++) {

				System.out.print("*");
			}

			System.out.println();
		}

	}

	static void testPattern002(int n) {

		// ****
		// ****
		// ****
		// ****

		// every row runs for n times
		for (int row = 1; row <= n; row++) {

			// every col runs for n times
			for (int col = 1; col <= n; col++) {

				System.out.print("*");
			}

			System.out.println();
		}

	}

	static void testPattern003(int n) {

		// ****
		// ***
		// **
		// *

		// every row runs n times
		for (int row = 1; row <= n; row++) {

			// find the relation bet no of rows and no of col and arrive at a formula
			for (int col = 1; col <= n + 1 - row; col++) {

				System.out.print("*");
			}

			System.out.println();
		}

	}

	static void testPattern004(int n) {

		// 1
		// 1 2
		// 1 2 3 
		// 1 2 3 4 

		// every row runs n times
		for (int row = 1; row <= n; row++) {

			// every col runs row'th times
			for (int col = 1; col <= row; col++) {

				System.out.print(col + " ");
			}

			System.out.println();
		}

	}
	
	static void testPattern005(int n) {

		// *
		// **
		// ***
		// **
		// *

		// every row runs n times
		for (int row = 1; row < 2 * n; row++) {

			// every col runs row'th times
			for (int col = 1; col <= row; col++) {

				System.out.print("*");
			}

			System.out.println();
		}

	}

}
