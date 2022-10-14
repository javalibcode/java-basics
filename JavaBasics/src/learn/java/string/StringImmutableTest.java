package learn.java.string;

public class StringImmutableTest {

	public static void main(String[] args) {
		String buffer = new String();

		System.out.println(buffer.hashCode());

		buffer = buffer.concat(1 + "");
		buffer = buffer.concat(" ");
		buffer = buffer.concat("Abhi");
		buffer = buffer.concat(" ");
		buffer = buffer.concat(true + "");
		buffer = buffer.concat(" ");
		buffer = buffer.concat('C' + "");
		buffer = buffer.concat(" ");
		buffer = buffer.concat(100.00 + "");

		System.out.println(buffer);
		System.out.println(buffer.hashCode());

	}

}
