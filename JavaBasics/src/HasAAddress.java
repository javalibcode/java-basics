
public class HasAAddress {
	// Instance variables
	String addr;
	int pincode;

	public HasAAddress(String addr, int pincode) {
		this.addr = addr;
		this.pincode = pincode;
	}

	void printAddress() {
		System.out.println(addr + " " + pincode);
	}
}
