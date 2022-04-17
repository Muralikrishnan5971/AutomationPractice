package com.yatra;

public class FindTheNumberOfEvenOddinGivenArray {

	public static void main(String[] args) {

		int a[] = { 4, 6, 7, 3, 2 };

		int i, even = 0, odd = 0;
		
		for (i = 0; i <= a.length-1; i++) {

			if (a[i] % 2 == 0) {

				even++;
			} else {
				odd++;
			}
		}
		
		System.out.println("There are "+even+" EVEN numbers and "+odd+" ODD numbers in the given array");
	}
}
