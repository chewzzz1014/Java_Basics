//introductory practices on  subroutine part 7
//selection


package com.example.sem1.subroutine;
import java.util.*;

public class Subroutine6 {

public static char getGrade (double total)
{
	char grade='N';
	if ( total<=100 && total>=80)
		grade='A';
	else if ( total<=79 && total>=70)
		grade='B';
	else if ( total<=69 && total>=55)
		grade='C';
	else if ( total<=54 && total>=45)
		grade='D';
	else grade='F';
	return grade;
}

public static void printResult (String name,double quiz,double ass, double midTerm,double finalExam)
{
	double total = quiz*0.15 + ass*0.25 + midTerm*0.2 + finalExam*0.4;
	System.out.printf("\n%1s, your final mark for CSC3100 is %.2f and grade %1c", name,total,getGrade(total));
	System.out.print("\n**************************************");
}

public static double calcAvg (double n1, double n2, double n3, int num,String item)
{
	double avg = (n1+n2+n3)/num;
	System.out.printf("\n%1s average is: %.2f",item,avg);
	return avg;
}

public static double readInput (Scanner sc,String item,int num)
{
	if ( item.equals("Mid-Term Exam") || item.equals("Final Exam") )
		System.out.printf("\nEnter %1s Mark: ", item);
	else
		System.out.printf("\nEnter %1s %1d Mark: ", item,num);
	double mark = sc.nextDouble();
	return mark;
}

public static void main (String[]args)
{
	Scanner sc = new Scanner (System.in);
	System.out.print("Enter name: ");
	String name = sc.nextLine();
	System.out.println();
	
	double quiz1 = readInput(sc,"Quiz",1);
	double quiz2 = readInput(sc,"Quiz",2);
	double quiz3 = readInput(sc,"Quiz",3);
	double avgQuiz = calcAvg(quiz1,quiz2,quiz3,3,"Quizzes");
	System.out.println();
	
	double ass1 = readInput(sc,"Assignment",1);
	double ass2 = readInput(sc,"Assignment",2);
	double avgAss = calcAvg(ass1,ass2,0,2,"Assignment");
	System.out.println();
	
	double midTerm = readInput(sc,"Mid-Term Exam",0);
	double finalExam = readInput(sc,"Final Exam",0);
	
	printResult(name,avgQuiz,avgAss,midTerm,finalExam);
	
	sc.close();
	
}
}