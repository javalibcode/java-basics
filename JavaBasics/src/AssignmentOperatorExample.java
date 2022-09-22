public class AssignmentOperatorExample1{
	
	public static void main(String[] args){
		// Assignment Operators : =, +=, -=, *=, /=, %=
		
		int a = 7; 
		a+=5; // a = a+5
		System.out.print(a+" ");
		a-=5; // a = a-5
		System.out.print(a+" ");
		a*=5; // a = a*5
		System.out.print(a+" ");
		a/=5; // a = a/5
		System.out.print(a+" ");
		a%=5; // a = a%5
		System.out.print(a+" ");
		
		a&=2;
		System.out.println(a);
		
		a|=2;
		System.out.println(a);
		
		a^=2;
		System.out.println(a);
		
		a<<=2;
		System.out.println(a);
		
		a>>=2;
		System.out.println(a);
		
		a>>>=2;
		System.out.println(a);
		
		
	}
	

}