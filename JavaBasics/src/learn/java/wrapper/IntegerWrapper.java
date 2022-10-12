package learn.java.wrapper;

public class IntegerWrapper {

	public static void main(String[] args) {
		int a = 5;
		int b = 6;// Primitive

		Integer x = Integer.valueOf(a);
		System.out.println(x);
		System.out.println(x.intValue());

		String number = "100";
		int num = Integer.parseInt(number);
		System.out.println("Num: " + num);

	}

}
