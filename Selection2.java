//introductory practices on selection statement part 3



import java.util.Scanner;

public class Selection2 {
 public static void main (String[]args)
 {
	 Scanner sc=new Scanner (System.in);
	 //request age and gender
	 System.out.print("Enter age: ");
	 int age=sc.nextInt();
	 System.out.print("\nAre you male? (true/false): ");
	 boolean isMale=sc.nextBoolean();
	 
	 //determine whether application is rejected or accepted
	 if (age>=18 && age<=30 && isMale)
		 System.out.print("\nApplication accepted.");
	 else
		 System.out.print("\nApplication rejected.");
	 
	 sc.close();
 }
}

