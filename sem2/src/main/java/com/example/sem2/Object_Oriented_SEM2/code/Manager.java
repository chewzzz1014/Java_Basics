package com.example.sem2.Object_Oriented_SEM2.code;

public class Manager extends Staff {

	private String department;
	
	Manager(){
		System.out.println("In Manager constructor");
	}
	
	public String getDepartment() {
		return this.department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public double bonus()	{		//overriding method
		return 0.2*this.getSalary();
	}
	
	public void printDetails() {
		super.printDetails();
		System.out.printf("Department: %1s",this.getDepartment());
	}
}
