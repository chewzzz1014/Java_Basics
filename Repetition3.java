//introductory practices on loop part 4


import java.util.Scanner;

public class Repetition3 {
public static void main (String[]args)
{
	Scanner sc=new Scanner (System.in);
	
	//request input
	System.out.print("Enter two number: ");
	int num1=sc.nextInt();
	int num2=sc.nextInt();
	
	//determine which number is larger to determine whether prints number is ascending/descending order
	if (num1<num2)
	{
		System.out.print("Number in ascending order: ");
		do 
		{
			System.out.print(num1+" ");
			num1++;
		} while (num1<=num2);
	}
	
	else if (num1>num2)
	{
		System.out.print("Number in descending order: ");
		do 
		{
			System.out.print(num1+" ");
			num1--;
		} while (num1>=num2);
	}
	
	else
		System.out.printf("Two number are both %1d.",num1);
	
	
	sc.close();
}
}
