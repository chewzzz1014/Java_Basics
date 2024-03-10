package com.example.sem1.repetition;//introductory practices on loop part 10


import java.util.*;

public class Repetition9 {
public static void main (String[]args)
{
	Scanner sc=new Scanner (System.in);
	System.out.print("Multiplication table should have multiply till? ");
	int multiply=sc.nextInt();
	//print header
	System.out.print("\t");
	for (int i=1;i<=multiply;i++)
	{
		System.out.printf("%3d\t",i);
		if (i==multiply)
		System.out.print("\n");
	}
	System.out.print("***");
	for (int m=1;m<=multiply;m++)
		System.out.print("********");
	System.out.print("\n");
	
	//print contents of table
	for (int i=1;i<=multiply;i++)
	{
		System.out.printf("%02d|\t",i);
		for (int j=1;j<=multiply;j++)
		{ 
			if (multiply*multiply>999)
			{
			System.out.printf("%04d\t",(j*i));
			if (j==multiply)
				System.out.print("\n");
			}
			else
			{
				System.out.printf("%03d\t",(j*i));
				if (j==multiply)
					System.out.print("\n");
			}
		}
	}
	
	sc.close();
}
}
