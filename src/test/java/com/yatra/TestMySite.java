package com.yatra;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestMySite {

	public static void main(String[] args) {
		
//		WebDriverManager.chromedriver().setup();
		
//		WebDriver driver = new ChromeDriver();
//		
//		driver = new ChromeDriver();
//		
//		driver = new ChromeDriver();
//
//		driver.get("https://www.google.com");
//		
//		driver.switchTo().alert();
		
		List<Integer> intlist = new ArrayList<>();
		
		intlist.add(5);
		intlist.add(7);
		intlist.add(2);
		intlist.add(1);
		intlist.add(9);
		intlist.add(3);
		
		System.out.println(intlist);
		Collections.sort(intlist);
		
		System.out.println(intlist);
		
		intlist.getClass();
		
		WebDriver driver = new ChromeDriver();
		driver.get("");
		driver.navigate().to("");
		
	
	}

}
