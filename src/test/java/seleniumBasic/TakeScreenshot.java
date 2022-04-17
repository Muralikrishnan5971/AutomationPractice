package seleniumBasic;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshot {

	public static void main(String[] args) throws IOException {
		
		Date date = new Date();
		System.out.println(date);
		String ssname = date.toString().replace(" ", "-").replace(":", "-");
		System.out.println(ssname);
		
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_95.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.ebay.com/");
		
		File ss = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		//import apache commons io dependancies from maven
		FileUtils.copyFile(ss, new File("./screenshots/ebay"+ssname+".png"));
		
		//now hardcoding the filename will overwrite the existing file, everytime we run this code, 
		//so we can append the file name with timestamp
	}

}
