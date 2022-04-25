package polymorphism;

public class Caravan extends Car {
	private int weight;
	
	Caravan(){
		// no-args constructor
	}
	
	// getter
	public int getWeight() {
		return this.weight;
	}
	
	// setter
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	// overriding method
	public double SalePrice() {
		if (this.getWeight()>2500)
			return super.SalePrice() * 0.925;
		else
			return super.SalePrice() * 0.9;
	}
}
