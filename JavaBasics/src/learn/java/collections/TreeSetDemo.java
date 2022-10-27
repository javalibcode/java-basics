package learn.java.collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		Student student = null;

		Set<Integer> sSet = new TreeSet<Integer>();

		for (int i = 0; i <= 10;) {
			// student = new Student(i, "Java-" + i);
			sSet.add(Integer.valueOf(i));
			i += 2;
		}

		sSet.add(Integer.valueOf(5));
		sSet.add(Integer.valueOf(3));
		sSet.add(Integer.valueOf(7));

		System.out.println("Set: " + sSet);

	}

}
