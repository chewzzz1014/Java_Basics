package polymorphism;

public class MVP extends Car{
	private int length;
	
	MVP(){
		// no-args constructor
	}
	
	// getter
	public int getLength() {
		return this.length;
	}
	
	// setter
	public void setLength(int length) {
		this.length = length;
	}
	
	// overriding methods
	public double SalePrice() {
		if (this.getLength()>15)
			return super.SalePrice()*0.975;
		else
			return super.SalePrice()*0.95;
	}
}
