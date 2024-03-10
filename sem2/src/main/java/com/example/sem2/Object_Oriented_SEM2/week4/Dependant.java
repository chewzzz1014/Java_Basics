package com.example.sem2.Object_Oriented_SEM2.week4;
//week 4 question 3
//CHEW ZI QING 212360

//subclass of class Person
public class Dependant extends Person{
	//private data fields
	private char gender;
	private String dateOfBirth;
	
	Dependant(){
		//no-args constructor
	}
	
	//accessor of private data fields
	public char getGender() {
		return this.gender;
	}
	
	public String getDateOfBirth() {
		return this.dateOfBirth;
	}
	
	//setter of private data fields
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	//overriding toString()
	public String toString() {
		return this.getName()+" ("+this.getGender()+") is a dependant.";
	}
	
}
