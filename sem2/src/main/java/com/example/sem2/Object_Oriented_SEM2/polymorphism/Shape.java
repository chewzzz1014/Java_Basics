package com.example.sem2.Object_Oriented_SEM2.polymorphism;

public class Shape {	// superclass for all  classes
	// let the default color be "NA" (non available)
	private String color = "NA", shapeName;
	private double area;
	
	Shape(){
		// no-args constructor
	}
	// getters
	public String getColor() {
		return this.color;
	}
	
	public String getShapeName() {
		return this.shapeName;
	}
	
	public double getArea() {
		return this.area;
	}
	// setters
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setArea(double area) {
		this.area = area;
	}
	
	public void setShapeName(String shapeName) {
		this.shapeName = shapeName;
	}
	// return the generic properties of shape
	public String toString() {
		return "\n--Instance of Shape--"+"\nShape: "+this.getShapeName()+"\nColor: "+ this.getColor();
	}
}
