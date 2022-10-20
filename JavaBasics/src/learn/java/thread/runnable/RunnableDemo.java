package learn.java.thread.runnable;

public class RunnableDemo {

	public static void main(String[] args) {

		PrintNumbers numbers = new PrintNumbers();
		/*
		 * Addition add = new Addition(2, 3); add.start();
		 * 
		 */
		System.out.println("Main Thread Started");
		Thread child = new Thread(numbers);
		child.start();
		System.out.println("Main Thread Ended");

	}

}
