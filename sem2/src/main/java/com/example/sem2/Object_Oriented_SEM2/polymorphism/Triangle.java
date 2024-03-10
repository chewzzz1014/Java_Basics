package com.example.sem2.Object_Oriented_SEM2.polymorphism;
//subclass of TwoDimensional
public class Triangle extends TwoDimensional {
	private double base, height;
	
	Triangle(){
		this.setShapeName("Triangle");		//automatically assign shape name for all the objects of Cube
	}
	
	Triangle(double base, double height){
		this();		// calls no-args constructor
		this.setBase(base);
		this.setHeight(height);
	}
	// getters
	public double getBase() {
		return this.base;
	}
	
	public double getHeight() {
		return this.height;
	}
	// setters
	public void setBase(double base) {
		this.base = base;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	// calculate area n set area for the object
	public void calcArea() {
		this.setArea(Math.round(0.5*this.getBase()*this.getHeight()*100)/100.00 );		// round to 2 decimal places
	}
	// return the specific properties of Triangle
	public String toString() {
		return super.toString()+"\nBase: "+this.getBase()+" m\nHeight: "+this.getHeight()+" m";
	}

}
