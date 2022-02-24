//convert hexadecimal into decimal
//involves selection statements


package myExercises;
import java.util.Scanner;

public class HexDigit {
  public static void main (String[]args)
  {
	Scanner sc=new Scanner (System.in);
 
  //request input
  System.out.print("Enter hexcimal digit (0 to F): ");
  char input=sc.next().toUpperCase().charAt(0);
  
  boolean isHex=true;
  char decimalValue;
 
  if (Character.isLetter(input)) 
  {
	  
	  switch (input)
	  {
	   case 'A':case'B':case'C':case'D':case'E':case'F': decimalValue= input-'A'+10;
	   break;
	   default: isHex=false; System.out.print("\nInvalid value.");
	   break;
	  }
  }
  
  if (isHex)
	  System.out.printf("\nDecimal value of hexcimal digit, %1c is %1c.",input,decimalValue);
   
}
}
