package basicProblems;

import java.util.Arrays;
import java.util.Collections;

public class SumOfArrayOddPosition {

	public static void main(String[] args) {

		// to print sum of even and odd index positioned numbers in an input array

		int[] a = { 8, 41, 2, 6, 87, 6, 7 };

		int i = a.length;

		System.out.println(addOddPosition(a));

		System.out.println(addEvenPosition(a));

		System.out.println(findTheLargestNumber(a, i));

		// to find the max and min number in an array

		int maxNum = a[0];
		int minNum = a[0];

		for (int j = 0; j < a.length; j++) {

			if (maxNum < a[j]) {

				maxNum = a[j];
			}

			else if (minNum > a[j]) {

				minNum = a[j];
			}
		}

		System.out.println("LARGEST: " + maxNum + " SMALLEST: " + minNum);

	}

	public static int addOddPosition(int[] a) {

		int sum = 0;

		System.out.println(a.length);

		for (int i = 0; i < a.length; i++) {

			if (i % 2 != 0) {

				sum += a[i];
			}
		}

		return sum;
	}

	public static int addEvenPosition(int[] a) {

		int sum = 0;

		System.out.println(a.length);

		for (int i = 0; i < a.length; i++) {

			if ((i % 2 == 0)) {

				sum += a[i];
			}
		}

		return sum;
	}

	public static int findTheLargestNumber(int[] a, int i) {

//		Collections.sort(a);
		
		Arrays.sort(a); // sorts the array collection in ascending order

		return a[i - 1];
	}

}
