
public class HasATestClass {

	public static void main(String[] args) {
		HasAAddress address = new HasAAddress("HYD", 500092);
		HasAStudent student = new HasAStudent(1, address);

		student.printStudentValues();

	}

}
