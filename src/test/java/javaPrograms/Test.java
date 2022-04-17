package javaPrograms;

import static javaPrograms.Utility.*; //to use all public static methods, variables
import static javaPrograms.Utility.add;	//can be use to import a particular method only also, as shown

import static java.lang.System.*;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Static Import example,
		
		add(10, 20);
		printText("Automation");	//we don't need to use Class name reference also
		
		System.out.println(name);  	//static variable
		
//		The above System.out.println statement can be written using static import as well
		
		out.println("STATIC IMPORT"); //out method called without class name reference because of static import statement
		
		
		MethodChaniningLogic mc = new MethodChaniningLogic();
		mc.empAge(10);
		mc.empName("murali");
		
		mc.empAge(15).empName("krishnan");
		
	}

}
