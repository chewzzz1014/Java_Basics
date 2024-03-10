// week 4 question 3
//CHEW ZI QING 212360
package com.example.sem2.Object_Oriented_SEM2.week4;
//inherits class Employee
public class Manager extends Employee {
	private double allowance;
	
	Manager(){
		//no-args constructor
	}
	
	//accessor of private data fields
	public double getAllowance() {
		return this.allowance;
	}
	
	//setter of private data fields
	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	
	//overriding toString()
	public String toString() {
		return "The Manager"+super.toString()+" and has an allowance of "+this.getAllowance()+".";
	}
}
