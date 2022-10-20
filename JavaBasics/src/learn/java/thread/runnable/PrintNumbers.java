package learn.java.thread.runnable;

public class PrintNumbers implements Runnable {

	@Override
	public void run() {

		System.out.println("Printing Numbers: ");
		for (int i = 1; i <= 20; i++)
			System.out.print(i + " ");

	}

}
