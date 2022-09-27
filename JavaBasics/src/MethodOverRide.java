
public class MethodOverRide {

	int add(int a, int b) {
		int c = a + b;
		return c;
	}

	int add(int a, int b, int c) {
		int x = add(a,b) + c;
		return x;
	}

	public static void main(String[] args) {
		MethodOverRide overRide = new MethodOverRide();
		System.out.println(overRide.add(1, 2));
		System.out.println(overRide.add(1, 2, 3));
	}
}
