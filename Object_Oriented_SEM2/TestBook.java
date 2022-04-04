// Week 2
// CHEW ZI QING 212360

public class TestBook {
	public static void main (String[]args) {
		
		// create object of class Identification for author of book
		Identification author1 = new Identification("Charles Brooke", "charlesbrooke@gmail.com", 'm');
		
		//create object of class Book
		Book book1 = new Book ("Miracle", author1, 65.99, 2);
		//print details of Book
		printDetails(book1.getName(), book1.getAuthor().to_String(), book1.getPrice());
		
		
		Book book2 = new Book ("Wild", new Identification("James Brooke", "jamesbrooke@gmail.com", 'm'), 109.99, 1);
		printDetails(book2.getName(), book2.getAuthor().to_String(), book2.getPrice());
		
	}
	
	// method that print details of a book
	public static void printDetails(String bookName, String abtAuthor, double price) {
		System.out.printf("%1s by %1s with RM%.2f.\n", bookName, abtAuthor, price);
	}
}
