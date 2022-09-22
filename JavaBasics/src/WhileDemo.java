public class WhileDemo{
	
	public static void main(String[] args){
		
		int i = 0;
		int sum = 0; 
		while(i < 100){
			// These statements will be executed. 
			/*
			if(i%2 == 0) { // This will sum only even numbers
				sum = sum + i; 
			}
			*/
			i++;
			if(i%2 != 0){
				continue; 
			}
			
			sum = sum + i; 
			
			 
			
		}
		
		
		System.out.println(sum); 
		
	}
}