//introductory operations on 1D array
//find max and count number of occurence of max

package myExercises;
import java.util.*;

public class Array1 {
	
public static void getArray (int[]array,Scanner sc)
{
	for (int i=0;i<array.length;i++)
		{
		System.out.print("Enter number "+(i+1)+": ");
		array[i]=sc.nextInt();
		}
}

public static int getMax (int[]array)
{
	int max=array[0];
	for (int num:array)
		if (num>max)
			max=num;
	return max;
}

public static int countMax (int[]array, int max)
{
	int count=0;
	for (int num:array)
		if (num==max)
			count++;
	return count;
}

public static void main (String[]args)
{
	Scanner sc = new Scanner (System.in);
	int[] num = new int [6];
	boolean toCont=true;
	Character getToCont;
	
	while (toCont)
	{
		System.out.println("\n*********************************************");
		getArray(num,sc);
		int max = getMax(num);
		int countMax = countMax(num,max);
		System.out.printf("\nMaximum number is %1d and it appears %1d times in your array.", max,countMax);
		System.out.print("\nDo you wish to continue?(y/n) ");
		getToCont=sc.next().toUpperCase().charAt(0);
		if (getToCont=='N')
			{toCont=false;
			System.out.println("\n******************THANKS!************************");
			}
	}
	sc.close();
}
}
