// Week 4 Question 1
// CHEW ZI QING 212360
package week4;

public class Undergraduate extends Student{
	private String classification;
	
	Undergraduate(){
		// the no-args constructor of super class, Student will be called automatically
	}
	
	Undergraduate(String classification){
		// the no-args constructor of super class, Student will be called automatically
		this.classification = classification;
	}
	
	//accessor of private data field
	public String getClassification() {
		return this.classification;
	}
	
	//setter of private data field
	public void setClassification(String classification) {
		this.classification = classification;
	}
	
	// overriding method of modified super class's toString()
	public String toString() {
		return "Undergraduate "+super.toString()+"\nClassification: "+this.getClassification();
	}
}
