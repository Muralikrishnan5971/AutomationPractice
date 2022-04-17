package com.yatra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTitleIsBold {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///F:/Murali/testLocalPage.html");
		
		String tagName= driver.findElement(By.id("bold1")).getTagName();
		Assert.assertEquals(tagName, "b");
		
		// Assert tag name of bold text
		String tagName1= driver.findElement(By.id("bold2")).getTagName();
		Assert.assertEquals(tagName1, "strong");
		
		// Get value of font-weight and assert if it is bold
		String fontWeight= driver.findElement(By.id("bold3")).getCssValue("font-weight");
		System.out.println(fontWeight);
		Assert.assertTrue(Integer.parseInt(fontWeight)>700);
		
		System.out.println(driver.getTitle());
		
		driver.quit();
	}
}
