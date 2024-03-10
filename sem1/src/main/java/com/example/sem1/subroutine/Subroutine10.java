//introductory practices on nested loop and subroutine part 11

package com.example.sem1.subroutine;
import java.util.Scanner;

public class Subroutine10 {
	
public static int getNum ()
{
	Scanner sc = new Scanner (System.in);
	System.out.print("Enter a number: ");
	int n = sc.nextInt();
	sc.close();
	return n;
}

public static boolean divisibleBy3 (int n)
{
	if (n%3==0)
		return true;
	else
		return false;
}

public static void printResult (int n, boolean i)
{
	if (i)
		System.out.printf("\n%1d is divisible by 3.",n);
	else
		System.out.printf("\n%1d is not divisible by 3.",n);
}

public static void main (String[]args)
{
	int num = getNum();
	printResult (num, divisibleBy3(num));
}
}
