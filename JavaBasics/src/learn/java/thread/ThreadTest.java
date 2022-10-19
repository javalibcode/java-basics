package learn.java.thread;

public class ThreadTest {

	public static void main(String[] args) {

		System.out.println("Main Thread Started");

		Addition addition = new Addition(2, 3);
		Subtraction subtraction = new Subtraction(2, 3);
		Multiplication multiplication = new Multiplication(2, 3);
		Division division = new Division(2, 3);

		addition.start();
		subtraction.start();
		multiplication.start();
		division.start();

		System.out.println("Main Thread Ended");

	}

}
