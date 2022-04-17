package com.yatra;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTitleDifferentWays {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		// Load URL
		driver.get("http://makeseleniumeasy.com/2019/03/05/"
				+ "selenium-interview-question-5-how-to-retrieve-title-of-a-webpage-without-using-gettitle-method/");

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.findElement(By.tagName("title")).getAttribute("textContent"));
		System.out.println(driver.findElement(By.xpath("//title")).getAttribute("textContent"));
		
		driver.quit();

	}
}
