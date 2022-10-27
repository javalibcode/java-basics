package learn.java.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		Student student = null;

		List<Student> sList = new ArrayList<Student>(10);

		for (int i = 1; i <= 5; i++) {
			student = new Student(i, "Java-" + i);
			sList.add(student);
			student = new Student(i, "Java-" + i);
			sList.add(student);
		}

		System.out.println("List: " + sList);

		Set<Student> sSet = new HashSet<Student>();

		sSet.addAll(sList);
		System.out.println("List: " + sSet);

		/*
		 * System.out.println(sList);
		 * 
		 * sList.add(2, new Student(20, "Java-20")); System.out.println(sList);
		 * 
		 * sList.remove(1); System.out.println(sList);
		 * 
		 * System.out.println(sList.contains(new Student(20, "Java-20")));
		 * sList.remove(new Student(20, "Java-20"));
		 * System.out.println(sList.contains(new Student(20, "Java-20")));
		 * 
		 * System.out.println("Size of List: " + sList.size());
		 */

	}

}
