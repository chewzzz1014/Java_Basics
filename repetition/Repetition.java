//introductory practices on loop part 1
//basic arithmetic


import java.util.Scanner;

public class Repetition {
public static void main (String[]args)
{
	int quantity=0,count=0;
	char productNum=1;
	double price,totalPrice=0;
	
	Scanner sc=new Scanner (System.in);
	System.out.println("ENTER 0 TO STOP");
	System.out.print("***********Products Available***************");
	System.out.print("\n\t\tProduct 1-RM2.98");
	System.out.print("\n\t\tProduct 2-RM4.50");
	System.out.print("\n\t\tProduct 3-RM9.98");
	System.out.print("\n\t\tProduct 4-RM4.49");
	System.out.print("\n\t\tProduct 5-RM6.87");
	System.out.print("\n******************************************\n");
	
	
		System.out.print("\nEnter Product Number: " );
		productNum=sc.next().charAt(0);
		
		
	    while (productNum!='0')
	    {
	    if (productNum=='1' || productNum=='2'|| productNum=='3'|| productNum=='4'|| productNum=='5')
	    	{System.out.print("\nEnter Quantity: " );
	    	quantity=sc.nextInt(); }
	    
	    else
	    	break;
	    
		switch (productNum)
		{
		case '1': price=2.98*quantity; break;
		case '2': price=4.50*quantity; break;
		case '3': price=9.98*quantity; break;
		case '4': price=4.49*quantity; break;
		case '5': price=6.87*quantity; break;
		default: price=0; System.out.print("\nInvalid Product Number!"); break;
		}
		
        System.out.printf("\nPrice: RM%.2f", price);
        System.out.print("\n**********************");
		totalPrice+=price;
		System.out.print("\nEnter Product Number: ");
		productNum=sc.next().charAt(0);
		count++;
		
	}
	    
	
	System.out.printf("\nTotal Price: RM%.2f", totalPrice);
	sc.close();
	
}
}
