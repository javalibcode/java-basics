package learn.java.arrays;

public class ArrayObjectCreationTest {

	public static void main(String[] args) {

		int marks[] = new int[5]; // Declaration, Instantiation

		// initilization

		for (int i = 0; i < marks.length; i++) {
			marks[i] = (i + 1) * 10;
		}

		// for each

		for (int eachMark : marks) {
			System.out.println(eachMark);
		}

	}

}
