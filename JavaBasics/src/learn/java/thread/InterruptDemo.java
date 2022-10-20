package learn.java.thread;

public class InterruptDemo extends Thread {

	public static void main(String[] args) {

		System.out.println("Main Start");
		InterruptDemo demo = new InterruptDemo();
		demo.start();

		while (true) {
			if (InterruptObject.getI() == 3) {
				demo.interrupt();
				break;
			}
		}

		System.out.println("Main End");

	}

	@Override
	public void run() {

		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(2000);
				InterruptObject.setI(i);
			} catch (InterruptedException e) {
				System.out.println("Child Interrupted");
				e.printStackTrace();
				break;
			}
		}

	}

}
