package learn.java.enumdemo;

public enum PaymentType {

	CC(1.01), DC(1.02), UPI(1.0), CASH(1.03);

	double fee;

	PaymentType(double fee) {
		this.fee = fee;
	}

	public double getFee() {
		return this.fee;
	}

}
