package javaForTesters;

import java.util.EnumMap;
import java.util.Map;

public class MyEnnumRunner {

	public static void main(String[] args) {

		// java compiler by default adds a toString ti enums
		System.out.println(SeverityOfIssue.CRITICAL);
		System.out.println(SeverityOfIssue.HIGH);
		System.out.println(SeverityOfIssue.MEDIUM);
		System.out.println(SeverityOfIssue.LOW);

		SeverityOfIssue[] a = SeverityOfIssue.values();
		System.out.println(a);

		for (SeverityOfIssue severityOfIssue : a) {
			System.out.println(severityOfIssue);
		}

		Map<SeverityOfIssue, String> map = new EnumMap<SeverityOfIssue, String>(SeverityOfIssue.class);
		map.put(SeverityOfIssue.CRITICAL, "critical");
		map.put(SeverityOfIssue.HIGH, "high");

		System.out.println(map);
	}
}
