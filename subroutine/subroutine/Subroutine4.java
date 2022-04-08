//introductory practices on  subroutine part 5
//repetition and selection

package subroutine;
import java.util.Scanner;

public class Subroutine4 {
	
public static int getAge (Scanner sc)
{
	System.out.print("\nEnter age: ");
	int age = sc.nextInt();
	return age;
}

public static double getWeight (Scanner sc)
{
	System.out.print("Enter weight(kg): ");
	double weight = sc.nextDouble();
	return weight;
}

public static double getHeight (Scanner sc)
{
	System.out.print("Enter height(cm): ");
	double height = sc.nextDouble();
	return height;
}


public static char getGender (Scanner sc)
{
	System.out.print("Enter gender(f/m): ");
	char gender = sc.next().toLowerCase().charAt(0);
	return gender;
}

public static int getChoice (Scanner sc)
{
	System.out.print("Enter choice (1-BMI, 2-BMR):  ");
	int choice = sc.nextInt();
	return choice;
}

public static double calcBMI (double weight, double height)
{
	height = height/100;
	return (weight/(height*height));
}

public static double calcBMR (char gender, int age, double weight, double height)
{
	double bmr = 0;
	if (gender=='f')
		bmr = (66+(6.23 * weight) + (12.7 * height)-(6.8 * age ));
	else 
		bmr = 655 + (9.6*weight) + ( 1.8*height) - (4.7*age);
	return bmr;
}

public static void printBMI (double bmi, double height, double weight)
{
	System.out.printf("\nYour height is %.2fcm and weight is %.2fkg. So your BMI is %.2f.\n",height,weight,bmi);
}

public static void printBMR (double bmr, int age, char gender)
{
	System.out.printf("\nYour age is %1d. So your BMR is %.2f.\n",age,bmr);
}

public static void main (String[]args)
{
	Scanner sc = new Scanner (System.in);
	boolean toCont = true;
	int age, choice; 
	double weight, height, bmi, bmr;
	char gender, getToCont;
	
	while(toCont)
	{
		age= getAge(sc);
		weight= getWeight(sc);
		height= getHeight(sc);
		gender= getGender(sc);
		choice= getChoice(sc);
		if (choice!=1 && choice!=2)
		{
			System.out.print("\nWrong code.");
		}
		else
		{
			switch (choice)
			{
			case 1: 
				bmi = calcBMI(weight,height);
				printBMI(bmi,height,weight);
				break;
			case 2:
				bmr= calcBMR(gender,age,weight,height);
				printBMR(bmr,age,gender);
				break;
			}
		}
		
		System.out.print("Do you wish to continue?(y/n) ");
		getToCont = sc.next().toLowerCase().charAt(0);
		if (getToCont=='n') 
			toCont = false;
		System.out.print("****************************************");
	}
}
}