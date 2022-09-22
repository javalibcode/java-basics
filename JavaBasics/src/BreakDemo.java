public class BreakDemo{
	
	public static void main(String[] args){
		int sum = 0; 
		
		for( int i=1; i<= 100 ; i++ ){
			
			if(i == 50){
				break; 
			}
			sum += i; 
			
		}
		
		System.out.println(sum); 
		
	}
}