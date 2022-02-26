//introductory practices on subroutine part 8



import java.util.*;

public class Subroutine7 {
	
public static void askInput (int states, int[][]cases,String[] statesName, int[]totalCases, Scanner sc)
{

	for (int i=0;i<states;i++)
	{
		sc.nextLine();
		System.out.print("State ["+(i+1)+"]: ");
		statesName[i] = sc.nextLine();
		//sc.nextLine();
		
		System.out.print("\nNumber of cases a week: ");
		
		for (int j=0;j<7;j++)
			{
			cases[i][j] = sc.nextInt();
			totalCases[i] += cases[i][j];
			}
		System.out.print("\n\n");
		//sc.nextLine();
	}
}

public static void printLineGraph(double total, String[]statesName, int []totalCases)
{
	double percentage=0;
	for (int i=0;i<statesName.length;i++)
	{
		percentage = (totalCases[i]/total)*100.00;
		System.out.printf("%-15s\t\t",statesName[i]);
		for (int j=0;j<totalCases[i];j++)
			System.out.print("*");
		System.out.printf("%.2f ",percentage);
		System.out.println("%");
	}
}

public static double printStatesData (int[][]cases, String[]statesName, int[]totalCases)
{
    System.out.print("\n-----------------------------------------COVID 19 IN A WEEK------------------------------------\n");
	
	System.out.print("Disease\\Day\t\tMon\tTue\tWed\tThu\tFri\tSat\tSun\tTotal\n");
	double total=0;
	for (int i=0;i<statesName.length;i++)
	{	System.out.printf("%-15s\t\t%1d\t%1d\t%1d\t%1d\t%1d\t%1d\t%1d\t%1d\n",statesName[i],cases[i][0],cases[i][1],cases[i][2],cases[i][3],cases[i][4],cases[i][5],cases[i][6],totalCases[i]);
	    total= total + totalCases[i];
	}
	System.out.print("Overall Total\t\t\t\t\t\t\t\t\t"+(int)total+"\n");
	System.out.println();
	return total;
}
	

public static void main (String[]args)
{
	Scanner sc = new Scanner (System.in);
	System.out.print("How many states' data would you provide? ");
	int states = sc.nextInt();
	System.out.print("\n\n");
	//arrays
	int [][]cases = new int [states][7];
	String[] statesName = new String[states];
	int[] totalCases = new int [states];
	
	//assign values to array in method
    askInput(states,cases,statesName,totalCases,sc);
	
	
	double total = printStatesData(cases,statesName,totalCases);
	printLineGraph(total,statesName,totalCases);
	sc.close();
}
}
