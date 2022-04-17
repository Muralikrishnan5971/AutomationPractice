package seleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_91.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");

		WebElement country = driver.findElement(By.id("Form_submitForm_Country"));

		// Every time to select from drop down we have create an object, which is not a
		// good practice
		// Select select = new Select(country);
		// select.selectByVisibleText("India");

		// Creating generic method for selecting from drop down

		// selectByVisibleText(country, "India");

		// selectByValue(country, "India");

		// creating a ENUM and then calling it
		selectDropDown(country, DropDown.VALUE.toString(), "India");
	}

	public static void selectDropDown(WebElement element, String type, String value) {

		Select select = new Select(element);

		// switch (type) {
		//
		// case "index":
		//
		// select.selectByIndex(Integer.parseInt(value));
		// break;
		//
		// case "visibletext":
		//
		// select.selectByVisibleText(value);
		// break;
		//
		// case "value":
		//
		// select.selectByValue(value);
		// break;
		//
		// default:

//		System.out.println("Please enter a Valid Select type -- index or visibletext or value");
//		break;
	}

	

	// These are generic method only to select by visible text, by index and Value
	public static void selectByVisibleText(WebElement element, String text) {

		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

	public static void selectByIndex(WebElement element, int index) {

		Select select = new Select(element);
		select.selectByIndex(index);
	}

	public static void selectByValue(WebElement element, String value) {

		Select select = new Select(element);
		select.selectByValue(value);
	}

}
