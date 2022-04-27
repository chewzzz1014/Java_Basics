package polymorphism;

public class Triangle extends TwoDimensional {
	private double base, height;
	
	Triangle(){
		
	}
	
	public double getBase() {
		return this.base;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public void setBase(double base) {
		this.base = base;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double calcArea() {
		return 0.5*this.getBase()*this.getHeight();
	}
	
	public String toString() {
		return "";
	}
}
