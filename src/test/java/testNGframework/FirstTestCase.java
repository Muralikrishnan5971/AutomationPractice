package testNGframework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTestCase {

	WebDriver driver;
	
	@Test(enabled = false)
	public void fbTest() {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_95.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");

		Boolean ing = driver.findElement(By.xpath("//img[@alt = 'Facebook']")).isDisplayed();
		
		Assert.assertTrue((! ing), "Facebook image is NOT displayed correctly");
		
		driver.quit();
	}
	
	
	
}
