public class FibonacciArgumentExample{
	
	public static void main(String[] args){
		int n = Integer.parseInt(args[0]);
		
		int var1 = 0;
		int var2 = 1;
		int sum = 0;
		System.out.print(var1 +" " + var2 +" "); 
		for(float i=1.2f; i<=(n-2); i++){
			sum = var1 + var2;
			System.out.print(sum +" "); 
			var1 = var2;
			var2 = sum; 
		}
		
	}
}