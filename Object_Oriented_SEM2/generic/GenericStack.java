package generic;
import java.util.*;
/*
 * 	(Implement GenericStack using inheritance) In lecture notes, GenericStack and ArrayList are implemented using composition. Define a new GenericStack class that extends ArrayList. Draw the UML diagram for the classes then implement GenericStack. Write a test program that prompts the user to enter five strings and displays them in reverse order
 */
public class GenericStack <E> extends ArrayList<E> {
	private ArrayList<E> list = new ArrayList<E>();
		GenericStack(){
			
		}
		
		public int getSize() {
			return list.size();
		}
		
		public E peek() {
			return list.get(this.getSize()-1);
		}
		
		public E pop() {
			E last = list.get(-1);
			last.remove(last);
			return last;
		}
		
		public void push(E ele) {
			list.add(ele);
		}
		
		public boolean isEmpty() {
			return list.isEmpty();
		}
		
		public String toString() {
			String result="";
			for (int i=0; i<list.size(); i++) 
				result += (list.get(i)+", ");
			return result;
		}
}

