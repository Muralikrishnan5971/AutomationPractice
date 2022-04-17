package nicheTopics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.assertj.core.internal.bytebuddy.pool.TypePool.CacheProvider.Simple.UsingSoftReference;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyDropdownOptionsSorted {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("file:///F:/Murali/testLocalPage.html");

		WebElement singleSelectTagDropdownWebElement = driver.findElement(By.id("SingleDD"));

		Select dropdown = new Select(singleSelectTagDropdownWebElement);

		List<WebElement> dropdownOptions = dropdown.getOptions();

		List<String> unSortedList = new ArrayList<String>();

		for (WebElement webElement : dropdownOptions) {

			System.out.println(webElement.getText());
			unSortedList.add(webElement.getText());
		}

		unSortedList.remove("Select");

		List<String> sortedList = new ArrayList<>(unSortedList);

		Collections.sort(sortedList);
		
		Collections.reverse(sortedList);

		System.out.println(sortedList);

		boolean isSorted = unSortedList.equals(sortedList);

		if (isSorted == true) {
			System.out.println("The DropDown is SORTED");
		} else {
			System.out.println("The DropDown is NOT SORTED");
		}

		driver.quit();
	}
}
