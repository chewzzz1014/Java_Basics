package com.example.sem2.practises;


public class Subscription {
	
	private double price;
	private int numSubscriber=0;
	
	Subscription(){
		numSubscriber++;
	}
	
	Subscription(double price){
		this();
		this.price = price;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public int getNumSubscriber() {
		return numSubscriber;
	}
	
	public void subscribe() {
		numSubscriber++;
	}
	
	public void unsubscribe() {
		numSubscriber--;
	}
}
