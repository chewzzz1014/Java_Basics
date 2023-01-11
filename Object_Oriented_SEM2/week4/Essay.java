// Week 4 Question 2
// CHEW ZI QING 212360
package week4;

public class Essay extends GradeActivity{
	//private data fields
	private double grammar, spelling, correctLength, content, totalScore;
	
	Essay(){
	//the no-args constructor of super class, GradeActivity will be called automatically
	}
	
	//accessor of private data fields
	public double getGrammar() {
		return this.grammar;
	}
	
	public double getSpelling() {
		return this.spelling;
	}
	
	public double getCorrectLength() {
		return this.correctLength;
	}
	
	public double getContent() {
		return this.content;
	}
	
	public double getTotalScore() {
		return this.totalScore;
	}
	
	//setter of private data fields
	public void setGrammar(double grammar) {
		this.grammar = grammar;
	}
	
	public void setSpelling(double spelling) {
		this.spelling = spelling;
	}
	
	public void setCorrectLength(double correctLength) {
		this.correctLength = correctLength;
	}
	
	public void setContent(double content) {
		this.content = content;
	}
	
	public void calcTotalScore() {
		this.totalScore = this.getGrammar() + this.getSpelling() + this.getCorrectLength() + this.getContent();
	}
	
	//return all the data fields in one string
	//overriding method of super class's toString() 
	public String toString() {
		String out = "Grammar Score (30 Points): "+this.getGrammar()+"\nSpelling Score (20 Points): "+this.getSpelling()+"\nCorrect Length Score (20 Points): "+this.getCorrectLength()+"\nContent Score (30 Points): "+this.getContent()+"\n"+super.toString();	
		//also calls super class's toString() method
		return out;
	}
	
	//run tasks sequentially to prevent skipping any process
	public void doAllTasks() {
		this.calcTotalScore();
		// using super class's setter methods
		super.setScore(this.getTotalScore());	
		super.setGrade();
	}
}
