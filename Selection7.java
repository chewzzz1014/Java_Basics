//introductory practices on selection statement part 8
//Modifying strings


package myExercises;
import java.util.Scanner;

public class Selection7 {
 public static void main (String[]args)
 {
	 Scanner sc=new Scanner (System.in);
	 System.out.print("Note that strings are case sensitive in Java.\n");
	 System.out.print("Enter first string: ");
	 String str1=sc.nextLine();
	 
	 if (str1.length()>10)
	     System.out.printf("\nSubstring from 5 to 10 is \"%1s\" ", str1.substring(5,11));
	 else
		 System.out.print("\nString 1 is less than length 10.");
	
	 System.out.printf("\nString 1 has length of \"%1d\" \n",str1.length());
	 
	 System.out.print("\n\nEnter string 2: ");
	 String str2= sc.nextLine();
	 
	 if (str1.contains(str2))
	 {
		 System.out.print("String 2 exist2 in string 1.\n");
		 
		 String modifiedStr="";
		 int startIndex=str1.indexOf(str2,0);
				 
		 if (startIndex==0)
			modifiedStr="Selamat Datang"+str1.substring(str2.length(),str1.length());
		 else if (startIndex<str1.length()-1)
			 modifiedStr=str1.substring(0,startIndex)+"Selamat Datang"+str1.substring((startIndex+str2.length()),str1.length());
		 else
			 modifiedStr=str1.substring(0,startIndex)+"Selamat Datang";
		 
		 System.out.printf("New string: \"%5s\" ",modifiedStr,"\n");
	 }
	 else
		 System.out.print("String 2 not exist in string 1");
	 
	 
	 sc.close();
 }
}