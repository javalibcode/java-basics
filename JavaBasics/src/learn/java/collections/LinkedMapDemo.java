package learn.java.collections;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedMapDemo {

	public static void main(String[] args) {

		Map<Integer, Student> map = new LinkedHashMap<Integer, Student>();

		for (int i = 0; i < 5; i++) {
			map.put(Integer.valueOf(i), new Student(i, "Linked Hash Map -" + i));
		}

		// Retrieve Values.

		Set<Integer> keySet = map.keySet();
		// Iterator

		Iterator<Integer> keyItr = keySet.iterator();
		Integer key = null;
		Student student = null;
		System.out.println("Iterator Keyset: ");
		while (keyItr.hasNext()) {
			key = keyItr.next();
			student = map.get(key);

			System.out.println("Key: " + key + " Value: " + student);
		}

		System.out.println("Foreach Keyset: ");
		for (Integer k : keySet) {
			System.out.println("Key: " + k + " Value: " + map.get(k));
		}

		Set<Entry<Integer, Student>> entrySet = map.entrySet();

		System.out.println("Entry Set: ");
		for (Entry<Integer, Student> entry : entrySet) {
			System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
		}

	}

}
