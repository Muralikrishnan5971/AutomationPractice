package seleniumBasic;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 
 * @author Muralikrishnan
 */

public class BrokenLinks {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		verifyBrokenLinks();
	}

	public static void verifyBrokenLinks() throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_95.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get("http://www.deadlinkcity.com/");

		Thread.sleep(3000);

		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		System.out.println("There are a total of " + linkList.size() + " Links");

		Set<String> brokenLinks = new HashSet<String>();
		
		for (WebElement link : linkList) {

			String linkHref = link.getAttribute("href");

			try {
				
//				This url connection will work in our own system, but while doing in our company we might have proxy issue. 
//				in that case we have to us an instance of proxy class.
				
//				Proxy proxy = new Proxy(Type.HTTP, new InetSocketAddress("hostname", 8080));
				
//				we have to pass this proxy in url connection as --> 	URLConnection urlConnection = url.openConnection(proxy);
				
				URL url = new URL(linkHref);
				URLConnection urlConnection = url.openConnection();
				HttpURLConnection httpUrlConnection = (HttpURLConnection) urlConnection;

				httpUrlConnection.setConnectTimeout(5000);
				httpUrlConnection.connect();

				if (httpUrlConnection.getResponseCode() != 200)
				// System.out.println(linkHref+" - "+httpUrlConnection.getResponseCode()+" -
				// "+httpUrlConnection.getResponseMessage());
				// else
				// System.err.println(linkHref+" - "+httpUrlConnection.getResponseCode()+" -
				// "+httpUrlConnection.getResponseMessage());
				{
					
					brokenLinks.add(linkHref);

				}
				httpUrlConnection.disconnect();

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

				System.out.println(linkHref);
			}
		}

		driver.quit();
		
		for (String bLinks : brokenLinks) {
			
			System.err.println(bLinks);
		}
	}
}
