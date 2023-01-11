// week 4 question 3
//CHEW ZI QING 212360
package week4;
//inherits employee
public class SalesPerson extends Employee {
	private double commision;
	
	SalesPerson(){
		//no-args constructor
	}
	
	//accessor of private data fields
	public double getCommision() {
		return this.commision;
	}
	
	//setter of private data fields
	public void setCommision(double commision) {
		this.commision = commision;
	}
	
	//overriding toString()
	public String toString() {
		return "The SalesPerson "+super.toString()+" and has a commision of "+this.getCommision()+".";
	}
}
