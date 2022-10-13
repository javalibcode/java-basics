package learn.java.arrays;

public class TwoDimArray {

	public static void main(String[] args) {

		int[][] m = new int[3][3];
		m[0][0] = 1;

		int z = 1;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				m[i][j] = z++;
			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println(); 
		}
	}

}
