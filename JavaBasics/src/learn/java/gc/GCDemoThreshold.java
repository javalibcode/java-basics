package learn.java.gc;

public class GCDemoThreshold {

	public static void main(String[] args) {

		 
		for(int i=0; i<1000000; i++) {
			new Student(i, "Java-"+i); 
		}
	}

}
