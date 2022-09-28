
public class StaticKeyWordTest {

	public static void main(String[] args) throws Exception {

		StaticKeyWord word = new StaticKeyWord();
		StaticKeyWord word1 = new StaticKeyWord();
		word.printValues();

		StaticKeyWord.varValue = 30;
		word.varValue = 40;
		word1.varValue = 50;

		System.out.println(StaticKeyWord.varValue);
		word.printValues();

		/*
		 * Class.forName("StaticKeyWord"); 
		 * Class.forName("StaticKeyWord");
		 */
		StaticKeyWord.printValues();

	}

}
