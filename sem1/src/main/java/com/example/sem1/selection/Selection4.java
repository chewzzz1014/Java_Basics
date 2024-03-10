//introductory practices on selection statement part 5


package com.example.sem1.selection;
import java.util.Scanner;

public class Selection4 {
 public static void main (String[]args) {
	 Scanner sc=new Scanner (System.in);
	 
	 System.out.print("\n\nHEALTH RISK ANALISYS ");
	 System.out.println("\n\n\n****************************");
	 //request inches from user
	 System.out.print("Enter waist size (inches): ");
	 double inches=sc.nextDouble();
	 
	 //displaying output
	 System.out.println("\n****************************");
	 System.out.println("Here is what we got: ");
	 System.out.printf("Waist size: %.2f inches.\n",inches);
	 
	 //determine the risk status 
	 if (inches<35)
	  System.out.println("Status: Low Risk");
     else
		 System.out.print("Status: High Risk");
	 
	 sc.close();
 }
}