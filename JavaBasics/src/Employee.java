
public class Employee {
	// variables
	// Methods
	// Constructors

	int empId;
	String empName; // "Abhi" - F3
	String empDesignation; // "DEV"
	String empDepartment; // SD, Accounts,

	//Constructor
	Employee() {
		empId = 1;
		empName = "Abhi";
		empDesignation = "DEV";
		empDepartment = "SD";
	}
	
	Employee(int id){
		//this(); 
		if(id>=0)
			empId = id;
		
	}
	
	Employee(int id, String name, String desn, String dept) {
		this(id); 
		
		empName = name;
		empDesignation = desn;
		empDepartment = dept;
	}

	// Return Types: void,int, char, long, Objects - String, Array,

	void doWork() {
		System.out.println(empName + " is doing work");
		// return
	}

}
