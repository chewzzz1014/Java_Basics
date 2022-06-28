package generic;
import java.util.*;

public class TestGenericStack {
	public static void main (String[]args) {
		
		// Scanner object
		Scanner sc = new Scanner (System.in);
		// generic stack that stores String elements
		GenericStack<String> stack = new GenericStack<>("String");
		
		System.out.println("*****Enter 5 string*****");
		for (int i=0; i<5; i++) {
			System.out.printf("\n#%1d: ", (i+1));
			stack.push(sc.next());
			sc.next();
		}
		stack.printProperties();
		
	}
}
