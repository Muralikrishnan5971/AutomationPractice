package javaPrograms;

public class SplitMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Apple Google IBM Intel";
		String[] s = str.split("\\s");
		
//		regex expression - \\s blank spaces, \\s+ multiple blank spaces
		
		String str1 = "Volswagon.Google.IBM.Intel";
		String[] s1 = str1.split("\\.");
		
		for(String word : s1) {
			
			System.out.println(word);
		}
		
	}

}
