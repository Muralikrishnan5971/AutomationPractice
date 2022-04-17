package seleniumBasic;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Muralikrishnan
 * 
 *         This test is to find the Broken Images present in the application
 *         using Selenium Webdriver
 * 
 */
public class BrokenImages {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		verifyBrokenImagesUsingSelenium();

//		verifyBrokenImagesUsingJsoup();

	}

	public static void verifyBrokenImagesUsingSelenium() throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_95.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get("https://www.theworldsworstwebsiteever.com/");

		Thread.sleep(5000);

		List<WebElement> imgList = driver.findElements(By.tagName("img"));
		System.out.println("There are a total of " + imgList.size() + " images");

		for (WebElement image : imgList) {

			// How to know whether a image is broken or not?
			// Image is present inside the img tag and every img tag has a src attribute
			// This src is the image address, so if this image address is valid then this is
			// image is valid.

			String imageSrc = image.getAttribute("src");

			try {

				URL url = new URL(imageSrc);
				URLConnection urlConnection = url.openConnection();
				HttpURLConnection httpURLConnection = (HttpURLConnection) urlConnection;

				httpURLConnection.setConnectTimeout(5000);
				httpURLConnection.connect();

				if (httpURLConnection.getResponseCode() == 200)
					System.out.println(imageSrc + " ->> " + httpURLConnection.getResponseCode() + " ->> "
							+ httpURLConnection.getResponseMessage());
				else
					System.err.println(imageSrc + " ->> " + httpURLConnection.getResponseCode() + " ->> "
							+ httpURLConnection.getResponseMessage());

				httpURLConnection.disconnect();

			} catch (Exception e) {
				// TODO Auto-generated catch block

				e.printStackTrace();
				System.err.println(imageSrc);
			}
		}

		driver.quit();

	}

	public static void verifyBrokenImagesUsingJsoup() throws IOException {

		// https://jsoup.org/ --> To get code

		Document doc = Jsoup.connect("https://www.theworldsworstwebsiteever.com/").get();

		Elements images = doc.select("img");

		for (Element image : images) {

			String imageSrc = image.attr("src");

			if (!imageSrc.startsWith("http"))
				imageSrc = "https://www.theworldsworstwebsiteever.com/" + imageSrc;

			try {

				URL url = new URL(imageSrc);
				URLConnection urlConnection = url.openConnection();
				HttpURLConnection httpURLConnection = (HttpURLConnection) urlConnection;

				httpURLConnection.setConnectTimeout(5000);
				httpURLConnection.connect();

				if (httpURLConnection.getResponseCode() == 200)
					System.out.println(imageSrc + " ->> " + httpURLConnection.getResponseCode() + " ->> "
							+ httpURLConnection.getResponseMessage());
				else
					System.err.println(imageSrc + " ->> " + httpURLConnection.getResponseCode() + " ->> "
							+ httpURLConnection.getResponseMessage());

				httpURLConnection.disconnect();

			} catch (Exception e) {
				// TODO Auto-generated catch block

				e.printStackTrace();
				System.err.println(imageSrc);
			}
		}
	}

}
