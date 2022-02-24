//introductory practices on selection statement part 6
//basic arithmetic


package myExercises;
import java.util.Scanner;

public class Selection5 {
 public static void main (String[]args)
 {
	 Scanner sc=new Scanner (System.in);
	 System.out.println("\n*************WELCOME!*****************");
	 System.out.print("\n*************USER INFO****************");
	 
	 //request input 
	 System.out.print("\nEnter Gender (Male/Female): ");
	 String gender=sc.next();
	 System.out.print("\nEnter Height (m): ");
	 double height=sc.nextDouble();
	 System.out.print("\nEnter Weight (kg): ");
	 double weight=sc.nextDouble();
	 System.out.print("\nEnter Waist Size (inches): ");
	 double waist=sc.nextDouble();
	 
	 //calculate bmi
	 double bmi= weight/(height*height);
	 System.out.println("\n********************ANALYSIS************************");
	 System.out.println("Body Mass Index (BMI): "+bmi);
	 System.out.print("BMI Status: ");
	 
	 //determine bmi status using if 
	if (bmi>=18.5 && bmi<25)
		 System.out.print("Normal");
	else if (bmi>=25 && bmi<30)
		 System.out.print("Over Weight");
	else if (bmi>=30 && bmi<35)
		 System.out.print("Obese");
	else if (bmi>=35)
		 System.out.print("Severely Obese");
	else 
		System.out.print("Under Weight");
	
	System.out.print("\nRisk Status: ");
	//determine risk
	if ( gender.equalsIgnoreCase("Male")&&waist>35 || gender.equalsIgnoreCase("Female")&&waist>40)
		System.out.print("Higher risk for heart disease and type 2 diabetes.");
	else
		System.out.print("Low Risk");
	
	System.out.print("\n********************THANK YOU!************************");
	
	sc.close();
 }
}
