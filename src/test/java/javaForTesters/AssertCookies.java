package javaForTesters;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertCookies {

	@Test
	public void getCookiesAndAssertThe() {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get("https://www.linkedin.com/");

		checkNoOfCookies(driver, 9);

	}

	public static <E> void checkNoOfCookies(WebDriver driver, int expectedNoOfCookies) {

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Set<Cookie> cookies = driver.manage().getCookies();

		System.out.println(cookies.size());
		System.out.println(cookies);

		ArrayList<Cookie> cookieList = new ArrayList<Cookie>(cookies);

		System.out.println(cookieList.size());
		System.out.println(cookieList);

		for (Cookie c : cookies) {

			System.out.println(c.toString());
		}

		if (cookieList.size() == expectedNoOfCookies)
			System.out.println("We got CORRECT No of Cookies");
		else
			System.err.println("We got WRONG No of Cookies");
	}
}
