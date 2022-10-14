package learn.java.string;

public class StringBuilderTest {

	public static void main(String[] args) {

		StringBuilder buffer = new StringBuilder();
		System.out.println(buffer.hashCode());

		buffer.append(1);
		buffer.append(" ");
		buffer.append("Abhi");
		buffer.append(" ");
		buffer.append(true);
		buffer.append(" ");
		buffer.append('C');
		buffer.append(" ");
		buffer.append(100.00);

		System.out.println(buffer);

		System.out.println(buffer.hashCode());
	}

}
