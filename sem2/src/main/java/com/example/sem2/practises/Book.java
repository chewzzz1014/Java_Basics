package com.example.sem2.practises;

public class Book extends Publication {
		private int edition;
		
		// title is compulsory field
		Book(String title){
			super(title);
			this.edition = 1;
		}
		
		Book(Author author, String title, int pgNum, int year, boolean hasDigital, Publisher publisher, int edition, double price){
			super(author, title, pgNum, year, hasDigital, publisher, price);
			this.edition = edition;
		}
		
		public int getEdition() {
			return this.edition;
		}
		
		public void setEdition(int edition) {
			this.edition = edition;
		}
		
		public void printDetail() {
			System.out.printf("\n[Book]\n\nTitle: %1s\nAuthor: %1s\nNumber of pages: %1d\nYear of Publication: %1d\nHas digital version: %1b\nPublisher: %1s\nEdition: %1d\nPrice: RM%.2f\nNum of Subscribers: %1d\n", this.getTitle(), this.getAuthor().getName(), this.getPgNum(), this.getYear(), this.getHasDigital(), this.getPublisher().getName(), this.getEdition(), this.getSubscription().getPrice(), this.getSubscription().getNumSubscriber() );
		}
}
