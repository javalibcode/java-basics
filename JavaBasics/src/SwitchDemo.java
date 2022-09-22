public class SwitchDemo{
	
	public static void main(String[] args){
		
		int marks = 81;
		int caseChoice = 0; 
		if(marks > 80)
			caseChoice = 1;
		else if(marks > 70)
			caseChoice = 2;
		
		switch(caseChoice){
			case 1:
				System.out.println("Distinction"); 
				
			case 2:
				System.out.println("First Class"); 
				break; 
			default:
				System.out.println("Failed"); 
				
		}
		
		
	}
}