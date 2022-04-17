package com.yatra;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchingChromeHeadless {

	public static void main(String[] args) throws IOException {
		
		//To launch chrome headless, there are two methods
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions opt = new ChromeOptions();
		opt.setHeadless(true);	//This is one method 
		
//		opt.addArguments("headless");	//This is another method to do so.
		
		
		WebDriver driver = new ChromeDriver(opt);
		
		driver.get("https://www.google.com/");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		ts.getScreenshotAs(OutputType.FILE);
		
		File file = ts.getScreenshotAs(OutputType.FILE);
		Files.copy(file, new File("./screenshots/headlessScreenshot"+ Math.random() +".png"));
		
		Date date = new Date();
		
		String dateString = date.toString();
		
		System.out.println(dateString.replace(" ", "-"));
		
		driver.quit();
	
		
	
	}
}
