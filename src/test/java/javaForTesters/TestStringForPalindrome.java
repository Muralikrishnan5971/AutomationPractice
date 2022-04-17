package javaForTesters;

import java.util.Objects;

public class TestStringForPalindrome {

	public static void main(String[] args) {

		String str = "muralilarum";
		System.out.println(isPalindrome(str));

	}

	public static boolean isPalindrome(String str) {

		if (Objects.isNull(str) || str.length() == 0) {
			return true;
		}

		str = str.toLowerCase();

		for (int i = 0; i <= str.length() / 2; i++) {

			char start = str.charAt(i);
			char end = str.charAt(str.length() - 1 - i);

			if (start != end) {
				return false;
			}

		}

		return true;
	}
}
