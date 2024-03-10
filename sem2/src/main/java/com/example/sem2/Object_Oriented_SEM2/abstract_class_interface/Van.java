package com.example.sem2.Object_Oriented_SEM2.abstract_class_interface;

//weak inherited from RoadTax and strong inheritance with Transport
public class Van extends Transport implements RoadTax {
	
	private int noOfSeat;
	
	Van(String regNo, double value, int noOfSeat)	{
		super(regNo, value);
		this.noOfSeat = noOfSeat;
	}
	
	// getter
	public int getNoOfSeat() {
		return this.noOfSeat;
	}
	
	public String toString() {
		return "\t\t**Van**\n"+super.toString()+"\nNumber of seats: "+this.getNoOfSeat();
	}
	
	// override abstract method in Transport
	public double valueAfterDiscount() {
		return this.getValue()-(this.getValue()*0.25);
	}
	
	// override abstract method in interface RaodTax
	public double getRoadTaxAmount() {
		return (this.getValue()/10)+105*this.getNoOfSeat();
	}
}

