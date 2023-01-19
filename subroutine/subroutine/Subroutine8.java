//introductory practices on nested loop and subroutine part 9

package subroutine;
import java.util.*;

public class Subroutine8 {

public static void getInput (int[]userNum, int[]age, double[]weight, double[]height,Scanner sc)
{
	for (int i=0;i<userNum.length;i++)
	{
		System.out.print("Enter User ID: ");
		userNum[i] = sc.nextInt();
		System.out.print("Enter Age: ");
		age[i] = sc.nextInt();
		System.out.print("Enter Weight(kg): ");
		weight[i] = sc.nextDouble();
		System.out.print("Enter Height(cm): ");
		height[i] = sc.nextDouble()*0.01;
		System.out.println();
	}
}

public static void calcBMI (double[]weight,double[]height,double[]bmi)
{
	for (int i=0;i<weight.length;i++)
		bmi[i] = weight[i]/(height[i]*height[i]);
	
}

public static void determineCategory (double[]bmi, int[]category)
{
	for (int i=0;i<bmi.length;i++)
	{
		if ( bmi[i]>=18.5 && bmi[i]<=24.9)
			category[i]=1;
		else if ( bmi[i]>=25 && bmi[i]<=29.9)
			category[i]=2;
		else if ( bmi[i]>=30 && bmi[i]<=34.9)
			category[i]=3;
		else if ( bmi[i]>=35 && bmi[i]<=39.9)
			category[i]=4;
		else if ( bmi[i]>=40)
			category[i]=5;
	}
}

public static void dataEachCat (double[]bmi, int[]cat)
{
	double []sum = new double [bmi.length];
	int[] c = new int [bmi.length];
	String[]catWord = {"Normal", "Over Weight", "Obese","Severely Obese", "Mobidly Obese"};
	for (int i=0;i<bmi.length;i++)
	{
		switch(cat[i])
		{
		case 1: sum[i]+=bmi[i]; c[i]++; break;
		case 2: sum[i]+=bmi[i]; c[i]++; break;
		case 3: sum[i]+=bmi[i]; c[i]++; break;
		case 4: sum[i]+=bmi[i]; c[i]++; break;
		case 5: sum[i]+=bmi[i]; c[i]++; break;
		}
	}
	for (int i=0;i<5;i++)
	{
		if (c[i]!=0)
			System.out.printf("The average bmi for %1s is = %.2f\n",catWord[i],(sum[i]/c[i]));
	}
}

public static void displayUserData (int[]userNum, int[]age, double[]weight, double[]height,double[]bmi,int[]cat)
{
	System.out.printf("%1s\t\t%1s\t%1s\t%1s\t%1s\t%1s\n","Name","Age","Weight","Height","BMI","Weight Category");
	for (int i=0;i<userNum.length;i++)
	{
		System.out.printf("%6d\t\t%2d\t%4.0f\t%3.0f\t%.1f\t",userNum[i],age[i],weight[i],height[i],bmi[i]);
		switch (cat[i])
		{
		case 1: System.out.println("Normal"); break;
		case 2: System.out.println("Over Weight"); break;
		case 3: System.out.println("Obese"); break;
		case 4: System.out.println("Severely Obese"); break;
		case 5: System.out.println("Morbidly Obese"); break;
		default: System.out.println("Not relevant");
		}
	}
}

public static void main (String[]args)
{
	Scanner sc = new Scanner (System.in);
	System.out.print("Enter number of registered user: ");
	int numUser = sc.nextInt();
	
	int []userNum = new int[numUser];
	int []age = new int [numUser];
	double []weight = new double [numUser];
	double []height = new double[numUser];
	double []bmi = new double[numUser];
	int []category = new int [numUser];
	
	getInput(userNum,age,weight,height,sc);
	calcBMI(weight,height,bmi);
	determineCategory(bmi,category);
	displayUserData(userNum,age,weight,height,bmi,category);
	dataEachCat(bmi,category);
	
	sc.close();
}
}
