
public class FinalParent {
	final double TAXPERCENT = 1.1;
	
	final double calculateValue(int price){
		double finalPrice = price * TAXPERCENT; 
		return finalPrice; 
		// return price; This not allowed - Multiple Return Statement 
	}
}
