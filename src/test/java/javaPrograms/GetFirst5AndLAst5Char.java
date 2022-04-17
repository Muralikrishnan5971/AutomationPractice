package javaPrograms;

public class GetFirst5AndLAst5Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "muralikrishnan";
		
//		To get the FIRST FIVE and the LASTFIVE characters
		
		System.out.println(str.length());
		
		System.out.println(str.substring(0, 5));	//FIRST FIVE Char
		
		System.out.println(str.substring(str.length()-5, str.length()));
	}

}
