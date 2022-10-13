package learn.java.string;

public class StringLastIndexExample {

	public static void main(String[] args) {
		
		String data = "ABHIRAM^20^01-01-2002^100"; 
		
		int index = data.lastIndexOf('^');
		System.out.println("Marks: "+data.substring(index+1)); 
		System.out.println(data.substring(0, index)); 

	}

}
