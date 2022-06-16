package binary_IO;
import java.io.*;

public class Book implements Serializable {
	
	// By adding 'transient', implement serializable to enable write it to output stream
	private String title;
	private transient double price;	
	private transient static double total;	// static data field is not serialized by default. Need to add keyword 'transient'
	
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
