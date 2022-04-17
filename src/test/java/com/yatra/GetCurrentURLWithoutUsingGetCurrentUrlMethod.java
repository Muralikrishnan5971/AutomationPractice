package com.yatra;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetCurrentURLWithoutUsingGetCurrentUrlMethod {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		// Load URL
		driver.get("https://www.google.com/");
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		// JavaScript command to get URL
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String cURL =  (String) js.executeScript("return document.URL"); //This method returns a Object reference
		System.out.println("Current URL is : " + cURL);

		driver.quit();
	}
}
