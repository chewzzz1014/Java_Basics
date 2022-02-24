//introductory practices on loop part 7

package myExercises;
import java.util.Scanner;

public class Repetition6 {
public static void main (String[]args)
{
	Scanner sc=new Scanner (System.in);
	int num,min=0,count=0;
	
	System.out.print("\nEnter 5 integers: ");
	
	
	//finds smallest among 5 integers entered by user using do-while loop
	/*
	do {
	    num=sc.nextInt();
	    System.out.print(" ");
	    if (count==0 || num<min)
	    	min=num;
	    count++;
	} while (count<5);
	System.out.printf("\nThe smallest number is %1d.",min);
	*/
	
	
	//or using for loop
	for(int c=0;c<5;c++ )
	{
		num=sc.nextInt();
		if (c==0 || num<min)
			min=num;
	}
	sc.close();
	System.out.printf("The smallest integer is %1d.",min);
	
}
}
