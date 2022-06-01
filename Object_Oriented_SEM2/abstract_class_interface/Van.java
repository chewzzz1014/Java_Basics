package abstract_class_interface;

public class Van extends Transport implements RoadTax {
	
	private int noOfSeat;
	
	Van(String regNo, double value, int noOfSeat)	{
		super(regNo, value);
		this.noOfSeat = noOfSeat;
	}
	
	public int getNoOfSeat() {
		return this.noOfSeat;
	}
	
	public String toString() {
		return "\t\t**Van**\n"+super.toString()+"\nNumber of seats: "+this.getNoOfSeat();
	}
	
	// override from abstract class
	public double valueAfterDiscount() {
		return this.getValue()-(this.getValue()*0.25);
	}
	
	// override from interface
	public double getRoadTaxAmount() {
		return (this.getValue()/10)+105*this.getNoOfSeat();
	}
}

