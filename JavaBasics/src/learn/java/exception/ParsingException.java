package learn.java.exception;

import java.util.Scanner;

public class ParsingException {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first no: ");
		String inputString = input.next();

		int no = Integer.parseInt(inputString);

		System.out.println(no);

	}

}
