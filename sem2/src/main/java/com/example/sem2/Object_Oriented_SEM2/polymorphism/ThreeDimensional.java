package com.example.sem2.Object_Oriented_SEM2.polymorphism;
// subclass of Shape
public class ThreeDimensional  extends Shape{
		private static int numDimension = 3;
		private double volume;
		
		ThreeDimensional(){
			//no-args constructor
		}
		// getters
		public static int getNumDimension() {
			return numDimension;
		}
		
		public double getVolume() {
			return this.volume;
		}
		// setter
		public void setVolume(double volume) {
			this.volume = volume;
		}
		// overriding toString that returns the specific properties of subclass ThreeDimensional
		public String toString() {
			return super.toString()+"\nNumber of Dimension: "+getNumDimension()+"\nArea:"+this.getArea()+" m^2\nVolume: "+this.getVolume()+" m^3";
		}
}
