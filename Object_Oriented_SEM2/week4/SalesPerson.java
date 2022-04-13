package week4;

public class SalesPerson extends Employee {
	private double commision;
	
	SalesPerson(){
		System.out.println("In SalasPerson constructor.");
	}
	
	public double getCommision() {
		return this.commision;
	}
	
	public void setCommision(double commision) {
		this.commision = commision;
	}
	
	public String toString() {
		return "The SalesPerson "+super.toString()+" and has a commision of "+this.getCommision()+".";
	}
}
