package javaPrograms;

public class RemoveSpecialChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "mu@r#a*lik@ri^sh&n#a(n";
		
//		First approach by using replaceAll method
		
		String name = str.replaceAll("[^a-zA-Z0=9]", "");	//Regex Expression: Anything other than a to z, A to Z and 0 to 9 
															//replace it with nothing
		
		System.out.println(name);

//		Now to remove all White Spaces in a given string
		
		String len = " mu a likri sh na n ";
		
		System.out.println(len.trim()); 	//trim() method only removes the leading and trailing spaces
		
		String len001 = len.replaceAll("\\s", "");
		
		System.out.println(len001);
		
		
		
		
		
		
	}

}
