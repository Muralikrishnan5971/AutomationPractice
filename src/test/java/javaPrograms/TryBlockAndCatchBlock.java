package javaPrograms;

public class TryBlockAndCatchBlock {

	// Yes, It is possible to have a try block without a catch block by using a
	// final block.
	//
	// As we know, a final block will always execute even there is an exception
	// occurred in
	// a try block, except System.exit() it will execute always.
	// we can have multiple catch block
	// we can have empty catch block, but it NOT good practise in java,
	// since catch block catches and handles the exception, If the catch block is
	// empty then we will have no idea what
	// went wrong within our code.

	// When nested try blocks are used, the inner try block is executed first.
	// Any exception thrown in the inner try block is caught in the corresponding
	// catch block.
	// If a matching catch block is not found, then catch block of the outer try
	// block are inspected until all
	// nested try statements are exhausted. If no matching blocks are found, the
	// Java Runtime Environment handles the execution.

	public static void main(String[] args) {

		testTryCatch();
		testNestedTryCatch();
	}

	public static void testTryCatch() {

		try {

			System.out.println("Try block called");

		} finally {

			System.out.println("Finally block called");
		}
	}

	public static void testNestedTryCatch() {

		try {
			System.out.println("Outer Try Block called");
			System.out.println(1 / 0);

			try {
				System.out.println("Inner Try Block called");
				System.out.println(1 / 0);

			} catch (Exception e) {

				System.out.println("Inner Catch Block Called");
			}

		} catch (Exception e) {

			System.out.println("Outer Catch Block called");

		}
	}
}
