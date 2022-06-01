package abstract_class_interface;

// weak inherited from printObject and strong inheritance with Shape
public class Circle extends Shape implements printObject{
	
	private double radius;
	
	Circle(String color, double radius){
		super(color);
		this.radius = radius;
	}
	
	// getter
	public double getRadius() {
		return this.radius;
	}
	
	//setter
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public boolean checkRadius() {
		return this.getRadius()>0;
	}

	// override abstract method in Shape
	public double getArea() {
		return Math.PI*Math.pow(this.getRadius(), 2);
	}
	
	// override abstract method in Shape
	public double getPerimeter() {
		return 2*Math.PI*this.getRadius();
	}
	
	// override abstract method in interface printObject
	public void printArea() {
		System.out.printf("\nArea of Circle: %.2f m^2", this.getArea());
	}
	
	// override abstract method in interface printObject
	public void printPerimeter() {
		System.out.printf("\nPerimeter of Circle: %.2f m", this.getPerimeter());
	}
}
