package testNGframework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTestClass {

	@BeforeClass
	public void BeforeClass() {

		System.out.println("\t\t BEFORE CLASS");
	}

	@BeforeMethod
	public void BeforeMethod() {

		System.out.println("\t\t\t BEFORE METHOD");
	}

	@AfterMethod
	public void AfterMethod() {

		System.out.println("\t\t\t AFTER METHOD");
	}

	@AfterClass
	public void AfterClass() {

		System.out.println("\t\t AFTER CLASS");
	}

	@BeforeTest
	public void BeforeTest() {

		System.out.println("\t BEFORE TEST");
	}

	@AfterTest
	public void AfterTest() {

		System.out.println("\t AFTER TEST");
	}

}
