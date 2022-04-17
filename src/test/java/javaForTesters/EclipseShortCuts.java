package javaForTesters;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EclipseShortCuts {

	public EclipseShortCuts() {
	} // constructors cant be declared as FINAL

	public static String tempStringNewVariable;

	public static void main(String[] args) throws FileNotFoundException {

		System.out.println("Eclipse Shortcuts"); // syso

		// to run --> Alt + Shift + X

		// These short cuts come from eclipse templates
		// Windows --> Preferences --> search for Templates --> java --> templates

		System.out.println("sout short cut"); // sout - customized short cut

		// press and hold window key and press space bar to toggle between Keyboard
		// layout

		// ctrl + D remove the entire line

		WebDriver driver = new ChromeDriver(); // ctrl+ 1 to import

		// ctrl+ m --> maximixe and minimize screen

		int a = 0;

		// ctrl+1 lets you change if else statments to switch and vice versa,
		// remove braces
		if (a == 5) {
			System.out.println("its 5");
		} else {
			System.out.println("its not 5");
		}

		FileInputStream inputStream = new FileInputStream("file path");

		tempStringNewVariable = new String(); // ctrl+ 2 to assign a class level or local variable

		System.out.println("Alt + up arrow, down arrow"); // to move line up or down

		// ctrl+W --> cloase all tabs

		String nameString;
	}

	public static String getTempStirng() {
		return tempStringNewVariable;
	}

	public static void setTempStirng(String tempStirng) {
		EclipseShortCuts.tempStringNewVariable = tempStirng;
	}

}