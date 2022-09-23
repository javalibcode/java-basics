
public class EmployeeTest {

	public static void main(String[] args) {

		// int i = 10;
		// Creation / Born
		Employee emp1 = new Employee();
		Employee emp2 = new Employee(-2, "Mahender", "SDEV", "SD");
		Employee emp3 = new Employee(3);

		/*
		 * emp.empId = 1; emp.empName = "Abhi"; emp.empDepartment = "SD";
		 * emp.empDesignation = "DEV";
		 */

		emp1.doWork();
		emp2.doWork();
		emp3.doWork();

	}

}
