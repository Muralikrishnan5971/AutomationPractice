package javaPrograms;

public class TestProgram01 {

	public static void main(String[] args) {
		
		String s = "Selenium";
		String news="";
		char ch;
		
		int count = 2 ;
//		output: museleni
		
		for (int i = 0; i < s.length(); i++) {
			ch = s.charAt(i);
			
			news = ch+news;
		}
		
		System.out.println(news);
		
		System.out.println(s.substring(0, s.length()-1));
	}
}
