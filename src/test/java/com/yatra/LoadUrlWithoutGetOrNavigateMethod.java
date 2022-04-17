package com.yatra;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoadUrlWithoutGetOrNavigateMethod {

	public static void main(String... args) {

		WebDriverManager.chromedriver().setup();

//		WebDriverManager.edgedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		System.out.println("Browser Opened");
		
//		System.exit(0);
		
		// String url = "https://www.tutorialspoint.com/";

		String url = "https://www.youtube.com/";

		String jsScript = "window.location = '" + url + "'";

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(jsScript);

		System.out.println(driver.getCurrentUrl());

		driver.quit();
	}
}
