package polymorphism;

public class Cube extends ThreeDimensional{
	private double length;
	
	Cube(){
		this.setShapeName("Cube");
	}
	
	Cube(double length){
		this();
		this.setLength(length);
	}
	
	public double getLength() {
		return this.length;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	
	public void calcArea() {
		this.setArea(Math.round(6*Math.pow(this.getLength(), 2)*100)/100.00);
	}
	
	public void calcVolume() {
		this.setVolume(Math.round(Math.pow(this.getLength(), 3)*100)/100.00);
	}

	public String toString() {
		return super.toString()+"\nLength: "+this.getLength()+" m";
	}

}
