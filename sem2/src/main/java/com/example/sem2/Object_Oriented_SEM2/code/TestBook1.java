package com.example.sem2.Object_Oriented_SEM2.code;

public class TestBook1 {
	public static void main (String[]args) {
		
		Book1 book1 = new Book1();
		System.out.printf("Title of book1 is \"%1s\". Price is RM %.2f and current total price is RM %.2f.\n", 
				book1.getTitle(), book1.getPrice(), Book1.getTotal());
		
		Book1 book2 = new Book1("The Book of Wonder",55);
		System.out.printf("Title of book2 is \"%1s\". Price is RM %.2f and current total price is RM %.2f.\n", 
				book2.getTitle(), book2.getPrice(), Book1.getTotal());
		
		Book1.addTotalPriceOfBook(40);
		System.out.printf("Added new book (RM%.2f).\n", 40.0 );
		System.out.printf("Current total price is RM %.2f.\n", Book1.getTotal());
		
		Book1 book3 = new Book1("Alice in the wonderland", 30);
		System.out.printf("Title of book3 is \"%1s\". Price is RM%.2f and current total price is RM %.2f.\n",
				book3.getTitle(), book3.getPrice(), Book1.getTotal());
		
		System.out.printf("Total price is RM%.2f", Book1.getTotal());
	}
}

