package learn.java.encapsulation;

public class Student {
	
	private String name;
	private int rollno;
	
	// Setters
	
	public void setName(String name){
		if(name.length() > 1)
			this.name = name; 
	}
	
	public void setRollno(int rollno){
		this.rollno = rollno; 
	}
	
	// getters
	
	public String getName(){
		return this.name;
	}
	
	public int getRollno(){
		return this.rollno; 
	}

}
