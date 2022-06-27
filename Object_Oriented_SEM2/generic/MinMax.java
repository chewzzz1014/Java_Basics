package generic;
import java.util.*;
/*
 * 3.	 (Maximum and minimum element in an array) Implement the following methods that returns the maximum and minimum element in an array. Program will request user to input at least 10 integer values as element of the array.

public static <E extends Comparable<E>> E Max(E[] list)
public static <E extends Comparable<E>> E Min(E[] list)

 */
public class MinMax  {
	public static void main (String[]args) {
		
		boolean toCont = false;
		Scanner sc = new Scanner(System.in);
		
		do {
			Integer[] nums = new Integer[10];
			try {
				System.out.print("Enter 10 integers.\n");
				for(int i=0;i<10;i++) {
					System.out.printf("\n#%1d: ",(i+1));
					nums[i] = sc.nextInt();
				}
				
				System.out.printf("\n\nArray: %1s\nMaximum Value in Array: %1d\nMinimum Value in Array: %1d", Arrays.toString(nums), Max(nums), Min(nums));
				System.out.print("\n\nDo you want to continue? (y/n) ");
				if ((sc.next().toUpperCase().charAt(0))=='Y')
					toCont = true;
				else
					toCont = false;
				
			} catch (InputMismatchException E) {
				System.out.println("Invalid Input Type! Rerun The Program.");
				System.exit(0);
			}
		} while(toCont);
		
		sc.close();
	}
	
	public static <E extends Comparable<E>> E Max(E[] list) {
		E max = list[0];
		for (int i=1; i<list.length; i++) 
			if (list[i].compareTo(max) > 0)
				max = list[i];
		return max;
	}
	
	public static <E extends Comparable<E>> E Min (E[]list) {
		E min = list[0];
		for (int i=1; i<list.length; i++) 
			if (list[i].compareTo(min) < 0)
				min = list[i];
		return min;
	}
}
