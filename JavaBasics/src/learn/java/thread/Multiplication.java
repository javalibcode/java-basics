package learn.java.thread;

public class Multiplication extends Thread {

	private int a;
	private int b;

	public Multiplication(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public void run() {
		System.out.println("Multiplication: " + (this.a * this.b));
	}

}
