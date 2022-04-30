package polymorphism;

public class Sphere extends ThreeDimensional {
	private double radius;
	
	Sphere(){
		this.setShapeName("Sphere");
	}
	
	Sphere(double radius){
		this();
		this.radius = radius;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public void calcArea() {
		this.setArea(Math.round(4*Math.PI*Math.pow(this.getRadius(),2)*100)/100.00);
	}
	
	public void calcVolume() {
		this.setVolume(Math.round((4/3.0)*Math.PI*Math.pow(this.getRadius(), 3)*100)/100.0);
	}
	
	public String toString() {
		return super.toString()+"\nRadius: "+this.getRadius()+" m";
	}
	
}
