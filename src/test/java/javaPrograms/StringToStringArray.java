package javaPrograms;

public class StringToStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Ways to convert a string to Array of string

		String str = "Automation is Awesome";
		
		String[] arr = str.split(" ");	//using split method
		
		for(int i=0; i<arr.length; i++) {
			
			System.out.println(arr[i]);
		
		}
	
//		Replace multiple characters in a String
		
		String word = "You are a character  doesnt mean you have a  character";
		
		String newWord = word.replace('e', 'O');
		
		System.out.println(newWord);
		
//		Now using replaceAll method
		
		String newWord1 = word.replaceAll(" ", "MK"); //first argument is regex expression
		
		System.out.println(newWord1);
		
//		Now using replaceFirst method
		
		String newWord2 = word.replaceFirst(" " , "MK"); //first argument is regex expression
		
		System.out.println(newWord2);
		
		
		
		
		
		
	}

}


