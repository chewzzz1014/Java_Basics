package com.example.sem2.practises;

public class Publication {
	// title is compulsory field and its value can't be changed
	private Author author;
	private Publisher publisher;
	private String title;
	private int pgNum, year;
	private boolean hasDigital;
	private double price = 0;
	private Subscription subscription;

	
	Publication(String title){
		this(null, title, 0, 0000, false, null, 0);
	}
	
	Publication(Author author, String title, int pgNum, int year, boolean hasDigital, Publisher publisher, double price){
		this.author = author;
		this.title = title;
		this.pgNum = pgNum;
		this.year = year;
		this.hasDigital = hasDigital;
		this.publisher = publisher;
		this.price = price;
		publisher.incrementNumPublication();
		subscription = new Subscription(price);
	}
	
	public Author getAuthor() {
		return author;
	}
	
	public Publisher getPublisher() {
		return publisher;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public int getPgNum() {
		return this.pgNum;
	}
	
	public int getYear() {
		return this.year;
	}
	
	public boolean getHasDigital() {
		return this.hasDigital;
	}
	
	public Subscription getSubscription() {
		return this.subscription;
	}
	
	
	public void setAuthor(Author author) {
		this.author = author;
	}
	
	public void setPgNum(int pgNum) {
		this.pgNum = pgNum;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	
	public void setHasDigital() {
		this.hasDigital = true ;
	}
	
	
	
}
