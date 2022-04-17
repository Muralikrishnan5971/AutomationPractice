package com.yatra;

import java.awt.AWTException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class YatraTest002 {

	public static WebDriver driver;

	@Test
	public void yatraBookingValidationTest() throws AWTException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_95.exe");
		driver = new ChromeDriver(options);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.yatra.com/");

		WebElement myAccount = driver.findElement(By.xpath("//a[text() = 'My Account']"));
		Actions act = new Actions(driver);
		act.moveToElement(myAccount).build().perform();

		driver.findElement(By.xpath("//a[@id = 'signInBtn']")).click();

		driver.findElement(By.xpath("//input[@id = 'login-input']")).sendKeys("muralikrishnan.pro@gmail.com");

		driver.findElement(By.xpath("//button[@id = 'login-continue-btn']")).click();

		driver.findElement(By.xpath("//input[@id = 'login-password']")).sendKeys("muraliyatra5971");

		driver.findElement(By.xpath("//button[@id = 'login-submit-btn']")).click();

		driver.findElement(By.id("booking_engine_buses")).click();

		fromStation("Chennai");
		
		toStation("Kolkata");
		
		driver.findElement(By.id("BE_bus_search_btn")).click();
		
		String bookingValidationText = driver.findElement(By.xpath("//div[@class = 'v-window__container']")).getText();
		
		Assert.assertEquals(bookingValidationText, "Buses are not available on this route");
		
		driver.quit();
		
//		resume builder novoresume, canva
		
		
	}

	public static void fromStation(String fromStation) {

		driver.findElement(By.id("BE_bus_from_station")).click();

		List<WebElement> locations = driver.findElements(By.xpath("//div[@class = 'viewport' ]/div/div/li"));

		for (WebElement city : locations) {

			if (city.getText().contains(fromStation)) {

				city.click();
				break;
			}

		}
	}
	
	public static void toStation(String toStation) {

		driver.findElement(By.id("BE_bus_to_station")).click();

		List<WebElement> locations = driver.findElements(By.xpath("//div[@class = 'viewport' ]/div/div/li"));
		
		for (WebElement city : locations) {

			if (city.getText().contains(toStation)) {

				city.click();
				break;
			}

		}
	}

}
