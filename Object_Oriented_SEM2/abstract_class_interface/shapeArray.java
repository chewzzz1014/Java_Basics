package abstract_class_interface;

public class shapeArray {
	public static void main (String[]args) {
		
		Shape[] shapes = new Shape[10];
		
		shapes[0] = new resizableCircle("Blue", 25.6);
		shapes[1] = new resizableCircle("Blue", 25.6);
		shapes[2] = new resizableCircle("Blue", 25.6);
		shapes[3] = new resizableCircle("Blue", 25.6);
		
		shapes[4] = new Circle("Red", 5.6);
		shapes[5] = new Circle("Red", 5.6);
		shapes[6] = new Circle("Red", 5.6);
		
		shapes[7] = new Triangle("Green", 10, 8);
		shapes[8] = new Triangle("Green", 10, 8);
		shapes[9] = new Triangle("Green", 10, 8);
		
		for (int i=1; i<=shapes.length; i++)
		{
			System.out.printf("\n\n****************|Shape %1d|******************\n",i);
			printDetails(shapes[i-1]);
		}
		
	}
	
	public static void printDetails(Shape s) {
		
		if (s instanceof Triangle)
			{
			System.out.printf("\n\t\tTriangle\nColor: %1s\nHeight of triangle: %.2f m\nWidth of triangle: %.2f m\nHeight and Weight are greater than 0: %1b", s.getColor(),((Triangle)s).getHeight(), ((Triangle)s).getWidth(), ((Triangle)s).checkWidthNHeight());
			((Triangle)s).printArea();
			((Triangle)s).printPerimeter();
			}
		
		else if (s instanceof Circle)
			{System.out.printf("\n\t\tCircle\nColor: %1s\nRadius of Circle: %.2f m\nRadius is greater than 0: %1b\nCan be resize: %1b", s.getColor(), ((Circle)s).getRadius(), ((Circle)s).checkRadius(), (s instanceof resizableCircle));
			((Circle)s).printArea();
			((Circle)s).printPerimeter();
			}
		
	}
	
}
