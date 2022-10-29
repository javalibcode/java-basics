package learn.java.collections;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapDemo {

	public static void main(String[] args) throws InterruptedException {

		Map<Integer, String> map = new WeakHashMap<Integer, String>();

		Integer i1 = Integer.valueOf(1);
		Integer i2 = Integer.valueOf(2);
		Integer i3 = Integer.valueOf(3);
		Integer i4 = Integer.valueOf(4);
		Integer i5 = Integer.valueOf(5);

		map.put(i1, "Java-1");
		map.put(i2, "Java-2");
		map.put(i3, "Java-3");
		map.put(i4, "Java-4");
		map.put(i5, "Java-5");
		System.out.println("Before GC");
		System.out.println(map);
		i1 = null;
		i2 = null;
		i3 = null;
		i4 = null;
		i5 = null;

		for(int i=0; i<=10; i++)
			System.gc();
		
		Thread.sleep(5000);

		System.out.println("After GC");
		System.out.println(map);

	}

}
