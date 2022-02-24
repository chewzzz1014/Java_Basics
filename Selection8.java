//introductory practices on selection statement part 9
//basic comparison of 2 letters


package myExercises;
import java.util.Scanner;

public class Selection8 {
public static void main (String[]args)
{
	 Scanner sc=new Scanner (System.in);
	 
	 //request input
	 System.out.print("Enter first letter: ");
	 Character ch1=sc.next().charAt(0);
	 System.out.print("\nEnter second letter: ");
	 Character ch2=sc.next().charAt(0);
	 
	 //compare ch1,ch2
	 String str="Please run the programme again and enter valid input(s).";
	 if (Character.isDigit(ch1)&&Character.isDigit(ch2))
		 System.out.print("\nBoth characters must be letter. "+str);
	 else if (Character.isDigit(ch1))
		 System.out.print("\nCharacter 1 must be letter. "+str);
	 else if (Character.isDigit(ch2))
		 System.out.print("\nCharacter 2 must be letter. "+str);
	 else
	 {

		 
		 if ( ch1.equals(ch2) || Character.toUpperCase(ch1)==(Character.toUpperCase(ch2)) )
			 System.out.print("\nBoth letters are equal regardless of case.");
		 else
		 { System.out.print("\nBoth letters are not equal regardless of case.");
		  if (ch1>ch2)
			  System.out.print("\nFirst letter is alphabetically larger .");
		  else
			  System.out.print("\nSecond letter is alphabetically larger .");
		 } 
		 
	 }
	 
	 
	 sc.close();
}
}