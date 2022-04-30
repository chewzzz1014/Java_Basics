package polymorphism;

public class Sphere extends ThreeDimensional {
	private double radius;
	
	Sphere(){
		
	}
	
	Sphere(double radius){
		this.radius = radius;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public void calcArea() {
		this.setArea(4*Math.PI*Math.pow(this.getRadius(),2));
	}
	
	public void calcVolume() {
		this.setVolume((4/3)*(Math.PI)*Math.pow(this.getRadius(), 2));
	}
	
}
