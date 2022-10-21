package learn.java.thread;

public class YieldDemo extends Thread {

	public static void main(String[] args) {
		System.out.println("Main Start");

		YieldDemo yieldDemo = new YieldDemo();
		yieldDemo.start();

		for (int i = 1; i <= 10; i++) {
			System.out.println("Main Thread " + (i));
		}

		System.out.println("Main End");
	}

	@Override
	public void run() {

		Thread.yield();
		
		for (int i = 1; i <= 10; i++) {

			System.out.println("Yield Thread " + (i));
		}

	}

}
