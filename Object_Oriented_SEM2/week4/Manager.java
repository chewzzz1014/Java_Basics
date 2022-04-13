package week4;

public class Manager extends Employee {
	private double allowance;
	
	Manager(){
		System.out.println("In Manager constructor.");
	}
	
	public double getAllowance() {
		return this.allowance;
	}
	
	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	
	public String toString() {
		return "The Manager"+super.toString()+" and has an allowance of "+this.getAllowance()+".";
	}
}
