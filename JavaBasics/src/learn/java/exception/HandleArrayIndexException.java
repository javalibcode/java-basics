package learn.java.exception;

public class HandleArrayIndexException {

	public static void main(String[] args) {

		try {
			int[] array = { 2, 3, 4 };
			for (int i = 0; i <= array.length; i++) {
				System.out.println(array[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception Message: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Exception Message: " + e.getMessage());
		} finally {
			System.out.println("Completed");
		}

	}

}
