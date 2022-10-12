package learn.java.math;

public class MathTest {

	public static void main(String[] args) {
		System.out.println("Min 4,6: " + Math.min(4, 6));
		System.out.println("Max 4,6: " + Math.max(4, 6));
		System.out.println("Add 10,20: " + Math.addExact(10, 20));
		System.out.println("Subtract 10,20: " + Math.subtractExact(10, 20));
		System.out.println("Multiply 10,20: " + Math.multiplyExact(10, 20));
		System.out.println("2 power 5: " + Math.pow(2, 5));
		System.out.println("6.1 Floor: " + Math.floor(6.1));
		System.out.println("6.1 Ceil: " + Math.ceil(6.1));
		System.out.println("-6.1 Abs: " + Math.abs(-6.1));

	}

}
