package learn.java.exception;

public class CustomExceptionExample {

	public static void main(String[] args) {
		String name = "Kiran";
		try {
			boolean isAvailable = checkUserID(name);
			System.out.println("User " + name + " is available? " + isAvailable);
		} catch (UserIDUnavailableException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("User Check Completed");
		}

	}

	private static boolean checkUserID(String name) throws UserIDUnavailableException {

		if (name.equalsIgnoreCase("Abhi")) {
			return true;
		} else {
			// return false;
			throw new UserIDUnavailableException(name + " User not available");
		}

	}

}
