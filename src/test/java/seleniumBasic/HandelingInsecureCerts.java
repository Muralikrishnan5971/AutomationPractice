package seleniumBasic;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandelingInsecureCerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DesiredCapabilities dc = DesiredCapabilities.chrome();
		
		dc.acceptInsecureCerts(); // these two are same
		dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		
		dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		// Merge to local browser
		ChromeOptions opt = new ChromeOptions();
		opt.merge(dc);
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver(opt);
	}

}
