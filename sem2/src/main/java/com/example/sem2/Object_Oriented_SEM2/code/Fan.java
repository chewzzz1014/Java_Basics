package com.example.sem2.Object_Oriented_SEM2.code;
//Week 1

public class Fan {
	//static constant of class Fan. access them through className.staticDataFields
		static final int SLOW = 1;
		static final int MEDIUM = 2;
		static final int FAST = 3;

		//private data fields that given default values
		private int speed = SLOW;
		private boolean on = false;
		private double radius = 5;
		String color = "blue";
		
		//constructor
		Fan(){
			
		}
		
		//accessor of private data fields
		int getSpeed() {
			return speed;
		}
		
		boolean getState() {
			return on;
		}
		
		double getRadius() {
			return radius;
		}
		
		String getColor() {
			return color;
		}
		
		//mutator of all data fields
		void setSpeed(int nSpeed) {
			speed = nSpeed;
		}
		
		void setState(boolean nState) {
			on = nState;
		}
		
		void setRadius(double nRadius) {
			radius = nRadius;
		}
		
		void setColor(String nColor) {
			color = nColor;
		}
		
		//return the data fields in one line
		String to_String() {
			if (on)
				return "Fan speed is "+speed+", color is "+color+" and radius is "+radius+".";
			else
				return "Fan is off. Fan color is "+color+" and radius of fan is "+radius+ ".";
		}
}
