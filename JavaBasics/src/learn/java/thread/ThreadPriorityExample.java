package learn.java.thread;

public class ThreadPriorityExample {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getName() + " Main Start");
		
		Addition add = new Addition(2, 3);
		add.setName("Addition Thread");
		add.setPriority(Thread.MAX_PRIORITY);
		
		Subtraction sub = new Subtraction(5, 2);
		sub.setName("Subtract Thread");
		sub.setPriority(Thread.MIN_PRIORITY);
		
		add.start();
		sub.start();

		System.out.println(Thread.currentThread().getName() + " Main End");

	}

}
