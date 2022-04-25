package polymorphism;

public class Sedan extends Car{
	private int year, manufacturerDiscount;
	
	Sedan(){
		// no-args constructor
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
	
	// overriding method
	public double SalePrice() {
		return super.SalePrice() - this.getManufacturerDiscount();
	}
}

