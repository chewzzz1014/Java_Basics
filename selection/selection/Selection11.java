//introductory practices on selection statement part 12
package selection;

import java.util.Scanner;

public class Selection11 {
 public static void main (String[]args)
 {
	 Scanner sc=new Scanner (System.in);
	 
	 //request input
	 System.out.println("Vehicle Type: Car (1) \n RM 3 for first 3 hours. RM1 for subsequent 2 hours.");
	 System.out.println("\nVehicle Type: Motorcycle (0) \n RM1 per entry. ");
	 System.out.print("\n\nEnter vehicle type: ");
	 char vehicleType=sc.next().charAt(0);
	 System.out.print("\nEnter parking hours: ");
	 int hours=sc.nextInt();
	 
	 double fees=0;
	 //selection statement to calculate fees
	 switch(vehicleType) {
	    case '1': if (hours>3)
	    	        fees=2+((hours-3)*(1.50/2));
	              else
	            	fees=2;
	    break;
	    case '0': fees=	1;
	    break;
	 }
	
	 //display fees
	 System.out.printf("\nFees is RM %.2f",fees);
	 
	 sc.close();
 }
}