package com.yatra;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyTestSelenium {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
				
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://www.google.co.in/");
		
		driver.findElement(By.name("q")).sendKeys("muralikrishnan","selenium", Keys.ENTER);
		
		Actions act = new Actions(driver);
		
		act.keyDown(driver.findElement(By.name("q")), Keys.SHIFT).sendKeys("This sparta").keyUp(Keys.SHIFT).build().perform();
		
		Alert alert = driver.switchTo().alert();
		
	}
}
