public class FibonacciExample{
	
	public static void main(String[] args){
		int var1 = 0;
		int var2 = 1;
		int sum = 0;
		System.out.print(var1 +" " + var2 +" "); 
		for(int i=1; i<=8; i++){
			sum = var1 + var2;
			System.out.print(sum +" "); 
			var1 = var2;
			var2 = sum; 
		}
		
	}
}