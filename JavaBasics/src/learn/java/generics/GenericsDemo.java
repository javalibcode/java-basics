package learn.java.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsDemo {

	public static void main(String[] args) {

		String[] s = new String[3];
		s[0] = "abc";
		s[1] = "def";
		// s[2] = 2;

		List<String> strings = new ArrayList<String>();
		strings.add("abc");
		strings.add("def");
		// strings.add(2);

		for (Object object : strings) {
			System.out.println(((String) object).toString());
		}

	}

}
