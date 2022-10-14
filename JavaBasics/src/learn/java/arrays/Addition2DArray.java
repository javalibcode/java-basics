package learn.java.arrays;

public class Addition2DArray {

	public static void main(String[] args) {

		int[][] m1 = new int[3][3];
		int[][] m2 = new int[3][3];
		int[][] addedMatrix = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				m1[i][j] = (i + 1) * 10 + (j + 1);
				m2[i][j] = (j + 1) * 10 + (i + 1);
			}
		}
		System.out.println("Printing m1:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(m1[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Printing m2:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(m2[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Adding m1 & m2 matrices:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				addedMatrix[i][j] = m1[i][j] + m2[i][j];
				// System.out.print(m1[i][j] + m2[i][j] + " ");
			}
			// System.out.println();
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(addedMatrix[i][j] + " ");
			}
			System.out.println();
		}

	}

}
