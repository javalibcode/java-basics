package learn.java.exception;

public class ArrayIndexException {

	public static void main(String[] args) {
		int[] array = { 2, 3, 4 };

		for (int i = 0; i <= array.length; i++) {
			System.out.println(array[i]);
		}

		System.out.println("Completed");
	}

}
