package automationScenarios;

import java.util.concurrent.TimeUnit;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipKartAddToCart {

	@Test
	public void verifyAddToCartInFlipkart() throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.get("https://www.flipkart.com/");

		Actions act = new Actions(driver);
		act.sendKeys(Keys.ESCAPE).build().perform();

		driver.findElement(By.xpath("//div[@class = '_1psGvi _3BvnxG']/div/a")).click();

		// input[@class='_2IX_2- VJZDxU']

		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).clear();
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("muralikrishnan.pro@gmail.com");

		driver.findElement(By.xpath("//input[@type='password']")).clear();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("muraliflipkart");

		driver.findElement(By.xpath("//button[@type='submit']//span")).click();

		Thread.sleep(3000);

		// div[text() = 'My Account']
		WebElement myAccount = driver.findElement(By.xpath("//div[contains(text(),'My Account')]"));

		Actions act1 = new Actions(driver);

		act1.moveToElement(myAccount).build().perform();

//		Thread.sleep(3000);

		WebElement myProfile = driver.findElement(By.xpath("(//div[@class ='_1bQ5Pp']/ul/li)[1]/a"));

		act1.moveToElement(myProfile).click().build().perform();
		
		WebElement searchBar = driver.findElement(By.name("q"));
		act1.moveToElement(searchBar).build().perform();
		
		Thread.sleep(3000);
		
		String emailValue = driver.findElement(By.name("email")).getAttribute("value");
		
		Assertions.assertThat(emailValue).isEqualTo("muralikrishnan.pro@gmail.com");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
