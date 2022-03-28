
public class Book {
	
	private String title;
	private double price;
	private static double total;
	
	Book(){
		total += price;		//by default, price is 0
	}
	
	Book(String title, double price){
		this.title = title;
		this.price = price;
		total += price;
	}
	
	public String getTitle() {
		return title;
	}
	
	public double getPrice() {
		return price;
	}
	
	public static double getTotal() {
		return total;
	}
	
	public static void addTotalPriceOfBook(double price) {
		total += price;
	}
	
}
