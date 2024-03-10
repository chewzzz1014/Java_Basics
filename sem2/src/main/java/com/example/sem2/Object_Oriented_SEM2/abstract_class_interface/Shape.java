package com.example.sem2.Object_Oriented_SEM2.abstract_class_interface;

// an abstract class
public abstract class Shape {

	private String color;
	
	Shape(String color){
		this.color = color;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	// abstract methods. Their declaration are in Shape's subclasses
	public abstract double getArea();
	
	public abstract double getPerimeter();
}
