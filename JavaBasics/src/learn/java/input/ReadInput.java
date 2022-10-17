package learn.java.input;

import java.util.Scanner;

public class ReadInput {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter First no: ");
		int a = input.nextInt();
		System.out.println("Enter Second no: ");
		int b = input.nextInt();

		System.out.println("Addition: " + (a + b));
		System.out.println("Multiplication: " + (a * b));

		input.close();

	}

}
