package com.example.sem2.Object_Oriented_SEM2.code;

public class Circle {
	private static int numCircle;
	private double radius, area;
	
	Circle(){
		this.radius = 1;
		numCircle++;
	}
	
	Circle(double radius){
		this.radius = radius;
		numCircle++;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public static int getNumCircle() {
		return numCircle;
	}
	
	public void setArea() {
		this.area = Math.PI * this.getRadius() * this.getRadius();
	}
	
	public double getArea() {
		return this.area;
	}
}
