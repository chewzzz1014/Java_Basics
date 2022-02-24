//introductory practices on loop part 11

package myExercises;

public class Repetition10 {
public static void main (String[]args)
{
	//using while loop
	int num=1;
	System.out.print("Print odd numbers from 1 to 10 using while loop.\n");
	while (num<10)
	{
		System.out.println(num);
		num+=2;
	}
	
	//using do-while loop
	System.out.print("Print odd numbers from 1 to 10 using while loop.\n");
	num=1;
	do
	{
		System.out.println(num);
		num+=2;
	}while (num<10);
	
	//using for loop
	System.out.print("Print odd numbers from 1 to 10 using for loop.\n");
	for (int c=1;c<10;c+=2)
		System.out.println(c);
}
}
