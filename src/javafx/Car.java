package javafx;

public class Car {
	private double car_speed, speed_limit, fine;
	
	public Car(double car_speed, double speed_limit) {
		this.car_speed = car_speed;
		this.speed_limit = speed_limit;
		this.calcFine();
	}
	
	public double getCarSpeed() {
		return this.car_speed;
	}
	
	public double getSpeedLimit() {
		return this.speed_limit;
	}
	
	public void calcFine() {
		if (this.car_speed <= this.speed_limit) 
			this.fine = 0;
		else 
			this.fine = (this.car_speed - this.speed_limit) * (this.car_speed - this.speed_limit) * 0.5;
	}
	
	public double getFine() {
		return this.fine;
	}
	
}
