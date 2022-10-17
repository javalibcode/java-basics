package learn.java.exception;

public class NullException {

	public static void main(String[] args) {
		String name = args[0];

		String updatedValue = name.concat("Java");

		System.out.println(updatedValue);
		
		System.out.println("Completed!");
	}

}
