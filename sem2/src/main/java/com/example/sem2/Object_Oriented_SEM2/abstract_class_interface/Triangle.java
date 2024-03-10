package com.example.sem2.Object_Oriented_SEM2.abstract_class_interface;

//weak inherited from printObject and strong inheritance with Shape
public class Triangle extends Shape implements printObject {

	private double height;
	private double width;
	
	Triangle(String color, double width, double height){
		super(color);
		this.width = width;
		this.height = height;
	}
	
	// getters
	public double getHeight() {
		return this.height;
	}
	
	public double getWidth() {
		return this.width;
	}
	
	// setters
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public boolean checkWidthNHeight() {
		return (this.getWidth()>0)&&(this.getHeight()>0);
	}
	
	// override abstract method in Shape
	public double getArea() {
		return 0.5*this.getHeight()*this.getWidth();
	}
	
	// override abstract method in Shape
	public double getPerimeter() {
		return (Math.sqrt(this.getHeight()*this.getHeight()+this.getWidth()*this.getWidth())) + this.getHeight() + this.getWidth();
	}
	
	// override  abstract method in interface printObject
	public void printArea() {
		System.out.printf("\nArea of triangle: %.2f m^2",this.getArea());
	}
	
	// override  abstract method in interface printObject
	public void printPerimeter() {
		System.out.printf("\nPerimeter of triangle: %.2f m",this.getPerimeter());
	}
}
