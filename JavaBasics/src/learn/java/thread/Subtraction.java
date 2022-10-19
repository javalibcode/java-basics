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
		System.out.println("Subtraction: " + (this.a - this.b));
	}

}
