package polymorphism;

public class Sedan extends Car{
	private int year, manufacturerDiscount;
	
	Sedan(){
		// no-args constructor
	}
	
	Sedan(int speed, String regularPrice, String color, int year, int mDiscount){
		super(speed, regularPrice, color);
		this.year = year;
		this.manufacturerDiscount = mDiscount;
	}
	
	// getter for private data fields
	public int getYear() {
		return this.year;
	}
	
	public int getManufacturerDiscount() {
		return this.manufacturerDiscount;
	}
	
	// setter for private data fields
	public void setYear(int year) {
		this.year = year;
	}
	
	public void setManufacturerDiscount(int manufacturerDiscount) {
		this.manufacturerDiscount = manufacturerDiscount;
	}
	
	// overriding toString()
	public String toString() {
		return "\tSedan\n"+super.toString()+"\nYear: "+this.getYear()+"\nManufacturer Discount: RM"+this.getManufacturerDiscount();
	}
	
	// overriding method
	public double SalePrice() {
		return super.SalePrice() - this.getManufacturerDiscount();
	}
}

