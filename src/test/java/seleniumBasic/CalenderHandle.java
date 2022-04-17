package seleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalenderHandle {

	static ChromeDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_91.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		driver.findElementById("datepicker").click();
		
		WebElement calendar = driver.findElementByClassName("ui-datepicker-calendar");
		
		new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(calendar));
		
		
		selectDay("14", "June", "2023");
		
		
	}

	
	public static String[] getMonthYear(String monthYearVal) {
		
		return monthYearVal.split(" ");
	}
	
	
	public static void selectDay(String xday, String xmonth, String xyear) {
		
		if((xmonth.equals("February") && Integer.parseInt(xday)> 29)){
			
			System.out.println("Wrong Date = "+xmonth+" : "+xday);
			return;
		}
		
		if(Integer.parseInt(xday) > 31) {
			
			System.out.println("Wrong Date = "+xmonth+" : "+xday);
			return;
		}
		
		String monthYear = driver.findElementByClassName("ui-datepicker-title").getText();
		
		while(!(getMonthYear(monthYear)[0].equals(xmonth) && getMonthYear(monthYear)[1].equals(xyear))) {
			
			driver.findElementByXPath("//a[@title = 'Next']").click();
			
			monthYear = driver.findElementByClassName("ui-datepicker-title").getText();
		}
		
		driver.findElementByXPath("//a[text() = '"+xday+"']").click();
	}
	
	
}
