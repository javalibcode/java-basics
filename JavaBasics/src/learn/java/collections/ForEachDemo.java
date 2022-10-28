package learn.java.collections;

import java.util.ArrayList;
import java.util.List;

public class ForEachDemo {

	public static void main(String[] args) {

		// Control + Shift + O = for organizing import
		Student student = null;
		List<Student> sList = new ArrayList<>();

		for (int i = 1; i <= 5; i++) {
			student = new Student(i, "Java-" + i);
			sList.add(student);
		}

		for (Student std : sList) {
			System.out.println(std);
		}

	}

}
