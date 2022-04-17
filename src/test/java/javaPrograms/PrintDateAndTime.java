package javaPrograms;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PrintDateAndTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd-HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(dtf.format(now));

	}

}
