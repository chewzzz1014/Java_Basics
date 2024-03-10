package com.example.sem2.practises;

public class BasicsInfo {
	// name is compulsory data field
	private String name, address, email, country, contactNum;
	
	BasicsInfo(String name){
		this(name, "NaN", "NaN", "NaN", "NaN");
	}
	
	BasicsInfo(String name, String address, String email, String country, String contactNum){
		this.name = name;
		this.address = address;
		this.email = email;
		this.country = country;
		this.contactNum = contactNum;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public String getCountry() {
		return this.country;
	}
	
	public String getContactNum() {
		return this.contactNum;
	}
	
	//////////////////////////////////
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public void setContactNum(String contactNum) {
		this.contactNum = contactNum;
	}
	
}
