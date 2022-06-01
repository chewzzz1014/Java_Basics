package abstract_class_interface;

public class Circle extends Shape implements printObject{
	
	private double radius;
	
	Circle(String color, double radius){
		super(color);
		this.radius = radius;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public boolean checkRadius() {
		return this.getRadius()>0;
	}

	// override
	public double getArea() {
		return Math.PI*Math.pow(this.getRadius(), 2);
	}
	
	// override
	public double getPerimeter() {
		return 2*Math.PI*this.getRadius();
	}
	
	// override
	public void printArea() {
		System.out.printf("\nArea of Circle: %.2f m^2", this.getArea());
	}
	
	// override
	public void printPerimeter() {
		System.out.printf("\nPerimeter of Circle: %.2f m", this.getPerimeter());
	}
}
