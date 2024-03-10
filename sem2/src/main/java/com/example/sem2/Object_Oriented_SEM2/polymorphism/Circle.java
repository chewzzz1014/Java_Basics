package com.example.sem2.Object_Oriented_SEM2.polymorphism;
//subclass of TwoDimensional
public class Circle extends TwoDimensional {
	private double radius;
	
	Circle(){
		this.setShapeName("Circle");  //automatically assign shape name for all the objects of Cube
	}
	
	Circle(double radius){
		this();  // calls no-args constructor
		this.setRadius(radius);
	}
	// getter
	public double getRadius() {
		return this.radius;
	}
	// setter
	public void setRadius(double radius) {
		this.radius = radius;
	}
	// calculate area n set area for the object
	public void calcArea() {
		this.setArea( Math.round(Math.PI*Math.pow(this.getRadius(), 2)*100)/100.00);// round to 2 decimal places
	}
	// return the specific properties of Circle
	public String toString() {
		return super.toString()+"\nRadius: "+this.getRadius()+" m";
	}
	
}
