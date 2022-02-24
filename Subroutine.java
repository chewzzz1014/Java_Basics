//introductory practices on nested loop and subroutine part 1



import java.util.Scanner;

public class Subroutine {
	
	
public static char getNationality (Scanner sc, int count)
{
	//request for nationality
			System.out.printf("\n\n*******Visitor %1d ******",count);
			System.out.print("\nEnter your nationality: ");
			char nationality=sc.next().toUpperCase().charAt(0);
			return nationality;
}

public static char getCategory (Scanner sc)
{
	System.out.print("\nChoose category of visitor (A- Adult, C - Children, S - senior): ");
	char visitorCategory=sc.next().toUpperCase().charAt(0); 
	return visitorCategory;
}

public static char getForeignPart (Scanner sc)
{
	System.out.print("\nFrom which part? (I- Kad/Working Permit/Dependent Pass,  E- Asean, O - Others): ");
	char foreignPart=sc.next().toUpperCase().charAt(0);
	return foreignPart;
}

public static int getNumTickets (Scanner sc)
{
	System.out.print("\nNumber of tickets: ");
    int numTickets=sc.nextInt();
    return numTickets;
}

public static double calcPriceLocal (char visitorCategory, int numTickets)
{
	//determine fee
	double  fee;
    switch (visitorCategory)
    {
    	case 'A': fee=43*numTickets; break;
    	case 'C': fee=16*numTickets; break;
    	case 'S': fee=21*numTickets; break;
    	default: fee=0; break;
    }
    return fee;
}

public static double calcPriceForeign (char visitorCategory, int numTickets, char foreignPart)
{
	//determine fee
	double fee=0;
	switch (foreignPart)
	    {
	    case 'I': 
	    	switch (visitorCategory)
	    	{
	    	case 'A': fee=50*numTickets; break;
	    	case 'C': fee=25*numTickets; break;
	    	case 'S': fee=50*numTickets; break;
	    	default: fee=0; break;
	    	}
	    case 'E': 
	    	switch (visitorCategory)
	    	{
	    	case 'A': fee=61*numTickets; break;
	    	case 'C': fee=33*numTickets; break;
	    	case 'S': fee=61*numTickets; break;
	    	default: fee=0; break;
	    	}

	    case 'O': 
	    	switch (visitorCategory)
	    	{
	    	case 'A': fee=82*numTickets; break;
	    	case 'C': fee=43*numTickets; break;
	    	case 'S': fee=82*numTickets; break;
	    	default: fee=0; break;
	    	}
	    }
	    return fee;
}



public static void main (String[]args)
{
	//create Scanner object
	Scanner sc=new Scanner (System.in);
	
	//initialize variables
	boolean moreTickets=true, moreVisitors=true;
	double fee=0,totalFee;
	char nationality,visitorCategory,foreignPart,inputMoreTickets,inputMoreVisitors;
	int count=1,numTickets;
	
	//using while loop to accept multiple visitors
	while (moreVisitors)
	{
		totalFee=0;
		moreTickets=true;
		nationality = getNationality(sc,count);
		
		//using while loop to accept multiple tickets per visitor
		while(moreTickets)
		{
			//if visitor is local
			if (nationality=='M') 
			{
				visitorCategory= getCategory (sc);
			    numTickets= getNumTickets(sc);
			    fee=calcPriceLocal(visitorCategory, numTickets);
			    System.out.printf("\nVisitor Type %1c Charge %.2f", visitorCategory,fee);
			    totalFee+=fee;
				
			}
			
			//if visitor is foreigner
			else if (nationality=='F')
			{
			foreignPart= getForeignPart (sc);
			visitorCategory= getCategory (sc);
			numTickets= getNumTickets(sc);
			System.out.printf("\nVisitor Type %1c Charge %.2f", visitorCategory,fee);
		    totalFee+=fee;
		    }
			System.out.print("\n\nBuy other tickets (Y/N)?: ");
			inputMoreTickets=sc.next().toUpperCase().charAt(0);
			if (inputMoreTickets=='N')
			    	moreTickets=false;
			}
		System.out.printf("\nThe Total Payment for VISITOR %1d is %.2f.\n\n", count,totalFee);
		count++;
		System.out.print("\nEnter another visitor (Y/N)?: ");
		inputMoreVisitors=sc.next().toUpperCase().charAt(0);
		if (inputMoreVisitors=='N')
		    	moreVisitors=false;		
		}
		
	sc.close();
}
}
