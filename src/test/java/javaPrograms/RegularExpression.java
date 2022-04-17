package javaPrograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 0;
		
		Pattern p = Pattern.compile("ab");
		
		Matcher m = p.matcher("abbababababbbaabaabbabababbaba");
		
		while (m.find()) {
			
			count++;
			
			System.out.println(m.start()); //print the start index of the each of the occurrence 
										   //of the desired pattern in the target string
			
			System.out.println(m.end());	//m.end() returns end index plus 1
			
			System.out.println(m.group());
		}
		
		System.out.println("The Number of occurrence of the desired pattern in the target string is "+count);
	}

}
