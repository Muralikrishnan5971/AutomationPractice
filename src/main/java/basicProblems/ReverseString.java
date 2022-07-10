package basicProblems;

public class ReverseString {

	public static void main(String[] args) {

		System.out.println(reverseUsingConcatenation("murali"));
	}

	public static String reverseUsingConcatenation(String str) {

		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			rev = rev + str.charAt(i);
		}

		return rev;
	}
}
