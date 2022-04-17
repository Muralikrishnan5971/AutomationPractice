package seleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_95.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		
		String title = driver.getTitle();
		
//		**Title is always a part of the <head> tag in the DOM
//		**Let title be the result of calling the algorithm for getting the 
//		**title attribute of the current top-level browsing context’s active document.
		
		
		
		
		System.out.println(title);
		
		driver.findElementByName("q").sendKeys("cucumber");
		Thread.sleep(3000);
		
		driver.findElementByName("q").sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		driver.close();
		
		
		
		
	}

}
