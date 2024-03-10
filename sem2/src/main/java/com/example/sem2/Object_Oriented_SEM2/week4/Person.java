package com.example.sem2.Object_Oriented_SEM2.week4;

public class Person {
	private String name, address, phoneNumber, email;
	
	Person(){
		//no-args constructor. All of its subclass will run this automatically
	}
	
	Person(String name){
		this.name = name;
	}
	
	//accessor of private data fields
	public String getName() {
		return this.name;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	//setter of private data fields
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
}
