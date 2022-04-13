// Week 4 Question 1
// CHEW ZI QING 212360
package week4;

public class TestEssay {
	public static void main (String[]args) {
		//object of class essay
		Essay e1 = new Essay ();
		//set the score for each aspect of essay
		e1.setGrammar(24);
		e1.setSpelling(16);
		e1.setCorrectLength(14);
		e1.setContent(25);
		e1.doAllTasks();
		//print the instance data fields of this object
		System.out.println(e1.toString());
		
		Essay e2 = new Essay ();
		e2.setGrammar(30);
		e2.setSpelling(19);
		e2.setCorrectLength(18);
		e2.setContent(29);
		e2.doAllTasks();
		System.out.println(e2.toString());

		
	}
	
	
	
}
