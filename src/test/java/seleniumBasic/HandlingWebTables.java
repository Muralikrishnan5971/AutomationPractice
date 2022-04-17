package seleniumBasic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingWebTables {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get("https://devlg.ls2software.com/");

		driver.findElement(By.id("UserName")).sendKeys("user1.ls2test@gmail.com");

		driver.findElement(By.id("Password")).sendKeys("Level3&ls2");

		driver.findElement(By.xpath("//*[contains(text(),'Login')]")).click();
		Thread.sleep(2000);

		driver.findElement(By.linkText("Contracts")).click();
		Thread.sleep(3000);

		WebElement table = driver.findElement(By.id("contract-list"));

		List<WebElement> allRows = table.findElements(By.xpath("//tbody//tr"));

		System.out.println(allRows.size());

		for (WebElement e : allRows) {

			// System.out.println(e.getText());

			List<WebElement> row = e.findElements(By.tagName("td"));

			System.out.println(row.size());
			System.out.println(row.get(1).getText());
		}

		// driver.quit();

	}

}
