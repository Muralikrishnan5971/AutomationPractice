package testNGframework;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class FirstTest extends BaseTestClass{
	
	@Test
	public void CustomerloginTestOne() {
		
		System.out.println("\t\t\t\t\t ZATHURA CUSTOMER LOGIN TEST ONE");
	}
	
	@Test
	public void CustomerloginTestTwo() {
		
		System.out.println("\t\t\t\t\t ZATHURA CUSTOMER LOGIN TEST TWO");
	}
	
	@BeforeSuite
	public void BeforeSuite() {
		
		System.out.println("BEFORE SUITE");
	}
	
	@AfterSuite
	public void AfterSuite() {
		
		System.out.println("AFTER SUITE");
	}

}
