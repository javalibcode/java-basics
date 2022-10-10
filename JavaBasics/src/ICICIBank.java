
public class ICICIBank implements RBIInterface {

	public void openAccount(String customerName) {
		System.out.println("ICICI Account for "+customerName+ " Opened");

	}

	public int getInterestAmount() {
		return 5;
	}

}
