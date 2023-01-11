package abstract_class_interface;

public class Car1 extends Vehicle1 implements Discount {
	
	private double price;
	
	Car1(String vehicleName, double price){
		super(vehicleName);
		this.setPrice(price);
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public double priceAfterDiscount(double discount) {
		return this.getPrice() * (1- discount);
	}
	
	
	public void print() {
		System.out.printf("%1s's car with price MYR %.2f\nPrice after 20 percent discount is = MYR %.2f\n\n", this.getVehicleName1(), this.getPrice(), this.priceAfterDiscount(0.2));
	}
}
