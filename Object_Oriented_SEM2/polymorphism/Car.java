package polymorphism;

public class Car {
	private int speed;
	private String regularPrice, color;
	
	Car(){
		// no-args argument constructor
	}
	
	Car(int speed, String regularPrice, String color){
		this.speed = speed;
		this.regularPrice = regularPrice;
		this.color = color;
	}
	
	// getter for private data fields
	public int getSpeed() {
		return this.speed;
	}
	
	public String getRegularPrice() {
		return this.regularPrice;
	}
	
	public String getColor() {
		return this.color;
	}
	
	// setter for private data fields
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void setRegularPrice(String regularPrice) {
		this.regularPrice = regularPrice;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	// return the data fields in a string
	public String toString() {
		return "Speed: "+this.getSpeed()+" km/h\nRegular Price: RM "+this.getRegularPrice()+"\nColor: "+this.getColor();
	}
	
	// return the sale price in double
	public double SalePrice() {
		return Double.parseDouble(this.getRegularPrice());
	}
}
