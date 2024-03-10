package com.example.sem1.repetition;//introductory practices on loop part 13


import java.util.Scanner;

public class Repetition12 {
public static void main (String[]args)
{
	Scanner sc=new Scanner (System.in);
	double mark,avgMark,totalMark;
	
	//request input
	System.out.print("Enter number of students: ");
	int numStd=sc.nextInt();
	System.out.print("\n\n");
	//loop through all students
	for (int i=1;i<=numStd;i++)
	{
		System.out.printf("Student %1d\n",i);
		totalMark=0;
		//loop through marks for 3 tests
		for (int t=1;t<=3;t++)
		{
			System.out.printf("Enter Mark of Test %1d: ",t);
			mark=sc.nextDouble();
			totalMark+=mark;
			System.out.print("\n");
		}
		avgMark=totalMark/3;
		System.out.printf("Average Mark of 3 Tests is %.2f.\n", avgMark);
		if (avgMark<50)
			System.out.print("Failed!\n\n");
		else
			System.out.print("Passed!\n\n");
	}
	sc.close();
}
}

