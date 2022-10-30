package learn.java.innerclass;

public class Outer {

	int x;

	public Outer(int x) {
		this.x = x;
	}

	public void print() {
		System.out.println(this.x);
	}

	static class StaticInner {
		int y;

		public StaticInner(int y) {
			this.y = y;
		}

		public void printValue() {
			System.out.println(this.y);
		}

		static public void print() {
			System.out.println("Static Inner Print method");
		}

	}

	class NonStaticInner {
		int z;

		public NonStaticInner(int z) {
			this.z = z;
		}

		public void print() {
			System.out.println(this.z);
		}

		/*
		 * // Static methods are not allowed inside Non Static Inner Class. 
		 * static
		 * public void print1() { System.out.println("Static Inner Print method"); }
		 */

	}
}
