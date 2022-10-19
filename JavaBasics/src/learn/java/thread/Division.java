package learn.java.thread;

public class Division extends Thread {

	private int a;
	private int b;

	public Division(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public void run() {
		System.out.println("Division: " + (this.a / this.b));
	}

}
