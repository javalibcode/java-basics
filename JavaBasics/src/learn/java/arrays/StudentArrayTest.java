package learn.java.arrays;

public class StudentArrayTest {

	public static void main(String[] args) {

		Student s = new Student(1, "Abhi");
		// int[] array = new int[5];
		Student[] studentArray = new Student[5];
		studentArray[0] = new Student(1, "Abhi1");
		studentArray[1] = new Student(2, "Abhi2");

		for (int i = 0; i < studentArray.length; i++) {
			studentArray[i] = new Student((i + 1), "Abhi-" + (i + 1));
		}

		for (Student student : studentArray) {
			System.out.println(student);
		}

	}

}
