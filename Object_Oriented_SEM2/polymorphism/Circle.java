package polymorphism;

public class Circle extends TwoDimensional {
	private double radius;
	
	Circle(){
		
	}
	
	Circle(double radius){
		this.setRadius(radius);
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public void calcArea() {
		this.setArea( Math.PI*Math.pow(this.getRadius(), 2));
	}
	
}
