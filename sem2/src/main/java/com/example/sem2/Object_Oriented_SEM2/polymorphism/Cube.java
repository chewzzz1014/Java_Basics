package com.example.sem2.Object_Oriented_SEM2.polymorphism;
// subclass of ThreeDimensional
public class Cube extends ThreeDimensional{
	private double length;
	
	Cube(){		// automatically assign shape name for all the objects of Cube
		this.setShapeName("Cube");
	}
	
	Cube(double length){
		this();	// calls no-args constructor
		this.setLength(length);
	}
	// getters
	public double getLength() {
		return this.length;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	// calculate area n set area for the object
	public void calcArea() {
		this.setArea(Math.round(6*Math.pow(this.getLength(), 2)*100)/100.00);		// round to 2 decimal places
	}
	// calculate volume n set volume for the object
	public void calcVolume() {
		this.setVolume(Math.round(Math.pow(this.getLength(), 3)*100)/100.00);// round to 2 decimal places
	}
	// return the specific properties of Cube
	public String toString() {
		return super.toString()+"\nLength: "+this.getLength()+" m";	}
}
