//introductory practices on selection statement part 11
//basic comparison between strings

import java.util.Scanner;

public class Selection10 {
 public static void main (String[]args)
 {
	 //create Scanner object
	 Scanner sc=new Scanner (System.in);
	 
	 //accept first string
	 System.out.print("Enter first string: ");
	 String str1=sc.nextLine();
	 
	 //check whether length of str1 exceeds 8 and displays length of str1
	 if (str1.length()>8)
		 System.out.print("\nValid Password.");
	 else
		 System.out.print("\nInvalid Password.");
	 
	 System.out.printf("\nFirst string: \"%s\" with length %d\n",str1,str1.length());
	 
	 //accept second string
	 System.out.print("\nEnter second string: ");
	 String str2=sc.nextLine();
	 
	 //check whether second string contains in first string
	 if (str1.contains(str2))
		 System.out.print("\nSecond string exist in first string.");
	 else
	 {
		 System.out.print("Second string not exist in first string.");
		 String str3=str1.concat(str2);
		 System.out.print("\n\nNew string (Combined first string and second string): "+str3);
	 }
	 
	 
	 sc.close();
 }
}