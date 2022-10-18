package learn.java.exception;

import java.util.Scanner;

public class HandleArithematicException {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter first no: ");
		int a = input.nextInt();
		System.out.println("Enter Second no: ");
		int b = input.nextInt();

		division(a, b);

	}

	private static void division(int a, int b) {
		try {
			System.out.println("Division Output: " + (a / b));
			String name = null;
			name.concat("Java");
		} catch (ArithmeticException e) { // Catching Multiple Exceptions
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Completed");
		}

	}

}
