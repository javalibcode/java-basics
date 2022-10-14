package learn.java.string;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		String stdData = "1 Abhi CSE 100";

		StringTokenizer tokenizer = new StringTokenizer(stdData);

		System.out.println("Tokens: "+ tokenizer.countTokens());
		while (tokenizer.hasMoreTokens()) {
			System.out.println(tokenizer.nextToken());
		}

	}

}
