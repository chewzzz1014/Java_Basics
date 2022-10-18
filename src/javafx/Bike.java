package javafx;

public class Bike {
	
	private double car_speed, speed_limit, fine;
	
	public Bike(double car_speed, double speed_limit) {
		this.car_speed = car_speed;
		this.speed_limit = speed_limit;
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
			this.fine = 30 + (this.car_speed - this.speed_limit);
	}
	
	public double getFine() {
		return this.fine;
	}

}
