
public class HasAStudent {
	int studentID;
	HasAAddress aAddress;
	//HasAAddress permAddress;

	public HasAStudent(int studentID, HasAAddress aAddress) {
		this.studentID = studentID;
		this.aAddress = aAddress;

	}

	void printStudentValues() {
		System.out.println("Student: "+ this.studentID);
		System.out.println("Address: "+ this.aAddress);
		this.aAddress.printAddress();
	}

}
