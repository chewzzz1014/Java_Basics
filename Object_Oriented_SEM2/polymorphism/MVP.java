package polymorphism;

public class MVP extends Car{
	private int length;
	
	MVP(){
		// no-args constructor
	}
	
	MVP(int speed, String regularPrice, String color, int length){
		super(speed, regularPrice, color);
		this.length = length;
	}
	
	// getter
	public int getLength() {
		return this.length;
	}
	
	// setter
	public void setLength(int length) {
		this.length = length;
	}
	
	// overriding toString()
	public String toString() {
		return "\tMVP\n"+super.toString()+"\nLength: "+this.getLength()+" feet";
	}
	
	// overriding methods
	public double SalePrice() {
		if (this.getLength()>15)
			return super.SalePrice()*0.975;
		else
			return super.SalePrice()*0.95;
	}
}
