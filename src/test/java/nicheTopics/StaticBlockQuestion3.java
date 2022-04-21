package nicheTopics;

public class StaticBlockQuestion3 {

	static {

		System.out.println("STATIC --> BLOCK");
	}

	{
		// this block will be executed whenever the object is created,
		// this block will be executed FIRST, even though there is constructor present
		
		
		System.out.println("INSTANCE INITIALIZATION BLOCK");
	}

	StaticBlockQuestion3() {

		System.out.println("CONSTRUCTOR");
	}

	public static void main(String[] args) {

		System.out.println("MAIN METHOD");
		
		new StaticBlockQuestion3();
		
		// Between Instance initialization block and Constructor,
		// the first preference is given to INSTANCE INITIALIZATION BLOCK
	}
}
