package learn.java.string;

public class StringBufferTest {

	public static void main(String[] args) {

		StringBuffer buffer = new StringBuffer();
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
