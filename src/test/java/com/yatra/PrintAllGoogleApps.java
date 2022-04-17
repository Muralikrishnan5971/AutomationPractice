package com.yatra;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintAllGoogleApps {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
		
		WebElement elementInIframe = driver.findElement(By.xpath("//iframe[@role = 'presentation']"));
	
		driver.switchTo().frame(elementInIframe);
				
		List<WebElement> appList = driver.findElements(By.xpath("//div[@jsname and @jsaction]//li/a/span"));
		
		for (WebElement webElement : appList) {
			
			System.out.println(webElement.getText());
		}
	
	}
}
