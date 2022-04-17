package javaForTesters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintDriverCapabilities {

	@Test
	public void getAllDriverCapabilities() {
		
//		WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new FirefoxDriver();
		
		//getCapabilities from remoteWebDriverClass, but our driver is of webdriver type, hence we need to cast it to 
		//remoteWebDriver class
		
		System.out.println(((RemoteWebDriver)driver).getCapabilities().toString());
	}
}
