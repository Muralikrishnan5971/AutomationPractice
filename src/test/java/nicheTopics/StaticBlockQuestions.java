package nicheTopics;

public class StaticBlockQuestions {

	// At the time of class loading the static block will be executed
	// Static block will be executed the moment the class is loaded
	// we can have 'n' number of static blocks
	// we can write any where in the class, it will executed in the order of the static blocks present
	// That is all the static blocks in order and then the main method

	static {

		System.out.println("STATIC BLOCK CALLED --> 1");
	}
	
	static {

		System.out.println("STATIC BLOCK CALLED --> 2");
	}

	public static void main(String[] args) {

		System.out.println("MAIN METHOD");
		
		// ********Now while executing the below line will the static block will be executed or not??****
		System.out.println(StaticBlockQuestion2.x);
		
		//static variable x is available in common memory space and there is no need to load the 
		//StaticBlockQuestion2 class to access the x static variable.
		//the static block in StaticBlockQuestion2 class will not be executed.
		// this optimization will be done by compiler
		
		// In the above same example, if the variable x is NON STATTC, in that case,
		// we need to create object of the StaticBlockQuestion2 class to access it.
		// Hence, class will be loaded and static block gets executed.
	}

	static {

		System.out.println("STATIC BLOCK CALLED --> 3");
	}
	
	private StaticBlockQuestions() {
		
	}
	
	//** How can we create objects if we create constructor private? **
	
	// two ways.
	// creating the object of the class inside a static block
	
	static {
		StaticBlockQuestions obj = new StaticBlockQuestions();
	}
	
	// another way is to create a static method and return the obj inside.
	// so that we can call this static method from outside to return the object.
	
	public static StaticBlockQuestions createObbjectOfStaticBlockQuestionsClass() {
		
		return new StaticBlockQuestions();
	}
	
	
	
	
	
}
