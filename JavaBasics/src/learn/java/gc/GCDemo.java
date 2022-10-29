package learn.java.gc;

public class GCDemo {

	public static void main(String[] args) {

		Student s1 = null; //
		Student s2 = null;

		s1 = new Student(1, "Java-1"); // s1 = 2000
		s2 = new Student(2, "Java-2"); // s2 = 3000

		s1 = null;
		s2 = null;
		System.out.println("Main is going to sleep");
		System.gc();
		/*
		 * try { Thread.sleep(10000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */

		System.out.println("GC Completed");

	}

}
