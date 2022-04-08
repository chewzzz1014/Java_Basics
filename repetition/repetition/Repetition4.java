//introductory practices on loop part 5

package repetition;
import java.util.*;

public class Repetition4 {
public static void main (String[]args)
{
	Scanner sc=new Scanner (System.in);
	System.out.print("\t\t\t**********************\n");
	System.out.print("\n\t\t\tWelcome to Hotel ABC\n");
	System.out.print("\n\t\t\t*********************\n\n");
	System.out.print("\nRoom Types Available: Deluxe (D/d) Superior (S/s) Executive (E/e)\n\n");
	
	//initialize vars
	int count=0,days;
	double bill,totalBill=0;
	String name;
	char code;
	
	//while loop
	while (count<10)
	{
		System.out.print("\n*********************************");
		System.out.print("\nBooking "+(count+1));
		System.out.print("\nEnter your name: ");
		name=sc.nextLine();
		System.out.print("\nEnter room code: " );
		code=sc.next().charAt(0);
		System.out.print("\nEnter number of days: ");
		days=sc.nextInt();
		switch (code)
		{
		case'D':case'd': bill=330*days; break;
		case'S':case's': bill=390*days; break;
		case'E':case'e': bill=480*days; break;
		default: System.out.print("\nInvalid code."); bill=0; break;
		}
		System.out.printf("\n%1s Bill: RM %.2f",name,bill);
		totalBill+=bill;
		count++;
		sc.nextLine();
	}
	System.out.printf("\nTotal Bill: RM%.2f",totalBill);
	System.out.print("\nThank you!");
	sc.close();
}
}

