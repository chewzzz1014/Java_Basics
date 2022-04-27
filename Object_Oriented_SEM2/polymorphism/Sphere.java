package polymorphism;

public class Sphere extends ThreeDimensional {
	private double radius;
	
	Sphere(){
		
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double calArea() {
		return 4*Math.PI*Math.pow(this.getRadius(),2);
	}
	
	public double calVolume() {
		return (4/3)*(Math.PI)*Math.pow(this.getRadius(), 2);
	}
}
