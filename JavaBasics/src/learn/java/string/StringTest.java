package learn.java.string;

public class StringTest {

	public static void main(String[] args) {
		// String initialization - literal way

		String name1 = "Abhi";
		String name2 = "Abhi";

		System.out.println("Literal Comparision: " + (name1 == name2)); // True

		String name3 = name1.concat("Ram"); // Concat Method

		System.out.println(name1); // Abhi
		System.out.println("Concatenated String: " + name3); // AbhiRAm

		String name4 = new String("Abhi"); // Object Creation way

		System.out.println("literal with object comparision: " + (name1 == name4));
		System.out.println("Comparision with Equals: " + name1.equals(name4));

		// String utility methods:

		System.out.println("Char at 3rd position: " + name1.charAt(2));
		System.out.println("Char at 3rd position: " + name1.split("b")[1]);
		System.out.println("Name contains Ram: " + name3.contains("Ram"));

		System.out.println("Name ends with Ram: " + name3.endsWith("Ram"));
		System.out.println("Name index of R: " + name3.indexOf('R'));
		System.out.println("Last index of m: " + name3.lastIndexOf('m'));
		System.out.println("Length of name3: " + name3.length());
		System.out.println("Substring from 4th Index: "+name3.substring(4));

	}

}
