package com.example.sem2.practises;

public class TechReport extends Publication {
	private long reportNum;
	
	// title is compulsory field
	TechReport(String title){
		super(title);
		this.reportNum = 000000000000L;
	}
	
	TechReport(Author author, String title, int pgNum, int year, boolean hasDigital, Publisher publisher, long reportNum, double price){
		super(author, title, pgNum, year, hasDigital, publisher, price);
		this.reportNum = reportNum;
	}
	
	public long getReportNum() {
		return this.reportNum;
	}
	
	public void setEdition(long reportNum) {
		this.reportNum = reportNum;
	}
	
	public void printDetail() {
		System.out.printf("\n[Technical Report]\n\nTitle: %1s\nAuthor: %1s\nNumber of pages: %1d\nYear of Publication: %1d\nHas digital version: %1b\nPublisher: %1s\nReport Number: %1d\nPrice: RM%.2f\nNum of Subscribers: %1d\n", this.getTitle(), this.getAuthor().getName(), this.getPgNum(), this.getYear(), this.getHasDigital(), this.getPublisher().getName(), this.getReportNum(), this.getSubscription().getPrice(), this.getSubscription().getNumSubscriber() );
	}
}
