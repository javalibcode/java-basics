package learn.java.collections;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		Student student = null;

		Set<Student> sSet = new LinkedHashSet<Student>();
		Random ran = new Random();
		for (int i = 1; i <= 50; i++) {
			student = new Student(ran.nextInt(10), "Java-" + i);
			sSet.add(student);

		}

		System.out.println("Set: " + sSet);

		sSet.add(new Student(20, "Java-20"));
		System.out.println(sSet);

		sSet.remove(new Student(20, "Java-20"));
		System.out.println(sSet);

		System.out.println(sSet.contains(new Student(20, "Java-20")));

		System.out.println("Size of List: " + sSet.size());

	}

}
