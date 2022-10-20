package learn.java.thread;

public class ThreadNamingExample {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getName() + " Main Start");
		Addition add = new Addition(2, 3);
		add.setName("Addition Thread");
		Subtraction sub = new Subtraction(5, 2);
		sub.setName("Subtract Thread");
		
		add.start();
		sub.start();

		System.out.println(Thread.currentThread().getName() + " Main End");

	}

}
