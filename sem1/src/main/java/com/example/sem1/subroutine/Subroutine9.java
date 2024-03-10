//introductory practices on subroutine part 10

package com.example.sem1.subroutine;
import java.util.Scanner;

public class Subroutine9{
	
public static double getFoot ()
{
	Scanner sc = new Scanner (System.in);
	System.out.print("Enter length in foot: ");
	double foot = sc.nextDouble();
	sc.close();
	return foot;
}

public static double footToMeter (double f)
{
	return 0.305*f;
}

public static void printResult (double f, double m)
{
	System.out.printf("\n%.2f foot is %.2f meter.",f,m);
}

public static void main (String[]args) {
	double foot = getFoot();
	printResult (foot, footToMeter(foot));
}
}
