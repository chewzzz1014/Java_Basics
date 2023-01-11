package abstract_class_interface;

public class shapeArray {	// test class
	public static void main (String[]args) {
		
		// array that stores 10 Shape object
		Shape[] shapes = new Shape[10];
		
		// Shape, an abstract class, can't be initialized using new
		shapes[0] = new resizableCircle("Blue", 25.6);
		shapes[1] = new resizableCircle("Maroon", 15);
		shapes[2] = new resizableCircle("Mint", 27.8);
		shapes[3] = new resizableCircle("Black", 2.75);
		
		shapes[4] = new Circle("Red", 5.6);
		shapes[5] = new Circle("Greenish Yellow", 53.2);
		shapes[6] = new Circle("Light Pink", 20);
		
		shapes[7] = new Triangle("Green", 10, 8);
		shapes[8] = new Triangle("Brown", 30, 25);
		shapes[9] = new Triangle("Purple", 14, 18.9);
		
		// print the details of each Shape object
		for (int i=1; i<=shapes.length; i++)
		{
			System.out.printf("\n\n****************|Shape %1d|******************\n",i);
			printDetails(shapes[i-1]);
		}
		
	}
	
	public static void printDetails(Shape s) {
		
		// print respective unique properties of different shapes
		if (s instanceof Triangle)
			{
			System.out.printf("\n\t\tTriangle\nColor: %1s\nHeight of triangle: %.2f m\nWidth of triangle: %.2f m\nHeight and Weight are greater than 0: %1b", s.getColor(),((Triangle)s).getHeight(), ((Triangle)s).getWidth(), ((Triangle)s).checkWidthNHeight());
			((Triangle)s).printArea();	// casting to Triangle object
			((Triangle)s).printPerimeter();
			}
		
		else if (s instanceof Circle)
			{System.out.printf("\n\t\tCircle\nColor: %1s\nRadius of Circle: %.2f m\nRadius is greater than 0: %1b\nCan be resize: %1b", s.getColor(), ((Circle)s).getRadius(), ((Circle)s).checkRadius(), (s instanceof resizableCircle));
			((Circle)s).printArea();	// casting to Circle object
			((Circle)s).printPerimeter();
			}
		
	}
	
}
