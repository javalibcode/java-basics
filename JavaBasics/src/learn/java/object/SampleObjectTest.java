package learn.java.object;

public class SampleObjectTest {

	public static void main(String[] args) {
		Sample sample1 = new Sample(5);
		Sample sample2 = new Sample(6);
		// sample1.printValue();

		System.out.println("Sample 1:" + sample1.hashCode());
		System.out.println("Sample 1:" + sample1.toString());

		System.out.println("Sample 2:" + sample2.hashCode());
		System.out.println("Sample 2:" + sample2.toString());

		System.out.println("Sample1 equals to Sample 2: " + sample1.equals(sample2));
	}

}
