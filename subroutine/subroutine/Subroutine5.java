//introductory practices on nested loop part 6
//array, selection, repetition

package subroutine;
import java.util.Scanner;

public class Subroutine5 {
	
public static char getGrade (double weight)
{
	char grade;
	if (weight>44) grade='A';
	else if (weight>=30 && weight<=44) grade='B';
	else if (weight>=25 && weight<=29) grade='C';
	else grade='D';
	return grade;
}

public static void updateNumEggsInGrade (int[]array, int idx)
{
	array[idx]+=1;
	
}

public static void updateWeightInGrade (double[]array, int idx,double weight)
{
	array[idx]+=weight;
	
}

public static void printReport (double total, int[]num, double[]weight)
{
	double avg;
	char[] alpha= {'A','B','C','D'};
	for (int i=0;i<4;i++)
	{
		if (num[i]==0)
			avg=0;
		else avg = weight[i]/num[i];
		System.out.printf("Grade %1c has %1d eggs and average of %.2fg.\n",alpha[i],num[i],avg);
	}
	System.out.printf("Total weight of all eggs of all grades is %.2fg.",total);
}

public static void main (String[]args)
{
	Scanner sc = new Scanner (System.in);
	boolean moreReport=false;
	char grade, getMoreReport;
	//int[] eggsPerGrade = {0,0,0,0};
	//double[] weightPerGrade = new double [4];
	double total=0,weight;
	
	do
	{
		total=0;
		int[]eggsPerGrade= {0,0,0,0};
		double[] weightPerGrade= {0,0,0,0};
		System.out.println("************************************************");
		for (int i=0;i<3;i++)
		{
			System.out.println("Egg "+(i+1));
			System.out.print("Enter weight: ");
			weight=sc.nextDouble();
			total+=weight;
			grade= getGrade(weight);
			switch (grade)
			{
			case 'A': 
				updateNumEggsInGrade(eggsPerGrade,0);
				updateWeightInGrade(weightPerGrade,0,weight);
				break;
			case 'B':
				 updateNumEggsInGrade(eggsPerGrade,1);
				 updateWeightInGrade(weightPerGrade,1,weight);
				break;
			case 'C':
				 updateNumEggsInGrade(eggsPerGrade,2);
				 updateWeightInGrade(weightPerGrade,2,weight);
				break;
			case 'D':
				 updateNumEggsInGrade(eggsPerGrade,3);
				 updateWeightInGrade(weightPerGrade,3,weight);
				break;
			}
		}
		printReport(total,eggsPerGrade,weightPerGrade);
		System.out.println("\n************************************************");
		System.out.print("\nMore report? (Y/N) ");
		getMoreReport=sc.next().toUpperCase().charAt(0);
		if (getMoreReport=='Y')
			moreReport=true;
		
	} while(moreReport);
	sc.close();
}
}
