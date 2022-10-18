package learn.java.exception;

public class HandleMultipleExceptions {

	public static void main(String[] args) {

		try {
			String name = null;
			name.concat("Java"); // Null Pointer exception

			int[] array = { 2, 3, 4 };
			for (int i = 0; i <= array.length; i++) {
				System.out.println(array[i]); // ArrayIndexOutOfBoundsException
			}
		}
		// Handling Multiple Exception
		/*
		 * catch (NullPointerException ex) { ex.printStackTrace(); } catch
		 * (ArrayIndexOutOfBoundsException aex) { aex.printStackTrace(); } finally {
		 * System.out.println("Completed"); }
		 */

		// Handling Multiple Exceptions

		catch (NullPointerException | ArrayIndexOutOfBoundsException ex) {
			// TODO: handle exception
			ex.printStackTrace();
		} finally {
			System.out.println("Completed");
		}

	}

}
