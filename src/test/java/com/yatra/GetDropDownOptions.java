package com.yatra;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetDropDownOptions {

	@Test
	public void getAmazonAllSearchOptions() {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		WebElement allSearch = driver.findElement(By.id("searchDropdownBox"));
		
		Select sel = new Select(allSearch);
		List<WebElement> options = sel.getOptions();
		
		System.out.println(options.size());
		
		for (WebElement webElement : options) {
			
			System.out.println(webElement.getText());
		}
		
		List<WebElement> optionsByXpath = driver.findElements(By.xpath("//select[@id = 'searchDropdownBox']/option"));
		System.out.println(optionsByXpath.size());	
		
		driver.quit();
		
	}
}
