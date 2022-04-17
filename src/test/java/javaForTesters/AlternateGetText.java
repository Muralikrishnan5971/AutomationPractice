package javaForTesters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlternateGetText {

	@Test
	public void alternateWayToGetTextOfWebElement() {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.get("https://www.linkedin.com/");

		WebElement pageText = driver.findElement(By.xpath("//h1[@data-test-id= 'hero__headline']"));

		System.out.println(getElementText01(pageText));
		System.out.println(getElementText02(pageText));
		System.out.println(getElementText03(pageText));

		driver.quit();
	}

	public static String getElementText01(WebElement ele) {

		String eleText = null;
		System.out.println("USING GET TEXT METHOD");
		eleText = ele.getText();

		return eleText;
	}

	public static String getElementText02(WebElement ele) {

		String eleText = null;
		System.out.println("USING GET ATTRIBUTE METHOD -- INNER TEXT");
		eleText = ele.getAttribute("innerText");

		return eleText;
	}
	
	public static String getElementText03(WebElement ele) {

		String eleText = null;
		System.out.println("USING GET ATTRIBUTE METHOD -- TEXT CONTENT");
		eleText = ele.getAttribute("textContent");

		return eleText;
	}
}
