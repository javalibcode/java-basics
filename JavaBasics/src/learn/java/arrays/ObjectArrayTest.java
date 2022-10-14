package learn.java.arrays;

public class ObjectArrayTest {

	public static void main(String[] args) {

		Object[] objArray = new Object[5];

		objArray[0] = new String("Abhi");
		objArray[1] = new Student(2, "Abhi2");
		objArray[2] = Integer.valueOf(3);
		objArray[3] = Boolean.valueOf("true");
		objArray[4] = Character.valueOf('A');

		for (Object obj : objArray) {

			if (obj instanceof Student) {
				Student s = (Student) obj;
				System.out.println(s.getStdID() + " - " + s.getStdName());
			} else {
				System.out.println(obj);
			}
		}

	}

}
