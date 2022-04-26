package polymorphism;

public class Caravan extends Car {
	private int weight;
	
	Caravan(){
		// no-args constructor
	}
	
	Caravan(int speed, String regularPrice, String color, int weight){
		super(speed, regularPrice, color);
		this.weight = weight;
	}
	
	// getter
	public int getWeight() {
		return this.weight;
	}
	
	// setter
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	// overriding toString()
	public String toString() {
		return "\tCaravan\n"+super.toString()+"\nWeight: "+this.getWeight()+"kg";
	}
	
	// overriding method
	public double SalePrice() {
		if (this.getWeight()>2500)
			return super.SalePrice() * 0.925;
		else
			return super.SalePrice() * 0.9;
	}
}
