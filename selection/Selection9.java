//introductory practices on selection statement part 10
//basic arithmetic



package selection;
import java.util.Scanner;


public class Selection9 {
 public static void main (String[]args)
 {
	 //create Scanner object and request input
	 Scanner sc=new Scanner (System.in);
	 System.out.println("////////////WELCOME!//////////////");
	 System.out.println("**********************************");
	 System.out.print("Enter age: ");
	 int age=sc.nextInt();
	 System.out.println("\nPark Type: Theme Park ('T') or Water Park ('W) or Both Parks (Any Character)");
	 System.out.print("\nEnter Park Type: ");
	 char parkType= sc.next().charAt(0);
	 int ticketCharge=0;
	 
	 //multiple selection to determine ticketCharge
	 if ( age>=55 )
	 {
		 if ( parkType=='T')
			ticketCharge=10;
		 else if ( parkType=='W')
			 ticketCharge=15;
		 else
			 ticketCharge=20;
	 }
	 
	 else if ( age>=21 && age<=54 )
	 {
		 if ( parkType=='T')
			ticketCharge=25;
		 else if ( parkType=='W')
			 ticketCharge=30;
		 else
			 ticketCharge=45;
	 }
	 
	 else if ( age>=13 && age<=20 )
	 {
		 if ( parkType=='T')
			ticketCharge=20;
		 else if ( parkType=='W')
			 ticketCharge=35;
		 else
			 ticketCharge=40;
	 }
	 else if ( age>=3 && age<=12 )
	 {
		 if ( parkType=='T')
			ticketCharge=10;
		 else if ( parkType=='W')
			 ticketCharge=15;
		 else
			 ticketCharge=20;
	 }
	 else if ( age<3 )
	 {
		 if ( parkType=='T')
			ticketCharge=0;
		 else if ( parkType=='W')
			 ticketCharge=7;
		 else
			 ticketCharge=5;
	 }
	 
	 
	 //display output
	 System.out.println("**********************************");
	 System.out.printf("Ticket Charge is RM %.2f\n",ticketCharge);
	 System.out.println("**********************************");
	 System.out.println("           THANK YOU!             ");
	 
	 
	 sc.close();
 }
}
