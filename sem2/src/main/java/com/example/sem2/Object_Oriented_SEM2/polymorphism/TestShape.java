package com.example.sem2.Object_Oriented_SEM2.polymorphism;
import java.util.*;

public class TestShape {
	public static void main (String[]args) {
		// arraylist with generic type
		ArrayList<Shape> shapes = new ArrayList<>();
		// create objects of all classes and add them to the arraylist
		shapes.add(new Cube(5));
		shapes.add(new Sphere(2.5));
		
		shapes.add(new Circle(3.5));
		shapes.add(new Triangle(3,4));
		shapes.add(new Square(2.5));
		// set the color for first element in arraylist
		shapes.get(0).setColor("Blue");
		// calculate area (and volume for 3d) for all elements and print their properties
		for (Shape sh: shapes) {
		
		 if (sh instanceof ThreeDimensional) {
			 if (sh instanceof Cube)
			 {	// casting objects (supertype -> subtype)
				 ((Cube)sh).calcArea();
				 ((Cube)sh).calcVolume();
			 }
			 
			 else if (sh instanceof Sphere)
			 {
				 ((Sphere)sh).calcArea();
				 ((Sphere)sh).calcVolume();
			 }
			 System.out.println(sh.toString());		// print the properties of object with dynamic binding
		 }
		 else if (sh instanceof TwoDimensional){
			 if (sh instanceof Circle)
				 ((Circle)sh).calcArea();
			 else if (sh instanceof Triangle)
				 ((Triangle)sh).calcArea();
			 else if (sh instanceof Square)
				 ((Square)sh).calcArea();
			 System.out.println(sh.toString());
		 }
			
		}
	}
}
