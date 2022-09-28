
public class FinalChild extends FinalParent {

	void print() {
		System.out.println(TAXPERCENT);
	}

	/*
	 * This is not allowed to override if calculateValue is final
	 */
	/*
	 * double calculateValue(int price) { double finalPrice = price * 1.2; return
	 * finalPrice; }
	 */
}
