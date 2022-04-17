package seleniumBasic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readExcelSheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String newContractRef = null;

		try {

			FileInputStream fis = new FileInputStream("./TestData/CC-Sample Contract Import sheet.Xlsx");

			XSSFWorkbook wb = new XSSFWorkbook(fis);

			XSSFSheet sheet = wb.getSheetAt(0);

			newContractRef = sheet.getRow(3).getCell(0).getStringCellValue();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}

		System.out.println(newContractRef);

	}
	

}
