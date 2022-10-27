package learn.java.collections;

import java.util.Set;
import java.util.TreeSet;

public class StudentTreeSetDemo {

	public static void main(String[] args) {
		Student student = null;

		Set<Student> sSet = new TreeSet<Student>();

		for (int i = 0; i <= 10;) {
			student = new Student(i, "Java-" + i);
			sSet.add(student);
			i += 2;

		}

		sSet.add(new Student(5, "Java-5"));
		sSet.add(new Student(3, "Java-3"));
		sSet.add(new Student(7, "Java-7"));

		System.out.println("Set: " + sSet);

	}

}
