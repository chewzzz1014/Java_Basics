package com.example.sem2.Object_Oriented_SEM2.polymorphism;
//subclass of Shape
public class TwoDimensional extends Shape {
		private static int numDimension = 2;
		
		TwoDimensional(){
			//no-args constructor
		}
		// getter
		public static int getNumDimension() {
			return numDimension;
		}
		
		// overriding toString that returns the specific properties of subclass TwoDimensional
		public String toString() {
			return super.toString()+"\nNumber of Dimensions: "+getNumDimension()+"\nArea: "+this.getArea()+" m^2";
		}
		
}
