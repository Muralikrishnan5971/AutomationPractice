package javaForTesters;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadDataFromTxtAndCsv {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		writeTextFile();
		
//		writeCsvFile();
	}

	public static void writeTextFile() throws IOException {

		// To write into a text file
		File file = new File("E:\\MyWorkspace\\SeleniumBasics\\MyFiles\\testTxt.txt");

		// FileWriter fw = new FileWriter(file, true); --> To append the text to the
		// file
		FileReader fw = new FileReader(file);

		BufferedReader bw = new BufferedReader(fw);

		System.out.println(bw.readLine());
		System.out.println(bw.readLine());	//Reads the next line
		
//		But in real testing scenarios we would use loops to match containing 
//		test and then read that particular line.
		
		
		bw.close();
	}
	
	public static void writeCsvFile() throws IOException {

		// To write into a text file
		File file = new File("E:\\MyWorkspace\\SeleniumBasics\\MyFiles\\testCSV.csv");

		// FileWriter fw = new FileWriter(file, true); --> To append the text to the
		// file
		FileReader fw = new FileReader(file);

		BufferedReader bw = new BufferedReader(fw);

		System.out.println(bw.readLine());

		bw.close();
	}
}
