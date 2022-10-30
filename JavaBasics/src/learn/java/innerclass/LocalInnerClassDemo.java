package learn.java.innerclass;

public class LocalInnerClassDemo {

	public void callMethod() {

		System.out.println("Before Local class");

		class Local {
			int local;

			public Local(int local) {
				this.local = local;
			}

			public void printLocalVariable() {
				System.out.println(this.local);
			}
		}

		Local l = new Local(2);
		l.printLocalVariable();

		System.out.println("After Local class");

	}

	public static void main(String[] args) {

		LocalInnerClassDemo demo = new LocalInnerClassDemo();
		demo.callMethod();
		
		
	}

}
