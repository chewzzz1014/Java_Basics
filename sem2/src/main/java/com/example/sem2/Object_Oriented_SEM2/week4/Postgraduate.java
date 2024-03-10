// Week 4 Question 1
// CHEW ZI QING 212360
package com.example.sem2.Object_Oriented_SEM2.week4;

public class Postgraduate extends Student{

	private String thesisTitle;
	Postgraduate(){
		// the no-args constructor of super class, Student will be called automatically
	}
	
	Postgraduate(String thesisTitle){
		// the no-args constructor of super class, Student will be called automatically
		this.thesisTitle = thesisTitle;
	}
	
	//accessor of private data field
	public String getThesisTitle() {
		return this.thesisTitle;
	}
	
	//setter of private data field
	public void setThesisTitle(String thesisTitle) {
		this.thesisTitle = thesisTitle;
	}
	
	// overriding method of super class's toString()
	public String toString() {
	 return "Postgraduate "+super.toString()+"\nThesis: "+this.getThesisTitle();
	}
}
