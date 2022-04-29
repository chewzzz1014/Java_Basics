package polymorphism;

public class Triangle extends TwoDimensional {
	private double base, height;
	
	Triangle(){
		
	}
	
	Triangle(double base, double height){
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
		this.setArea(0.5*this.getBase()*this.getHeight() );
	}

}
