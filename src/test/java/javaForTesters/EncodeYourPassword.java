package javaForTesters;

import java.util.Base64;

public class EncodeYourPassword {

	public static void main(String[] args) {

		// l@ndon453

		String encodedString = Base64.getEncoder().encodeToString("Level3&ls2".getBytes());
		System.out.println(encodedString);

		String decodedString = new String(Base64.getDecoder().decode("bEBuZG9uNDUz".getBytes()));

		System.out.println(decodedString);

		// there are lot of online websites that convert base64 encoding.
		// encoded string can be kept in excel as password, which is now masked.
		// now when reading them, we can write custom methods to decode them before
		// using in test methods

		// though this way is not a better way to mask password, still is good than
		// openly written password.

	}
}
