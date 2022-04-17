package testNGframework;

import org.testng.annotations.Test;

public class SecondTest extends BaseTestClass {
	
	@Test
	public void CustomerOrderPlace() {
		
		System.out.println("\t\t\t\t\t ZATHURA CUSTOMER HAS PLACED ORDER");
	}
	
	@Test
	public void CustomerPaymentDone() {
		
		System.out.println("\t\t\t\t\t ZATHURA CUSTOMER HAS PAID THE ORDER PAYMENT");
	}
	
}
