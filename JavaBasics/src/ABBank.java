
public class ABBank implements RBIInterface {

	public void openAccount(String customerName) {
		System.out.println("AB Account for " + customerName + " Opened");

	}

	public int getInterestAmount() {

		return 3;
	}

}
