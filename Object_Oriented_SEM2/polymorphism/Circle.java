package polymorphism;

public class Circle extends TwoDimensional {
	private double radius;
	
	Circle(){
		this.setShapeName("Circle");
	}
	
	Circle(double radius){
		this();
		this.setRadius(radius);
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public void calcArea() {
		this.setArea( Math.round(Math.PI*Math.pow(this.getRadius(), 2)*100)/100.00);
	}
	
	public String toString() {
		return super.toString()+"\nRadius: "+this.getRadius()+" m";
	}
	
}
