package learn.java.annotations;

public class DepricatedDemo {

	@Deprecated
	public void method() {
		System.out.println("Depricated Method");
	}

	public void method1() {
		System.out.println("Depricated Method1");
	}

	public static void main(String[] args) {

		DepricatedDemo ddemo = new DepricatedDemo();
		ddemo.method();
		ddemo.method1();
	}

}
