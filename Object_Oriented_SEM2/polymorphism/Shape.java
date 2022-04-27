package polymorphism;

public class Shape {
	private String color;
	private double area;
	
	Shape(){
		// no-args constructor
	}
	
	public String getColor() {
		return this.color;
	}
	
	public double getArea() {
		return this.area;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setArea(double area) {
		this.area = area;
	}
	
	public String toString() {
		return "\n--Instance of Shape--"+"\nColor: "+ this.getColor();
	}
}
