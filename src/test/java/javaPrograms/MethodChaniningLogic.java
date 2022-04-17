package javaPrograms;

public class MethodChaniningLogic {

	public MethodChaniningLogic empName(String name) {

		System.out.println("The NAME is " + name);
		return new MethodChaniningLogic();
	}

	public MethodChaniningLogic empAge(int age) {

		System.out.println("The AGE is " + age);
		return new MethodChaniningLogic();
	}

}


