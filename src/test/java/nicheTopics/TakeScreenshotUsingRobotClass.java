package nicheTopics;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenshotUsingRobotClass {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("file:///F:/Murali/testLocalPage.html");
		
		takeScreenShotUsingRobotClass();
	}

	public static void takeScreenShotUsingRobotClass() {

		try {

			Robot rbt = new Robot();

			Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

			Rectangle rectangleScreenSize = new Rectangle(screenSize);

			BufferedImage tempImg = rbt.createScreenCapture(rectangleScreenSize);

			String destImgPath = "./screenshots/usingRobot" + Math.random() + ".png";

			ImageIO.write(tempImg, "png", new File(destImgPath));

		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
	}
}
