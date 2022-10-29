package learn.java.enumdemo;

public class AmountCalculation {

	public static void main(String[] args) {
		double amount = 1000.00;

		PaymentType[] payments = PaymentType.values();

		for (PaymentType ptype : payments) {
			System.out.println(ptype.name() + " =>  " + (amount * ptype.getFee()));
		}

	}

}
