// week 7
package com.example.sem2.Object_Oriented_SEM2.Lab5;
import java.util.*;

public class FoodCatchException {
	public static void main (String[]args) {
		
		String item;
		double totalCalories, fat;
		Scanner sc = new Scanner (System.in);
		int i = 1;
		
		System.out.println("Enter 5 food.");
		
		do {
			
		try {
			System.out.print("\n("+i+")"+"Enter item name: ");
			item = sc.next();		
			// InputMismatchException if entered incorrect type
			
			System.out.print("\n("+i+")"+"Enter total calories: ");
			totalCalories = sc.nextDouble();	
			// InputMismatchException if entered incorrect type
			
			System.out.print("\n("+i+")"+"Enter fat: ");
			fat = sc.nextDouble();		
			// InputMismatchException if entered incorrect type
			
			FoodEx f = new FoodEx(item, totalCalories, fat);
			
			
			f.calcCaloriesFromFat();
			
			f.calcPercentageOfCaloriesFromFat();		
			// ArithmeticException if totalCalories is 0 (division by 0)
			
			f.checkIsValid () ;		
			// IllegalArgumentException if caloriesFromFat > totalCalories
			
			foodDetails(f);
			
			i++;		// valid item if no exception is raised
		}
		
		catch (IllegalArgumentException ex){
			// caloriesFromFat > totalCalories
			System.out.print("\n"+ex);
		}
		
		catch (ArithmeticException ex) {
			// division by zero
			System.out.print("\n"+ex);
		}
		
		catch(InputMismatchException ex) {
			// wrong type for variable
			 System.out.print("\nInputMismatchException: Invalid due to invalid type. Try again.");
			 sc.nextLine();
		}
		
		finally {
			System.out.print("\nThank You\n");
			System.out.print("***************************************\n");
		}
		
	} while (i <= 5);
		
		sc.close();
		
	}
	
	public static void foodDetails(FoodEx f) {
		
		//print all the data fields of object from class Food
		char symbol = '%';
		System.out.printf("\nFood Item: %1s\nTotal Calories: %.1f\nFat (grams): %.2f\nCalories from fat: %.2f\nPercentage of calories from fat: %.2f%1c\n", f.getItem(), f.getTotalCalories(), f.getFat(), f.getCaloriesFromFat(), f.getPrecentageOfCaloriesFromFat(), symbol);
		
		System.out.print(f.checkIsLowFat());
		
		System.out.println();
		
	}
}
