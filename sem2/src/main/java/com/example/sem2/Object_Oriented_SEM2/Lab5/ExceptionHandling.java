package com.example.sem2.Object_Oriented_SEM2.Lab5;

import java.util.*;

public class ExceptionHandling {
	public static void main (String[]args) {
		
		Scanner sc = new Scanner (System.in);
		int n1, n2;
		double div;
		
		try {
			System.out.print("Enter Number 1: ");
			n1 = sc.nextInt();		// InputMismatchException when entered non integer
			
			System.out.print("\nEnter Number 2: ");
			n2 = sc.nextInt();		// InputMismatchException when entered non integer
			System.out.println();
			
			div = n1 / n2;		// ArithmeticException when trying to divide by 0
			divisionLessThan2(div);		// NumberFormatException if div is less than 2
			divisionMoreThan2(div);		// MoreThanTwoException if div is more than 2
		}
		catch(NumberFormatException ex) {
			System.out.print("\n"+ex);
		}
		catch(MoreThanTwoException ex) {
			System.out.print("\n"+ex);
		}
		catch(InputMismatchException ex) {
			 System.out.println("\nInputMismatchException: An integer is required.");
		}
		catch(ArithmeticException ex) {
			System.out.print("\nArithmeticException: Not Allowed to Divide by 0");
		}
		finally {	// will always execute this
			System.out.print("\nRerun The Program !");
		}
		
		
	}
	
	// throws exception when certain condition satisfies
	public static void divisionLessThan2 (double div) throws NumberFormatException {
		if (div <2.0)
			throw new NumberFormatException(div);
	}
	
	public static void divisionMoreThan2 (double div) throws MoreThanTwoException {
		if (div > 2.0)
			throw new MoreThanTwoException(div);
	}
}
