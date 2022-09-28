
public class StaticKeyWord {

	// static - variables, methods, blocks,
	static {
		System.out.println("Static Block");
		varValue = 20; 
	}

	static int varValue;

	static void printValues() {
		System.out.println("value: " + varValue);
	}

}
