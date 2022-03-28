
public class TestBook {
	public static void main (String[]args) {
		
		Book book1 = new Book();
		System.out.printf("Title of book1 is \"%1s\". Price is RM %.2f and current total price is RM %.2f.\n", 
				book1.getTitle(), book1.getPrice(), Book.getTotal());
		
		Book book2 = new Book("The Book of Wonder",55);
		System.out.printf("Title of book2 is \"%1s\". Price is RM %.2f and current total price is RM %.2f.\n", 
				book2.getTitle(), book2.getPrice(), Book.getTotal());
		
		Book.addTotalPriceOfBook(40);
		System.out.printf("Current total price is RM %.2f.\n", Book.getTotal());
	}
}
