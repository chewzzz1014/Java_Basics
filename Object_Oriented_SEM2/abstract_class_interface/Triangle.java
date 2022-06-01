package abstract_class_interface;

public class Triangle extends Shape implements printObject {

	private double height;
	private double width;
	
	Triangle(String color, double width, double height){
		super(color);
		this.width = width;
		this.height = height;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public double getWidth() {
		return this.width;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public boolean checkWidthNHeight() {
		return (this.getWidth()>0)&&(this.getHeight()>0);
	}
	
	// override
	public double getArea() {
		return 0.5*this.getHeight()*this.getWidth();
	}
	
	// override
	public double getPerimeter() {
		return (Math.sqrt(this.getHeight()*this.getHeight()+this.getWidth()*this.getWidth())) + this.getHeight() + this.getWidth();
	}
	
	// override 
	public void printArea() {
		System.out.printf("Area of triangle: %.2f m^2",this.getArea());
	}
	
	// override
	public void printPerimeter() {
		System.out.printf("Perimeter of triangle: %.2f m",this.getPerimeter());
	}
}
