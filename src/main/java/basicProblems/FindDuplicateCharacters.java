package basicProblems;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicateCharacters {

	public static void main(String[] args) {

		String s = "muralikrishnan";
		int count = 0;
		
		List<String> duplicates = new ArrayList<>();

		char[] charS = s.toCharArray();

		for (int i = 0; i < charS.length; i++) {

			for (int j = i + 1; j < charS.length; j++) {

				if (charS[i] == charS[j]) {

					count++;
					
//					duplicates.add(charS[i]);
				}
			}
		}

		System.out.println(count);
	}
}
