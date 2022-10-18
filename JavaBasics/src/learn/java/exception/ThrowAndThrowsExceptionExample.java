package learn.java.exception;

public class ThrowAndThrowsExceptionExample {

	public static void main(String[] args) {
		method1();
		System.out.println("Main  Completed");
	}

	public static void method1() {
		method2();
		System.out.println("Method 1 Completed");
	}

	private static void method2() {
		try {
			method3(); // NullPointerException
		} catch (NullPointerException e) {
			System.out.println("Method 2: " + e.getMessage());
		}
		System.out.println("Method 2 Completed");
	}

	private static void method3() throws NullPointerException {
		try {
			String name = null;
			name.concat("Java");
		} catch (Exception e) {
			throw new NullPointerException("Method3 Exception");
		}
		System.out.println("Method 3 Completed");

	}

}
