package learn.java.exception;

import java.util.Scanner;

public class DivisionException {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first no: ");
		int a = input.nextInt();
		System.out.println("Enter Second no: ");
		int b = input.nextInt();

		System.out.println("Division Output: " + (a / b));

		System.out.println("Completed");
	}

}
