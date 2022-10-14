package learn.java.string;

public class StringSplitTest {

	public static void main(String[] args) {

		String stdData = "1 Abhi CSE 100";
		String[] splitData = stdData.split(" ");

		for (String eachData : splitData) {
			System.out.println(eachData);
		}

		System.out.println(splitData[0]);
		System.out.println(splitData[1]);
		System.out.println(splitData[2]);
		System.out.println(splitData[3]);
		// System.out.println(splitData[4]);

	}

}
