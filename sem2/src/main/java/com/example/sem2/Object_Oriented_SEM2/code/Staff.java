package com.example.sem2.Object_Oriented_SEM2.code;

public class Staff {
	
	private int staffID;
	private double salary;
	
	Staff(){
		System.out.println("In Staff Constructor");
	}
	
	public int getStaffID() {
		return this.staffID;
	}
	
	public double getSalary() {
		return this.salary;
	}
	
	public void setStaffID(int staffID) {
		this.staffID = staffID;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double bonus() {
		return 0.1*this.getSalary();
	}
	
	public void printDetails() {
		System.out.printf("\n\nStaff ID: %1d\nSalary: %.1f\nBonus: %.1f\n", this.getStaffID(), this.getSalary(), this.bonus());
	}
}
