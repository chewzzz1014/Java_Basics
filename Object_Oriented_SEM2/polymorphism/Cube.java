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
	
	public void calcArea() {
		this.setArea(6*Math.pow(this.getLength(), 2));
	}
	
	public void calcVolume() {
		this.setVolume(Math.pow(this.getLength(), 3));
	}
	

}
