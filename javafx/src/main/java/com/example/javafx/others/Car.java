package com.example.javafx.others;
public class Car {
	private double car_speed, speed_limit, fine;
	
	public Car(double car_speed, double speed_limit) {
		this.car_speed = car_speed;
		this.speed_limit = speed_limit;
		calcFine();
	}
	
	public double getCarSpeed() {
		return car_speed;
	}
	
	public double getSpeedLimit() {
		return speed_limit;
	}
	
	public void calcFine() {
		if (this.car_speed <= this.speed_limit) 
			fine = 0;
		else 
			fine = (car_speed - speed_limit) * (car_speed - speed_limit) * 0.5;
	}
	
	public double getFine() {
		return fine;
	}
	
}
