package basicProblems;

import java.text.ParseException;
import java.util.Arrays;

public class dateFormatChange {

	public static void main(String[] args) throws ParseException {

		// 20220217

		String date = "17/04/2022";
		
		String[] split = date.split("/");
		
		String newString = split[2]+split[1]+split[0];
		
		System.out.println(newString);
		
		
	}
}
