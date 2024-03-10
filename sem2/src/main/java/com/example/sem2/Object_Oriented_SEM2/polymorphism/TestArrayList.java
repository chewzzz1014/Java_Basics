package com.example.sem2.Object_Oriented_SEM2.polymorphism;
import java.util.ArrayList;

// using methods of ArrayList

public class TestArrayList {
	public static void main (String[]args) {
		
		ArrayList<String> cities = new ArrayList<>();
		
		// add cities into the arraylist
		cities.add("Kuala Lumpur");
		cities.add("Tawau");
		cities.add("London");
		cities.add("Paris");
		cities.add("Beijing");
		
		// size()
		System.out.println("List size: "+cities.size());
		
		//  contains(o: Object)
		System.out.println("Is Tokyo in the list: "+cities.contains("Tokyo"));
		
		// get(idex: int)
		System.out.println("The first city is "+cities.get(0));
		
		// indexOf(o: Object)
		System.out.println("The index of Paris: "+cities.indexOf("Paris"));
		
		// isEmpty
		System.out.println("Is the list empty: "+cities.isEmpty());
		
		// add( idx: int, o:Object)
		System.out.println("Adding \"New York\" at index 2...");
		cities.add(2, "New York");
		
		// remove(idx: int) or remove(o: Object)
		System.out.println("Removing element at index 1...");
		cities.remove(1);
		System.out.println("Removing \"Tawau\"...");
		cities.remove("Tawau");
		
		// toString(): String
		System.out.println(cities.toString());
		
		System.out.println("Iterating over the list...");
		// iterate over the ArrayList
		for (String city: cities) {
			System.out.print(city+" ");
		}
	}
}
