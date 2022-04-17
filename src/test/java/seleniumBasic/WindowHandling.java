package seleniumBasic;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_91.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://www.tutorialspoint.com/index.htm");
		
		driver.findElementByXPath("//span[text() = 'Jobs']").click();
		Thread.sleep(2000);
		
		Set<String> winIds = driver.getWindowHandles();
	
		Iterator<String> itr = winIds.iterator();
		
		String parentWinId = itr.next();
		System.out.println(parentWinId);
		
		String childWinId = itr.next();
		System.out.println(childWinId);
		
		String title = driver.switchTo().window(childWinId).getTitle();
		System.out.println(title);
		
		driver.close();
		
		driver.switchTo().window(parentWinId);
		Thread.sleep(2000);
		
		driver.findElementByXPath("//span[text() = 'Library']").click();
		
		System.out.println(driver.getTitle());
		
		driver.close();
		
		
	}
	
}
