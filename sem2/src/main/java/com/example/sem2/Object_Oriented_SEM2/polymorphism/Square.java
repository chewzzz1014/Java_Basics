package com.example.sem2.Object_Oriented_SEM2.polymorphism;
//subclass of TwoDimensional
public class Square extends TwoDimensional {
		private double length;
		
		Square(){
			this.setShapeName("Square");		//automatically assign shape name for all the objects of Cube
		}
		
		Square(double length){
			this();		 // calls no-args constructor
			this.length = length;
		}
		// getter
		public double getLength() {
			return this.length;
		}
		// setter
		public void setLength(double length) {
			this.length = length;
		}
		// calculate area n set area for the object
		public void calcArea() {
			this.setArea(Math.round(Math.pow(this.getLength(), 2)*100)/100.00);		// round to 2 decimal places
		}
		// return the specific properties of Square
		public String toString() {
			return super.toString()+"\nLength: "+this.getLength()+" m";
		}
		
}
