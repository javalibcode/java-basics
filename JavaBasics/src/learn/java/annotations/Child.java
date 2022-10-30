package learn.java.annotations;

public class Child extends Parent {

	public void childMethod() {
		super.method1();
	}

	@Override
	public void method1() {
		System.out.println("Child Method");
	}

	public static void main(String[] args) {
		Child c = new Child();
		c.childMethod();
		c.method1();
	}

}
