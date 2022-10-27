package learn.java.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		Student student = null;

		List<Student> sList = new ArrayList<Student>();

		for (int i = 1; i <= 5; i++) {
			student = new Student(i, "Java-" + i);
			sList.add(student);
		}

		System.out.println(sList);

		sList.add(2, new Student(20, "Java-20"));
		System.out.println(sList);

		sList.remove(1);
		System.out.println(sList);

		System.out.println(sList.contains(new Student(20, "Java-20")));
		sList.remove(new Student(20, "Java-20"));
		System.out.println(sList.contains(new Student(20, "Java-20")));

		System.out.println("Size of List: " + sList.size());

	}

}
