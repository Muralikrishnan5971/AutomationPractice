package nicheTopics;

import java.io.IOException;

public class StartCommandUsingJava {

	public static void main(String[] args) {

		Runtime runtime = Runtime.getRuntime();

		try {
			runtime.exec("cmd /c start cmd.exe /K \"java -version\"");

		} catch (IOException e) {

			System.out.println("SOMETHING WENT WRONG");
			e.printStackTrace();
		}
	}
}
