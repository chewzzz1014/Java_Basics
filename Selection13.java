//introductory practices on selection statement part 14
//basic arithmetic

package myExercises;
import java.util.Scanner;

public class Selection13 {
 public static void main (String[]args)
 {
	 //create Scanner object
	 Scanner sc=new Scanner (System.in);
	 
	 //define constant
	 final double GTAX=0.06;
	 final double SERVCHARGE=0.1;
	 
	 //requst input
	 System.out.print("Item 1: ");
	 String name1=sc.nextLine();
	 System.out.print("\nQuantity: ");
	 int quantity1=sc.nextInt();
	 System.out.print("\nUnit Price: ");
	 double unitPrice1=sc.nextDouble();
	 System.out.print("\nItem 2: ");
	 String name2=sc.next();
	 System.out.print("\nQuantity: ");
	 int quantity2=sc.nextInt();
	 System.out.print("\nUnit Price: ");
	 double unitPrice2=sc.nextDouble();
	 
	 //display item 1 and item 2
	 double amount1=quantity1*unitPrice1;
	 double amount2=quantity2*unitPrice2; 
	 System.out.printf("\n\nItem 1: %1s\nQuantity: %1d\nUnit Price: RM %.2f\nAmount: RM%.2f\n",name1,quantity1,unitPrice1,amount1);
	 System.out.print("\n***************************************");

	 System.out.printf("\n\nItem 2: %1s\nQuantity: %1d\nUnit Price: RM %.2f\nAmount: RM%.2f\n",name2,quantity2,unitPrice2,amount2);
	 System.out.print("\n***************************************");
	 
	 //calculate subtotal and total
	 double subTotal=amount1+amount2;
	 double governmentTax=subTotal*GTAX;
	 double serviceCharge=subTotal*SERVCHARGE;
	 double total=subTotal+governmentTax+serviceCharge; //subTotal governmentTax serviceCharge
	 System.out.printf("\n\nSubtotal: RM%.2f\nGovernment Tax: RM%.2f\nService Charge: RM%.2f",subTotal,governmentTax,serviceCharge,serviceCharge);
	 System.out.print("\n\nTotal: RM"+total);
	 
	 //determine price after discount
	 double price;
	 if (total>50)
		price=total*0.8;
	 else
	    price =total;
	 System.out.print("\n*If total > RM50, you will get 20% discount.");
	 System.out.print("\nPrice after discount is RM "+price);
	 sc.close();
 }
}
