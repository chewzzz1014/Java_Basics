package abstract_class_interface;

public class Lorry extends Transport implements RoadTax{
	
	private double weightOfGoods;
	
	Lorry(String regNo, double value, double weightOfGoods){
		super(regNo, value);
		this.weightOfGoods = weightOfGoods;
	}
	
	public double getWeightOfGoods() {
		return this.weightOfGoods;
	}
	
	public String toString() {
		return "\t\t**Lorry**\n"+super.toString()+"\nMaximum Weight of Goods: "+this.getWeightOfGoods()+"kg";
	}
	
	public double valueAfterDiscount() {
		return this.getValue()-(this.getValue()*0.25);
	}
	
	public double getRoadTaxAmount() {
		return (this.getValue()/100)+15*this.getWeightOfGoods();
	}
}
