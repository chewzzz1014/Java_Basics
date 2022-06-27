package generic;
import java.util.*;

public class GenericArrayList<E>{
	
	public static void main (String[]args) {
		String[] strArr = {"NO", "NO", "MAYBE", "UNDEFINED","YES", "OBEDIENT", "MAYBE", "YES"};
		// convert array to generic ArrayList
		ArrayList<String> str = new ArrayList<>(Arrays.asList(strArr));
		// display the ori ArrayList and ArrayList after duplicates removal
		printResult(str);
	}
	
	// generic method that accepts generic ArrayList
	// removed duplicated elements in ArrayList
	public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
		// HashSet only takes unique element. 
		//Order of elements may change (let's assume that order doesn't matter in this case)
		Set<E> set = new HashSet<>(list);
		list.clear();
		list.addAll(set);
		return list;
	}
	
	// generic method that accepts generic ArrayList
	public static <E> void printResult(ArrayList<E>list) {
		System.out.printf("Original ArrayList: %1s\nArrayList without Duplicated Elements: %1s", list.toString(), (removeDuplicates(list).toString()));
	}
	
}
