package javaForTesters;

import java.util.HashMap;
import java.util.Map;

public class whatIsStaticBlock {

	private static String a;

	private static Map<String, String> map = new HashMap<String, String>();

	// eager initialization
	static {
		a = "Muralikrishnan";
	}

	static {
		map.put("DEPT", "QA");
	}

	// Latest static block is initialised
	static {
		map.put("QA", "Automation");
	}

	public static void main(String[] args) {

		System.out.println(a);

		System.out.println(map);

	}

}
