package javaForTesters;

public class StringPerformance {

	public static void main(String[] args) {

		String series = "";

		for (int i = 0; i < 26; i++) {

			char ch = (char) ('a' + i);
			series = series + ch; // here what happens every time is a new object is created and the
			// reference is pointing to it, the previous object is dereferenced. this is due
			// to the string immutability.

			// but performance wise its bad. it can be overcome by String Builder class.
			// because here the same object can be changed.

		}

		System.out.println(series);

		usingStringBuilder();
	}

	public static void usingStringBuilder() {

		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < 26; i++) {

			char ch = (char) ('a' + i);
			builder.append(ch); // here it is not creating new objects everytime, rather changes the existing
								// object --> Mutability
		}

		System.out.println(builder);
		System.out.println(builder.reverse());
	}
}
