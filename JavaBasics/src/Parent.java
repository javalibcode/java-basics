
public class Parent {

	int var;

	Parent() {
		System.out.println("Parent Constructor");
	}

	Parent(int i) {
		var = i;
		System.out.println("Parent Constructor: " + i);
	}

	void doTask() {
		System.out.println("Parent is doing Task");
	}

	void performJob() {
		System.out.println("Parent is doing Job");
	}

}
