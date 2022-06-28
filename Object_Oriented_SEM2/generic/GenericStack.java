package generic;
import java.util.*;
/*
 * 	(Implement GenericStack using inheritance) In lecture notes, GenericStack and ArrayList are implemented using composition. Define a new GenericStack class that extends ArrayList. Draw the UML diagram for the classes then implement GenericStack. Write a test program that prompts the user to enter five strings and displays them in reverse order
 */
public class GenericStack <E> extends ArrayList<E> {
	private String type;
	private ArrayList<E> list = new ArrayList<E>();
	
		// no-args constructor
		GenericStack(){
			
		}
		GenericStack(String type){
			this.type = type;
		}
		
		public String getType() {
			return this.type;
		}
		
		public int getSize() {
			return list.size();
		}
		
		public GenericStack<E> getStack(){
			return this;
		}
		
		public E peek() {
			return list.get(this.getSize()-1);
		}
		
		public E pop() {
			E last = list.get(list.size()-1);
			list.remove(last);
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
		
		public GenericStack<E>getReverseStack (GenericStack<E> stack){
		GenericStack<E> rStack = new GenericStack<>();
		while(!stack.isEmpty())
			rStack.push(stack.pop());
		return rStack;
		}
		
		// properties of GenericStack
		public void printProperties() {
			System.out.printf("******************\nStack Type: %1s\nIs Stack Empty?: %1b\nStack Size: %1d\nStack Content: %1s\nReversed Stack Content: %1s\n\n", this.getType(), this.isEmpty(), this.getSize(), this.toString(), this.getReverseStack(this.getStack()));
		}
}

