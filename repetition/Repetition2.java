//introductory practices on loop part 3
//basic arithmetic

package repetition;
import java.util.*;

public class Repetition2 {
public static void main (String[]args)
{
	Scanner sc=new Scanner (System.in);
	double distance, claim=0;
	
	for (int count=0; count<20; count++)
	{
		System.out.print("**********************************");
		System.out.print("\nEnter Distance (km): ");
		distance=sc.nextDouble();
		if (distance<=500)
			claim=distance*0.70;
		else
			claim=500*0.70+(claim-500)*0.50;
		
		System.out.printf("\nClaim: RM%.2f.\n",claim);
	}
	System.out.print("\n**********************************");
	
	
	sc.close();
}
}
