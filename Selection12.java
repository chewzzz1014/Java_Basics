//introductory practices on selection statement part 13

package myExercises;
import java.util.Scanner;

public class Selection12 {
  public static void main (String[]args)
  {
	  Scanner sc=new Scanner (System.in);
	  
	  //request input
	  System.out.print("Enter Assesment 1's mark: ");
	  double markAss1=sc.nextDouble();
	  System.out.print("\nEnter Assesment 2's mark: ");
	  double markAss2=sc.nextDouble();
	  System.out.print("\nEnter Lab Assessment's mark: ");
	  double markLabAss=sc.nextDouble();
	  System.out.print("\nEnter Final Exam's mark: ");
	  double markfinalExm=sc.nextDouble();
	  
	  //calculate mark for each evaluation
	  double Ass1= markAss1*0.15;
	  double Ass2= markAss2*0.2;
	  double LabAss= markLabAss*0.35;
	  double finalExm= markfinalExm *0.3;
	  char perc = '%';
	  
	  //total mark
	  double totalMark= Ass1+Ass2+LabAss+finalExm;
	  
	  // display all marks calculated
	  System.out.printf("\n\n\nAssessment 1: %.2f%1c\n",Ass1,perc);
	  System.out.printf("Assessment 2: %.2f%1c\n",Ass2,perc);
	  System.out.printf("Lab Assessment: %.2f%1c\n",LabAss,perc);
	  System.out.printf("Final Exam: %.2f%1c\n",finalExm,perc);
	  System.out.printf("Total Mark: %.2f%1c\n",totalMark,perc);
	  System.out.print("*********************************\n");
	  System.out.print("Minimum requirement mark to pass is 50.\n");
	  
	  //determine pass or fail using single selection
	  if (totalMark<50)
		  System.out.println("YOU FAILED!");
	  else
		  System.out.println("YOU PASSED!");
	  
	  sc.close();
  }
}

