package javaForTesters;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataToTxtAndCsv {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		writeCSVFile();
	}

	public static void writeTextFile() throws IOException {

		// To write into a text file
		File file = new File("E:\\MyWorkspace\\SeleniumBasics\\MyFiles\\testTxt.txt");

		// FileWriter fw = new FileWriter(file, true); --> To append the text to the
		// file
		FileWriter fw = new FileWriter(file);

		BufferedWriter bw = new BufferedWriter(fw);

		bw.write("This to write in the text file using java api's");

		bw.close();
	}

	public static void writeCSVFile() throws IOException {

		// To write into a text file
		File file = new File("E:\\MyWorkspace\\SeleniumBasics\\MyFiles\\testCSV.csv");

		// FileWriter fw = new FileWriter(file, true); --> To append the text to the file
		FileWriter fw = new FileWriter(file);

		BufferedWriter bw = new BufferedWriter(fw);

		bw.write("First Data in the CSV file");

		bw.close();
	}
}
