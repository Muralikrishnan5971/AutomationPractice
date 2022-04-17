package seleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngSample {


	/*
	 * @author Muralikrishnan
	 */
	
//	What is logs? Capturing info/activities at the time of programm execution
//	Types of logs: info,warn error, fatal
//	How it works: it reads log4jconfiguration from log4j.properties file
//	***This log4j.properties file should be placed in the src/main/resources folder***
//	***The file name should be "log4j.properties"***
	
	
	public WebDriver driver;

	@BeforeMethod
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_95.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");

	}

	@Test
	public void FacebookSignUpTest() throws InterruptedException {

		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Muralikrishnan");
		driver.findElement(By.name("lastname")).sendKeys("G");
		driver.findElement(By.name("reg_email__")).sendKeys("test001@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("test001@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("123@@#$PDEsde");

		Select day = new Select(driver.findElement(By.id("day")));
		day.selectByVisibleText("1");

		Select month = new Select(driver.findElement(By.id("month")));
		month.selectByVisibleText("Jul");

		Select year = new Select(driver.findElement(By.id("year")));
		year.selectByVisibleText("1995");
		
		driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();

//		driver.findElementByXPath("(//button[@type='submit'])[2]").click();

		System.out.println("New user signed up successfully");

	}

	@Test(enabled = true)
	public void FacebookImageTest() throws InterruptedException {

		Thread.sleep(3000);
		
		Boolean img = driver.findElement(By.xpath("//img[@alt = 'Facebook']")).isDisplayed();
	
		if(img=true)
			System.out.println("Facebook image is displayed correctly");
		else 
			System.err.println("Facebook image is not displayed correctly");
	}
	
	
	@AfterMethod
	public void tearDown() {

		driver.close();

	}
	
	
	
}
