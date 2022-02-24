//introductory practices on selection statement part 7
//basic arithmetic



import java.util.Scanner;

public class Selection6 {
 public static void main (String[]args)
 {
	 Scanner sc=new Scanner (System.in);
	 
	 //information
	 System.out.println("***************WELCOME TO UPM****************");
	 System.out.println("\nMater Programmes Available");
	 System.out.println("Master of Computer Science (MCS)");
	 System.out.println("Master of Environment (ME)");
	 System.out.println("Master of Plantation Management (MPM)");
	 System.out.println("Master of Environmental and Occupational Health (MEOH)");
	 System.out.println("\n************TUITION FEES CALCULATOR**********");
	 
	 //request input
	 System.out.print("\nEnter Programme Code: ");
	 String code=sc.next();
	 System.out.print("\nEnter Number of Semester: ");
	 int numSem=sc.nextInt();
	 System.out.print("\nEnter Credit Hours: ");
	 int crHours=sc.nextInt();
	 double fees=0;
	 
	 //determine fees using switch
	 switch (code)
	 {
	  case "MCS": 
		  if (numSem==1)
			  fees=1250+(crHours*250);
		  else
			  fees=1000+(crHours*250);
		  break;
	  
	  case "ME":
		  if (numSem==1)
			  fees=1400+(crHours*250);
		  else
			  fees=1100+(crHours*250);
		  break; 
		  
	  case "MPM":
	      if (numSem==1)
		    fees=1250+(crHours*275);
	      else
		  fees=1000+(crHours*275);
	  break;
	  
	  case "MEOH":
		  if (numSem==1)
			  fees=1250+(crHours*350);
		  else
			  fees=1000+(crHours*350);
		  break;
	 }
	 
	 System.out.printf("\nTuition Fees: RM %.2f\n",fees);
	 System.out.println("\n*******************THANK YOU!****************");
	 
	 sc.close();
 }
}

