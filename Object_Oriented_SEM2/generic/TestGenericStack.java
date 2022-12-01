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
			stack.push(sc.nextLine());
			//sc.nextLine();
		}
		// trying to peek and push
		System.out.printf("\n\nCurrent Last Element in GenericStack: %1s\nRemoving Last Element [%1s]...\nAdding \"Queen\" to GenericStack...\n", stack.peek(), stack.pop());
		stack.push("Queen");
		System.out.printf("Current Last Element in GenericStack: %1s\n", stack.peek());

		// print all the properties of GenericStack
		stack.printProperties();
		sc.close();
	}
}
