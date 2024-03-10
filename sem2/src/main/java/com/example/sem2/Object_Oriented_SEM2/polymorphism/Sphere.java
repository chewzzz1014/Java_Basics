package com.example.sem2.Object_Oriented_SEM2.polymorphism;
// subclass of ThreeDimensional
public class Sphere extends ThreeDimensional {
	private double radius;
	
	Sphere(){// automatically assign shape name for all the objects of Sphere
		this.setShapeName("Sphere");
	}
	
	Sphere(double radius){
		this(); // calls no-args constructor
		this.radius = radius;
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
		this.setArea(Math.round(4*Math.PI*Math.pow(this.getRadius(),2)*100)/100.00); // round to 2 decimal places
	}
	// calculate volume n set volume for the object
	public void calcVolume() {
		this.setVolume(Math.round((4/3.0)*Math.PI*Math.pow(this.getRadius(), 3)*100)/100.0); // round to 2 decimal places
	}
	// return the specific properties of Sphere
	public String toString() {
		return super.toString()+"\nRadius: "+this.getRadius()+" m";	}	
}
