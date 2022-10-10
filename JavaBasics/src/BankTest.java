
public class BankTest {

	public static void main(String[] args) {
		RBIInterface bank = getBank(args[0]);
		bank.openAccount("Abhi");
		System.out.println("Interest Rate: " + bank.getInterestAmount());

	}

	static RBIInterface getBank(String option) {

		RBIInterface bank = null;
		if ("SBI".equals(option)) {
			bank = new SBIBank();
		} else if ("ICICI".equals(option)) {
			bank = new ICICIBank();
		} else if ("AB".equals(option)) {
			bank = new ABBank();
		}

		return bank;
	}

}
