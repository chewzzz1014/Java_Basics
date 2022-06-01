package abstract_class_interface;

public abstract class Shape {

	private String color;
	
	Shape(String color){
		this.color = color;
	}
	
	public String getColor() {
		return this.getColor();
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public abstract double getArea();
	
	public abstract double getPerimeter();
}
