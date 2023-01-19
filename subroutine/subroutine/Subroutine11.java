//introductory practices on subroutine part 12

package subroutine;
import java.util.Scanner;

public class Subroutine11 {
	
public static double getNum (Scanner sc)
{
	
	System.out.print("\nEnter a number: ");
	double num = sc.nextDouble();
	return num;
}

public static double calcSum (Scanner sc)
{
	double sum = 0;
	for (int i=0;i<3;i++)
		sum+=getNum(sc);
	return sum;
}
public static void main (String[]args)
{
	Scanner sc = new Scanner (System.in);
	System.out.printf("\nThe sum of these 3 numbers is %.2f.",calcSum( sc));
	sc.close();
}
}
