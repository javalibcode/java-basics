public class DoWhileDemo{
	
	public static void main(String[] args){
		
		int i = 1;
		int sum = 0; 
		do{
			// These statements will be executed. 
			if(i%2 == 0) { // This will sum only even numbers
				sum = sum + i; 
			}
			System.out.println("i value "+ i); 
			i++; 
		}while(i < 1);
		
		
		System.out.println(sum); 
		
	}
}