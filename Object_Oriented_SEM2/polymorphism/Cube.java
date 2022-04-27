package polymorphism;

public class Cube extends ThreeDimensional{
	private double length;
	
	Cube(){
		
	}
	
	Cube(double length){
		this.setLength(length);
	}
	
	public double getLength() {
		return this.length;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	
	public double calArea() {
		return 6*Math.pow(this.getLength(), 2);
	}
	
	public double calVolume() {
		return Math.pow(this.getLength(), 3);
	}
	
	public String toString() {
	return "";
	}
}
