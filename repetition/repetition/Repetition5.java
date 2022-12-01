package repetition;

//introductory practices on loop part 6



public class Repetition5 {
public static void main (String[]args)
{
	//prompt user to enter 100 random integer
	System.out.println("10 random numbers : ");
	
	//read 5 random integers from the user using while loop
	int count=0,num;
	while (count<5)
	{
		num=(int)(Math.random()*100);
		System.out.printf("%1d \n", num);
		count++;
	}
	System.out.print("\n");
	//read 5 random integers from the user using for loop
	for (int c=0;c<5;c++)
	{
		num=(int)(Math.random()*100);
		System.out.printf("%1d \n", num);
	}
}
}

