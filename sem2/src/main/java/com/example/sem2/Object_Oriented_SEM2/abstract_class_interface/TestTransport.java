package com.example.sem2.Object_Oriented_SEM2.abstract_class_interface;
import java.util.*;

public class TestTransport {
	public static void main (String[]args) {
		
		// ArrayList that stores objects of Transport
		ArrayList <Transport> t = new ArrayList<>();
		t.add(new Van("V212345", 12000, 7));
		t.add(new Van("V424567", 35000, 10));
		
		t.add(new Lorry("L345632", 75000, 4000));
		t.add(new Lorry("L230485", 123000, 8000));
		
		// print the details of every Transport object
		for (Transport vl:t) {
			// select toString() based on dynamic binding
			System.out.print(vl.toString());
			
			char p = '%';
			System.out.printf("\nValue After 25%1c Discount: RM %.2f\n\n", p, vl.valueAfterDiscount());
		}
		
	}
}
