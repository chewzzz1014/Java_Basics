package polymorphism;
import java.util.*;
/*
 * 2.	 Create a program that implements polymorphism concepts. In your program, create an ArrayList that can adds all the objects created and use loop to display all the elements in a list by invoking the object calArea() method.
 */
public class TestShape {
	public static void main (String[]args) {
		
		ArrayList<Shape> shapes = new ArrayList<>();
		
		Shape s1 = new Cube(5);
		shapes.add(s1);
		/*
		shapes.add(new Sphere(2.5));
		
		shapes.add(new Circle(3.5));
		shapes.add(new Triangle(3,4));
		shapes.add(new Square(2.5));
		*/
		shapes.get(0).calcArea();
		System.out.print(shapes.get(0).toString());
		/*
		for (int i=0; i<shapes.size();i++) {
			shapes.get(i).calcArea();
			
		}
		*/
	}
}
