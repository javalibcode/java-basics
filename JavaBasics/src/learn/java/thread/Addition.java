package learn.java.thread;

public class Addition extends Thread {

	private int a;
	private int b;

	public Addition(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public void run() {
		System.out.println("Addition: " + (this.a + this.b));
	}

}
