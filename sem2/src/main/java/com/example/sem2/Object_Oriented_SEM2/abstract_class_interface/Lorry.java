package com.example.sem2.Object_Oriented_SEM2.abstract_class_interface;

//weak inherited from RoadTax and strong inheritance with Transport
public class Lorry extends Transport implements RoadTax{
	
	private double weightOfGoods;
	
	Lorry(String regNo, double value, double weightOfGoods){
		super(regNo, value);
		this.weightOfGoods = weightOfGoods;
	}
	
	// getter
	public double getWeightOfGoods() {
		return this.weightOfGoods;
	}
	
	public String toString() {
		return "\t\t**Lorry**\n"+super.toString()+"\nMaximum Weight of Goods: "+this.getWeightOfGoods()+"kg";
	}
	
	// override abstract method in Transport
	public double valueAfterDiscount() {
		return this.getValue()-(this.getValue()*0.25);
	}
	
	// override abstract method in interface RaodTax
	public double getRoadTaxAmount() {
		return (this.getValue()/100)+15*this.getWeightOfGoods();
	}
}
