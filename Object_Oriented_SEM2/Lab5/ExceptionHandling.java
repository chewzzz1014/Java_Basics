package Lab5;
import java.util.*;

public class ExceptionHandling {
	public static void main (String[]args) {
		
		Scanner sc = new Scanner (System.in);
		int n1, n2;
		double div;
		
		System.out.print("Enter Number 1: ");
		n1 = sc.nextInt();
		
		System.out.print("\nEnter Number 2: ");
		n2 = sc.nextInt();
		System.out.println();
		
		try {
			div = n1 / n2;
			divisionLessThan2(div);
			divisionMoreThan2(div);
		}
		catch(NumberFormatException ex) {
			System.out.print("\n"+ex);
		}
		catch(MoreThanTwoException ex) {
			System.out.print("\n"+ex);
		}
		catch(InputMismatchException ex) {
			 System.out.println("\nInputMismatchException: An integer is required.");
			 sc.nextLine(); // discard input 
		}
		catch(ArithmeticException ex) {
			System.out.print("\nArithmeticException: Not Allowed to Divide by 0");
		}
		finally {
			System.out.print("\nRerun The Program !");
		}
		
		
	}
	
	public static void divisionLessThan2 (double div) throws NumberFormatException {
		if (div <2.0)
			throw new NumberFormatException(div);
	}
	
	public static void divisionMoreThan2 (double div) throws MoreThanTwoException {
		if (div > 2.0)
			throw new MoreThanTwoException(div);
	}
}
