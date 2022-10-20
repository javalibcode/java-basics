package learn.java.thread;

public class JoinDemo extends Thread {

	public static void main(String[] args) {

		System.out.println("Main Start");

		JoinDemo sleep = new JoinDemo();
		sleep.start();
		try {
			sleep.join(); // Main thread wait till completion of JoinDemo thread
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Main End");
	}

	@Override
	public void run() {
		System.out.println("Child Start");

		for (int i = 1; i <= 5; i++) {
			System.out.println(i);

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

		System.out.println("Child End");
	}

}
