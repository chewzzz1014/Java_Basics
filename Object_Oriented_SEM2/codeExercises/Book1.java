package codeExercises;
// Week 1
public class Book1 {

	
	private String title;
	private double price;
	private static double total;
	
	Book1(){
		total += price;		//by default, price is 0 and title is null
	}
	
	Book1(String title, double price){
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
