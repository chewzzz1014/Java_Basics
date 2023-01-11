package polymorphism;

public class TestStack {
	public static void main (String[]args) {
		Stack myStack = new Stack();
		
		myStack.push("Tokyo");
		myStack.push("London");
		myStack.push("New York");
		myStack.push("Dubai");
		
		System.out.println("Is myStack empty: "+myStack.isEmpty());
		
		System.out.println("myStack size: "+myStack.getSize());
		
		System.out.println("Peek: "+myStack.peek());
		
		System.out.println("Popped Item: "+myStack.pop());
		
		System.out.println("myStack size: "+myStack.getSize());
		
		System.out.println("Searched element in index 2: "+myStack.searchByIndex(2));
		
		System.out.println("The location of \"London\": "+myStack.searchByItem("London"));
		
		System.out.println("myStack: "+myStack.toString());
		
		myStack.push(2);
		myStack.push(23);
		myStack.push(0);
		myStack.push(true);
		myStack.push('&');
		
		System.out.println("myStack after added non-string elements: "+myStack.toString());
	}
}
