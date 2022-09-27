
public class Child extends Parent {

	Child() {
		super(); 
		System.out.println("Child Constructor");
	}

	void doTask() {
		super.doTask();
		super.performJob();
		System.out.println("Child is doing Task");

	}

}
