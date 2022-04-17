package lambdasandstreams;

import java.util.ArrayList;
import java.util.List;

import org.assertj.core.util.Arrays;

public class PrintListUsingLambda {

	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<>();

		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		numbers.add(9);
		numbers.add(10);
		numbers.add(511);

		// external iterators
		for (int i = 0; i < numbers.size(); i++) {

			System.out.println(numbers.get(i));
		}

		// external iterators
		for (int i : numbers) {

			System.out.println(i);
		}

		numbers.forEach((Integer i) -> System.out.println(i));
		
		// Java 8 has type inference
		numbers.forEach((i) -> System.out.println(i));
		
		// Parenthesis is optional, but only for one parameter lambdas
		numbers.forEach(i -> System.out.println(i));
		
		// we have replaced the lambda with mwthod reference
		numbers.forEach(System.out::println);
	}
}
