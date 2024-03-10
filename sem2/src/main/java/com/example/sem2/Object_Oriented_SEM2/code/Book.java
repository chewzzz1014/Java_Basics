package com.example.sem2.Object_Oriented_SEM2.code;

// Week 2
//CHEW ZI QING 212360
public class Book {

	// private data fields
	private String name;
	private Identification author ;
	private double price;
	private int qty;
	
	// constructor that accepts no arguments
	Book(){
		
	}
	
	// constructor that accepts 4 arguments
	Book( String name, Identification author,double price, int qty){
		this.name = name;
		this.author = author;
		this.price = price;
		this.qty = qty;
	}
	
	// getter of private data fields
	String getName() {
		return name;
	}
	
	Identification getAuthor() {
		return author;
	}
	
	double getPrice() {
		return price;
	}
	
	int getQty() {
		return qty;
	}
	
	// setter of private data fields
	void setPrice(double price) {
		this.price = price;
	}
	
	void setQty(int qty) {
		this.qty = qty;
	}
	
	
}
