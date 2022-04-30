package polymorphism;
import java.util.*;
/*
 * 2.	 Create a program that implements polymorphism concepts. In your program, create an ArrayList that can adds all the objects created and use loop to display all the elements in a list by invoking the object calArea() method.
 */
public class TestShape {
	public static void main (String[]args) {
		
		ArrayList<Shape> shapes = new ArrayList<>();
		
		shapes.add(new Cube(5));
		shapes.add(new Sphere(2.5));
		
		shapes.add(new Circle(3.5));
		shapes.add(new Triangle(3,4));
		shapes.add(new Square(2.5));
		
		
		for (Shape sh: shapes) {
			
		 if (sh instanceof ThreeDimensional) {
			 if (sh instanceof Cube)
			 {
				 ((Cube)sh).calcArea();
				 ((Cube)sh).calcVolume();
			 }
			 
			 else if (sh instanceof Sphere)
			 {
				 ((Sphere)sh).calcArea();
				 ((Sphere)sh).calcVolume();
			 }
		 }
		 else if (sh instanceof TwoDimensional){
			 
		 }
			
		}
	}
}
