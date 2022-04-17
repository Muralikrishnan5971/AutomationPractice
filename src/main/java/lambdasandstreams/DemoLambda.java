package lambdasandstreams;

public class DemoLambda {

	public static void main(String[] args) {

		withoutLambdaExpression();
		
		withLambdaExpression();
	}

	public static void withoutLambdaExpression() {

		Thread th = new Thread(new Runnable() {

			@Override
			public void run() {

				System.out.println("In another thread");

			}
		});

		th.start();

		System.out.println("In main");
	}

	// function has 4 things
	// 1. name - anonymous
	// 2. paramater list
	// 3. body
	// 4. return type - infered
	public static void withLambdaExpression() {

		Thread th = new Thread(() -> System.out.println("In another thread"));

		th.start();

		System.out.println("In main");
		
	}
}
