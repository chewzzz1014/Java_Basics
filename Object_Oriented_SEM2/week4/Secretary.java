package week4;

public class Secretary extends Employee {
	Secretary(){
		System.out.println("In Secretary constructor.");
	}
	
	public String toString() {
		return "The Secretary "+super.toString()+".";
	}
}