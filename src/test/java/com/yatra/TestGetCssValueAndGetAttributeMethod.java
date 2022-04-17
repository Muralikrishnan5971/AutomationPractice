package com.yatra;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestGetCssValueAndGetAttributeMethod {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		WebElement elementTest = driver.findElement(By.id("btnLogin"));
		
		System.out.println(elementTest.getAttribute("type"));
		
		System.out.println(elementTest.getCssValue("background-color"));
		System.out.println(elementTest.getCssValue("font-size"));
		
		driver.quit();
		
	}
}
