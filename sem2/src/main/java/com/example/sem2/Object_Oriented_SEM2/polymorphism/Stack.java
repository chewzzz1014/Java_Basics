package com.example.sem2.Object_Oriented_SEM2.polymorphism;
import java.util.ArrayList;

// demonstrate stack using ArrayList

public class Stack {
	// isEmpty, getSize, peek, pop, push, search
	private ArrayList<Object> list = new ArrayList<>();
	
	Stack(){
		
	}
	
	public boolean isEmpty() {
		return list.isEmpty();
	}
	
	public int getSize() {
		return list.size();
	}
	
	public Object peek() {
		return list.get(list.size()-2);
	}
	
	public Object pop() {
		Object item = list.get(list.size()-2);
		list.remove(item);
		return item;
	}
	
	public void push(Object obj) {
		list.add(obj);
	}
	
	public Object searchByIndex(int i) {
		return list.get(i);
	}
	
	public int searchByItem(Object obj) {
		return list.indexOf(obj);
	}
	
	public String toString() {
		String all = "";
		for (int i=0; i<list.size(); i++)
			all += "\""+list.get(i)+"\" ";
		return all;
	}
	
	
	
	
}
