package polymorphism;

public class Circle extends TwoDimensional {
	private double radius;
	
	Circle(){
		
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double calcArea() {
		return Math.PI*Math.pow(this.getRadius(), 2);
	}
	
	public String toString() {
		return "";
	}
}
