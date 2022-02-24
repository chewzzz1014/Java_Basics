//introductory practices on selection statement part 4


package myExercises;
import java.util.Scanner;

public class Selection3 {
 public static void main (String[]args)
 {
	 Scanner sc=new Scanner (System.in);
	 
	 //request age and vaccination status
	 System.out.print("Enter age: ");
	 int age=sc.nextInt();
	 System.out.print("\nCompleted vaccination dose 1? (true/false) ");
	 boolean vac1=sc.nextBoolean();
	 System.out.print("\nCompleted vaccination dose 2? (true/false) ");
	 boolean vac2=sc.nextBoolean();
	 
	 //determine whether customer is allowed to enter cinema
	 if ( age>17 && vac1 && vac2 )
		 System.out.print("\n\nAllowed to enter.");
	 else
		 System.out.print("\n\nNot allowed to enter.");
	 
	 sc.close();
 }
}
