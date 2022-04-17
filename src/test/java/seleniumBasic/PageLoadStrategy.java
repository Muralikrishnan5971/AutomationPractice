package seleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PageLoadStrategy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_91.exe");

		ChromeOptions option = new ChromeOptions();
		option.setPageLoadStrategy(org.openqa.selenium.PageLoadStrategy.NORMAL);
		
		
		ChromeDriver driver = new ChromeDriver(option);

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.amazon.in/");
		
//		Selenium has three page loading strategy to load the web page that is the get method or navigate.to() method
		
//		NORMAL -- Loads the complete page and Then only executes the next command
//		EAGER -- Loads only the HTML document does'nt wait for loading images, CSS style sheets, straight away execute next statement
//		NONE -- loads only a plain page, that is nothing it loads
		
//		Normally get method follows NORMAL, but can be changed using ChromeOptions
		
//		https://www.selenium.dev/documentation/webdriver/page_loading_strategy/
	
		
		
		driver.switchTo().alert().sendKeys("Test");
	}

}
