package com.example.sem2.Object_Oriented_SEM2.abstract_class_interface;

// an abstract class
public abstract class Transport {
	
	private String regNo;
	private double value;
	
	Transport(String regNo, double value){
		this.regNo = regNo;
		this.value = value;
	}
	
	// getters
	public String getRegNo() {
		return this.regNo;
	}
	
	public double getValue() {
		return this.value;
	}
	
	public String toString() {
		return "Registration Number: "+this.getRegNo()+"\nMarket Price: "+this.getValue();
	}
	
	// abstract method. Its declaration in Transport's subclasses
	public abstract double valueAfterDiscount();

}
