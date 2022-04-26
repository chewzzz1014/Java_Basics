package polymorphism;
import java.util.*;

public class TestCar {
	public static void main(String[]args) {
		
		ArrayList<Car> carList = new ArrayList<>();
		
		carList.add( new Car(25, "50000","Red") );
		
		carList.add( new MVP(50, "45000", "Mint Green", 20) );
		
		carList.add( new Sedan(76, "57000", "Maroon", 2012, 54) );
		
		carList.add(new Caravan(50, "56000", "Yellow", 2000) );
		
        printCarDetails(carList);
	}
	
	public static void printCarDetails(ArrayList<Car>carList)  
	{
		for (Car car : carList) {
			// invoke toString() and SalePrice() polymorphically
			if (car instanceof Car)
				System.out.print("--An instance of class Car--");
			System.out.print("\n"+car.toString());
			System.out.print("\nSale Price: RM "+car.SalePrice());
			System.out.println("\n********************************");
		}
	}
	
}
