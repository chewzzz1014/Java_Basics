package generic;
import java.util.*;

// GenericStack that accept any type (class)
public class GenericStack <E> extends ArrayList<E> {
	private String type;
	private ArrayList<E> list = new ArrayList<E>();
	
		// no-args constructor
		GenericStack(){
			
		}
		// to specify the data type (or class) of values it stored
		GenericStack(String type){
			this.type = type;
		}
		// getter
		public String getType() {
			return this.type;
		}
		
		public int getSize() {
			return list.size();
		}
		// return the stack
		public GenericStack<E> getStack(){
			return this;
		}
		// look at the last element
		public E peek() {
			return list.get(this.getSize()-1);
		}
		// eliminate last element and return it
		public E pop() {
			E last = list.get(list.size()-1);
			list.remove(last);
			return last;
		}
		// add element to the end of stack
		public void push(E ele) {
			list.add(ele);
		}
		
		public boolean isEmpty() {
			return list.isEmpty();
		}
		// return the String representation of GenericStack
		public String toString() {
			String result="";
			for (int i=0; i<list.size(); i++) 
				result += (list.get(i)+", ");
			return result;
		}
		// reverse the GenericStack
		public GenericStack<E>getReverseStack (GenericStack<E> stack){
		GenericStack<E> rStack = new GenericStack<>();
		while(!stack.isEmpty())
			rStack.push(stack.pop());
		return rStack;
		}
		
		// properties of GenericStack
		public void printProperties() {
			System.out.printf("******************\n\nStack Type: %1s\nIs Stack Empty?: %1b\nStack Size: %1d\nStack Content: %1s\nReversed Stack Content: %1s\n\n", 
			this.getType(), this.isEmpty(), this.getSize(), this.toString(), this.getReverseStack(this.getStack()));
		}
}

