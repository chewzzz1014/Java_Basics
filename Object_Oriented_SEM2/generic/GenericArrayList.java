package generic;
import java.util.*;

/*
 * 2.	(Distinct elements in ArrayList) Write the following method that returns a new ArrayList. The new list contains the non-duplicate elements from the original list. Implements the test program.

public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list)
 
 */
public class GenericArrayList<E>{
	
	public static void main (String[]args) {
		String[] strArr = {};
		ArrayList<String> str = new ArrayList<>(Arrays.asList(strArr));
	}
	
	public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
		Set<E> set = new HashSet<>(list);
		list.clear();
		list.addAll(set);
		return list;
	}
	
}
