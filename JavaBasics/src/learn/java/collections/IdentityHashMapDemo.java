package learn.java.collections;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {

	public static void main(String[] args) throws InterruptedException {

		Map<Student, String> map = new HashMap<Student, String>();

		Student s1 = new Student(1, "Java-1");
		Student s2 = new Student(1, "Java-2");

		map.put(s1, "Java-1");
		map.put(s2, "Java-2");

		System.out.println("Hash Map");
		System.out.println(map);

		Map<Student, String> iMap = new IdentityHashMap<Student, String>();

		iMap.put(s1, "Java-1");
		iMap.put(s2, "Java-2");

		System.out.println("Identity Hash Map");
		System.out.println(iMap);

	}

}
