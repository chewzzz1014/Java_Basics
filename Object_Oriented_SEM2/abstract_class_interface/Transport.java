package abstract_class_interface;

public abstract class Transport {
	
	private String regNo;
	private double value;
	
	Transport(String regNo, double value){
		this.regNo = regNo;
		this.value = value;
	}
	
	public String getRegNo() {
		return this.regNo;
	}
	
	public double getValue() {
		return this.value;
	}
	
	public String toString() {
		return "Registration Number: "+this.getRegNo()+"\nMarket Price: "+this.getValue();
	}
	
	public abstract double valueAfterDiscount();

}
