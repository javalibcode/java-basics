package learn.java.thread;

public class InterruptDemo extends Thread {

	public static void main(String[] args) {

		System.out.println("Main Start");
		InterruptDemo demo = new InterruptDemo();
		demo.start();
		demo.interrupt();
		System.out.println("Main End");

	}

	@Override
	public void run() {
		try {
			Thread.sleep(4000);
			System.out.println("Child Thread");
		} catch (InterruptedException e) {
			System.out.println("Child Interrupted");
		}
	}

}
