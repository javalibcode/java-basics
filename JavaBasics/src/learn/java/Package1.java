package learn.java;

public class Package1 {

	public static void main(String[] args) {
		Class1 c1 = new Class1();
		c1.print();
		// System.out.println(c1.i); i is private
		

		Class2 c2 = new Class2();
		c2.print();

	}

}
