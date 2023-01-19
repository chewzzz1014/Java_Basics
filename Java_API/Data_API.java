import java.util.Date;

public class Data_API {
	public static void main (String[]args) {
		
		Date now = new Date();
		Date initial = new Date (0); // 0 milliseconds from 1970, Jan 1 GMT
		
		// in local time zone
		System.out.printf("Current Time: %1s\n", now.toString());
		System.out.printf("Initial Time: %1s\n", initial.toString());
		
		System.out.printf("Current Time (timestamp): %1d\n", now.getTime() );
		System.out.printf("Initial Time (timestamp): %1s\n", initial.getTime());//0
		
		// is current time after 1970, Jan 01 ?
		System.out.printf("Current Time after Intial?  %1b\n", now.after(initial) ); //true
		// is current time before 1970, Jan 01 ?
		System.out.printf("Current Time before Intial?  %1b\n", now.before(initial) ); //false
		
		// compare 2 Date. Let'say we compare by Date1.compareTo(Date2)
		//Return 0 if equals; -ve value if Date 1 before Date2 and +ve values if vice versa
		System.out.printf("Compare current and intial Date: %1d\n", now.compareTo(initial) );	// +ve value. now is after initial
	}
}
