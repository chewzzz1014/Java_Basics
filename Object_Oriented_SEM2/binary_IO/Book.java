package binary_IO;
import java.io.*;

// make the Book class Serializable so that it can be written to ObjectStream
public class Book implements Serializable {
	
	private String title;
	private double price;	
	private static double total;	
	
	Book(){
		
	}
	
	Book (String title, double price){
		this.title = title;
		this.price = price;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public static double getTotal() {
		return total;
	}
	
	public static void addTotalPriceOfBooks(double price) 	{
		total += price;
	}
	
}
