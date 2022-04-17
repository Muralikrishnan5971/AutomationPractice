package seleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class InputTypeFileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_91.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://html.com/input-type-file/");
		
//		it does not click the browse button
//		this approach works only if type = file is available
		
		driver.findElementByXPath("//*[@id='fileupload']").sendKeys("C:\\Users\\mural\\Desktop\\Test001.txt");
		
	}

}
