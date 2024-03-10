package com.example.sem2.Object_Oriented_SEM2.abstract_class_interface;

// test program for relationships between abstract class Vehicle1, interface Discount and subclass Car1 in this package
public class LectureExercises {
	
	public static void main (String[]args) {
		Car1 mercedes = new Car1("Mercedes", 500000);
		Car1 bmw = new Car1("BMW", 600000);
		
		mercedes.print();
		bmw.print();
	}
}
