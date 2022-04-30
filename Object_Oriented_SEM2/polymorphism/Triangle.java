package polymorphism;

public class Triangle extends TwoDimensional {
	private double base, height;
	
	Triangle(){
		this.setShapeName("Triangle");
	}
	
	Triangle(double base, double height){
		this();
		this.setBase(base);
		this.setHeight(height);
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
	
	public void calcArea() {
		this.setArea(Math.round(0.5*this.getBase()*this.getHeight()*100)/100.00 );
	}
	
	public String toString() {
		return super.toString()+"\nBase: "+this.getBase()+" m\nHeight: "+this.getHeight()+" m";
	}

}
