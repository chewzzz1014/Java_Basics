package com.example.sem2.Object_Oriented_SEM2.abstract_class_interface;

public abstract class Vehicle1 {
	private String vehicleName1;
	
	Vehicle1(){
		
	}
	
	Vehicle1(String vehicleName1){
		this.setVehicleName1(vehicleName1);
	}
	
	public String getVehicleName1() {
		return this.vehicleName1;
	}
	
	public void setVehicleName1(String vehicleName1) {
		this.vehicleName1 = vehicleName1;
	}
	
	public abstract void print();
}
