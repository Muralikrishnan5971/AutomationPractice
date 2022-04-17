package com.yatra;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class YatraTest001 {
	
	@Test
	public void yatraLoginTest() throws InterruptedException {
	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_95.exe");
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.yatra.com/");
		
		WebElement myAccount = driver.findElement(By.xpath("//a[text() = 'My Account']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(myAccount).build().perform();
		
		driver.findElement(By.xpath("//a[@id = 'signInBtn']")).click();
		
		driver.findElement(By.xpath("//button[@id = 'login-continue-btn']")).click();
//		Thread.sleep(2000);
		
		String validation01 = driver.findElement(By.xpath("//p[@id = 'login-title']")).getText();
		Assert.assertEquals(validation01, "INVALID EMAIL ID / MOBILE NUMBER");
		
		String validation02 = driver.findElement(By.xpath("//p[@id = 'login-error']")).getText();
		Assert.assertEquals(validation02, "Please enter your Email Id / Mobile Number");
		
		driver.findElement(By.xpath("//input[@id = 'login-input']")).sendKeys("muralikrishnan.pro@gmail.com");
		
		driver.findElement(By.xpath("//button[@id = 'login-continue-btn']")).click();
		
		driver.findElement(By.xpath("//input[@id = 'login-password']")).sendKeys("muraliyatra5971");
		
		driver.findElement(By.xpath("//button[@id = 'login-submit-btn']")).click();
		
//		Thread.sleep(3000);
		
		String title = driver.getTitle();
		
		Assert.assertEquals(title, "Flight, Cheap Air Tickets , Hotels, Holiday, Trains Package Booking - Yatra.com");
		
		driver.quit();
		
		
	}

}
