package repetition;//introductory practices on loop part 12


import java.util.*;

public class Repetition11 {
public static void main (String[]args)
{
	Scanner sc=new Scanner (System.in);
	System.out.print("Number of students? ");
	int num=sc.nextInt();
	String name,matricNum; double mark1, mark2,mark3,yourAvgMark,totalMark=0,avgMark;
	
	for (int i=0;i<=num;i++)
	{
		System.out.printf("-Student %1d- ",i);
		System.out.print("\nName: ");
		name=sc.nextLine();
		sc.nextLine();
		System.out.print("\nMatric Number: ");
		matricNum=sc.next();
		System.out.print("\nMark of Test 1: ");
		mark1=sc.nextInt();
		System.out.print("\nMark of Test 2: ");
		mark2=sc.nextInt();
		System.out.print("\nMark of Test 3: ");
		mark3=sc.nextInt();
		yourAvgMark=(mark1+mark2+mark3)/3;
		System.out.printf("Student: %1s\nMatric Number: %1s\nAverage Mark: %.2f\n\n",name,matricNum, yourAvgMark);
		totalMark+=mark1+mark2+mark3;
	}
	avgMark=totalMark/num;
	System.out.printf("Total Mark for %1d students is %.2f.\nAverage Mark for %1d students is %.2f.",num,totalMark,num,avgMark);
	
	sc.close();
}
}
