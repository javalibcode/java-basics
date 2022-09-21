public class DayBreakDemo{
	
	public static void main(String[] args){
		int sum = 0; 
		int i=1; 
		while(true){
			for( ; i<= 7 ; i++ ){
					if(i==4) {
						i++; // Wednesday 
						break; 
					}
					System.out.println("Today is : "+i);
					if(i == 7) {
						i = 0; 
					}
			}
		}
			
	}
	
}