package learn.java.generics;

import learn.java.collections.Student;

public class CustomObjectDemo {

	public static void main(String[] args) {

		// List<String>; List<Integer>; List<Student>

		CustomObject<String> stringCO = new CustomObject<String>("Java");
		CustomObject<Integer> intCO = new CustomObject<Integer>(2);
		CustomObject<Double> doubleCO = new CustomObject<Double>(2.0);
		CustomObject<Student> stdCO = new CustomObject<Student>(new Student(1, "Java"));

		stringCO.displayClass();
		stringCO.displayObject();

		intCO.displayClass();
		intCO.displayObject();

		doubleCO.displayClass();
		doubleCO.displayObject();

		stdCO.displayClass();
		stdCO.displayObject();

	}

}
