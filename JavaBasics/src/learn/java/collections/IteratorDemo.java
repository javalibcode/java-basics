package learn.java.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

	public static void main(String[] args) {

		// Control + Shift + O = for organizing import
		Student student = null;
		List<Student> sList = new ArrayList<>();

		for (int i = 1; i <= 5; i++) {
			student = new Student(i, "Java-" + i);
			sList.add(student);
		}

		Iterator<Student> itr = sList.iterator();

		while (itr.hasNext()) {
			student = itr.next();
			System.out.println(student);
		}

	}

}
