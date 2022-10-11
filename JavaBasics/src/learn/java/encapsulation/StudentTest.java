package learn.java.encapsulation;

public class StudentTest {

	public static void main(String[] args) {
		Student student = new Student();
		System.out.println(student.getName() + " - " + student.getRollno());
		
		student.setName("A");
		// student.name = "123"; Does not allow 
		student.setRollno(1);

		System.out.println(student.getName() + " - " + student.getRollno());

	}

}
