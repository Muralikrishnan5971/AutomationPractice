package com.yatra;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptDemoUtility {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.get("https://www.linkedin.com/");

		System.out.println(driver.getTitle());

		System.out.println(getTitleByJavascriptExecutor(driver));

		displayAlertUsingJavascriptExecutor(driver, "Yay!!! Title of the page is " + driver.getTitle());

		Thread.sleep(5000);

		driver.switchTo().alert().accept();

		WebElement passwordElement = driver.findElement(By.id("session_password"));

		WebElement userNameElement = driver.findElement(By.id("session_key"));

		drawBorderAroundElement(passwordElement, driver);
		flashElement(userNameElement, driver);

		WebElement getStarted = driver.findElement(By.xpath("//*[@id=\"main-content\"]/section[7]/div/a"));

		scrollToViewElementByJavascriptExecutor(driver, getStarted);
		Thread.sleep(2000);

		scrollPageDownByJavascriptExecutor(driver);
		Thread.sleep(2000);

		scrollPageUpByJavascriptExecutor(driver);
		Thread.sleep(2000);

		refreshPageByJavascriptExecutor(driver);
		Thread.sleep(2000);

		driver.quit();

	}

	public static void scrollToViewElementByJavascriptExecutor(WebDriver driver, WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public static void scrollPageDownByJavascriptExecutor(WebDriver driver) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

	public static void scrollPageUpByJavascriptExecutor(WebDriver driver) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
	}

	public static void refreshPageByJavascriptExecutor(WebDriver driver) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("history.go(0)");
	}

	public static String getTitleByJavascriptExecutor(WebDriver driver) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		return js.executeScript("return document.title").toString();
	}

	public static void clickElementByJavascriptExecutor(WebDriver driver, WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}

	public static void displayAlertUsingJavascriptExecutor(WebDriver driver, String alertMessage) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("alert ('" + alertMessage + "')");
	}

	public static void drawBorderAroundElement(WebElement element, WebDriver driver) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border = '3px solid red'", element);
	}

	public static void flashElement(WebElement element, WebDriver driver) {

		String bgColor = element.getCssValue("backgroundColor");

		for (int i = 0; i < 50; i++) {

			changeElementColor("#000000", element, driver);
			changeElementColor(bgColor, element, driver);
		}
	}

	public static void changeElementColor(String bgColor, WebElement element, WebDriver driver) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.backgroundColor = '" + bgColor + "'", element);

		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

}
