package com.example.sem2.practises;

public class Article extends Publication{
		private int volume = 1;
		
		Article(String name){
			super(name);
		}
		
		Article(Author author, String title, int pgNum, int year, boolean hasDigital, Publisher publisher, int volume, double price){
			super(author, title, pgNum, year, hasDigital, publisher, price);
			this.volume = volume;
		}
		
		public int getVolume() {
			return this.volume;
		}
		
		public void setVolume(int volume) {
			this.volume = volume;
		}
		
		public void printDetail() {
			System.out.printf("\n[Article]\n\nTitle: %1s\nAuthor: %1s\nNumber of pages: %1d\nYear of Publication: %1d\nHas digital version: %1b\nPublisher: %1s\nVolume: %1d\nPrice: RM%.2f\nNum of Subscribers: %1d\n", this.getTitle(), this.getAuthor().getName(), this.getPgNum(), this.getYear(), this.getHasDigital(), this.getPublisher().getName(), this.getVolume(), this.getSubscription().getPrice(), this.getSubscription().getNumSubscriber() );
		}
}
