
public class SBIBank implements RBIInterface {

	public void openAccount(String customerName) {
		System.out.println("SBI Account for "+customerName+ " Opened");

	}

	public int getInterestAmount() {
		return 4;
	}

}
