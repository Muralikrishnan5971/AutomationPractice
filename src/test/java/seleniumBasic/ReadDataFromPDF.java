package seleniumBasic;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.filefilter.FalseFileFilter;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadDataFromPDF {

	// PDF - Portable Document Format
	// Tools used in market - Apache PDFbox, Open PDF, Itext
	// Apache PDFbox is open source java library
	// we can do read, write, delete, split, merge etc
	// For Java project - Libraries required - (PDFbox, Fontbox, Commons-Logging)
	// three jar files

	@Test(enabled=false)
	public void readPDFfromLocalMachine() throws Exception {

		// 1. To read the pdf document that is available in the local machine

		File file = new File("C:\\Users\\mural\\Desktop\\TestPDF001.pdf");

		FileInputStream fis = new FileInputStream(file); // File input streams reads the data from the file in Raw
															// format

		PDDocument pdfDcocumnet = PDDocument.load(fis);
		System.out.println(pdfDcocumnet.getPages().getCount());

		// to read the entire document
		PDFTextStripper pdfTestStripper = new PDFTextStripper();

		// To read data between any page range
		pdfTestStripper.setStartPage(1);
		pdfTestStripper.setEndPage(1);

		String docuTest = pdfTestStripper.getText(pdfDcocumnet);
		System.out.println(docuTest);

		// Hard Assertions
		org.testng.Assert.assertTrue(docuTest.startsWith("Lorem ipsum"));
		org.testng.Assert.assertTrue(docuTest.contains("fringilla"));

		pdfDcocumnet.close();
		fis.close();

	}

	@Test
	public void readPDFfromBrowser() throws IOException {

		// 2. To read the pdf document from the browser itself
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://file-examples-com.github.io/uploads/2017/10/file-sample_150kB.pdf");

//		driver.findElement(By.xpath("//h3[text() = 'Documents']/following-sibling::a")).click();
//		driver.findElement(By.xpath("//td[text() = 'PDF']/following-sibling::td/a")).click();
//		driver.findElement(By.xpath("//td[text() = '150 kB']/following-sibling::td/a")).click();
		String urlString = driver.getCurrentUrl();

		URL url = new URL(urlString); //Instead we can pass the url directly here to avoid opening the browser
		
		PDDocument pdfDcocumnet = PDDocument.load(url.openStream());

		System.out.println(pdfDcocumnet.getPages().getCount());

		// to read the entire document
		PDFTextStripper pdfTestStripper = new PDFTextStripper();

		// To read data between any page range
		pdfTestStripper.setStartPage(1);
		pdfTestStripper.setEndPage(1);

		String docuTest = pdfTestStripper.getText(pdfDcocumnet);
		System.out.println(docuTest);

		// Hard Assertions
		Assert.assertTrue(docuTest.startsWith("Lorem ipsum"));
		Assert.assertTrue(docuTest.contains("fringilla"));

		pdfDcocumnet.close();

		driver.quit();
	}

}
