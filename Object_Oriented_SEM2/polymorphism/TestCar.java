package polymorphism;
import java.util.*;

public class TestCar {
	public static void main(String[]args) {
		// an ArrayList of type Car
		ArrayList<Car> carList = new ArrayList<>();
		
		// created an object of class Car and store in array list
		carList.add( new Car(25, "50000","Red") );
		
		// created an object which has supertype Car and subtype MVP
		carList.add( new MVP(50, "45000", "Mint Green", 20) );
		
		// created an object which has supertype Car and subtype Sedan
		carList.add( new Sedan(76, "57000", "Maroon", 2012, 54) );
		
		// created an object which has supertype Car and subtype Caravan
		carList.add(new Caravan(50, "56000", "Yellow", 2000) );
		
        printCarDetails(carList);
	}
	
	public static void printCarDetails(ArrayList<Car>carList)  
	{
		for (Car car : carList) {
			// invoke toString() and SalePrice() polymorphically
			
			if (car instanceof Car)	// check if car is an object of Car 
				System.out.print("--An instance of class Car--");
			
			System.out.print("\n"+car.toString());
			System.out.print("\nSale Price: RM "+car.SalePrice());
			System.out.println("\n********************************");
		}
	}
	
}
