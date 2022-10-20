package learn.java.thread;

public class Subtraction extends Thread {

	private int a;
	private int b;

	public Subtraction(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public void run() {

		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(
					Thread.currentThread().getName() + "Iteration : " + i + " Subtraction: " + (this.a - this.b));

		}
	}

}
