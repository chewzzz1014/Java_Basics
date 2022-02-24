//introductory practices on loop part 8


import java.util.*;

public class Repetition7 {
public static void main (String[]args)
{
	Scanner sc=new Scanner (System.in);
	
	//request input repeatedly until user enter 0
	System.out.print("Enter number: ");
	int num=sc.nextInt();
	int sum=0;
	
	//use while loop to request input
	while (num!=0)
	{
	 sum+=num;
	 System.out.print("\nEnter number: ");
	 num=sc.nextInt();
	}
	System.out.printf("\nThe sum of all non-zero integers is %1d.", sum);
	sc.close();
}
}

