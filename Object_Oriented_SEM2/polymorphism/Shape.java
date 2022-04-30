package polymorphism;

public class Shape {
	private String color = "NA", shapeName;
	private double area;
	
	Shape(){
		// no-args constructor
	}
	
	public String getColor() {
		return this.color;
	}
	
	public String getShapeName() {
		return this.shapeName;
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
	
	public void setShapeName(String shapeName) {
		this.shapeName = shapeName;
	}
	
	public String toString() {
		return "\n--Instance of Shape--"+"\nShape: "+this.getShapeName()+"\nColor: "+ this.getColor();
	}
}
