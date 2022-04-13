package week4;

public class Essay extends GradeActivity{
	
	private double grammar, spelling, correctLength, content, totalScore;
	
	Essay(){
		
	}
	
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
	
	public String toString() {
		String out = "Grammar Score (30 Points): "+this.getGrammar()+"\nSpelling Score (20 Points): "+this.getSpelling()+"\nCorrect Length Score (20 Points): "+this.getCorrectLength()+"\nContent Score (30 Points): "+this.getContent()+"\n"+super.toString();
		return out;
	}
	
	public void doAllTasks() {
		this.calcTotalScore();
		super.setScore(this.getTotalScore());
		super.setGrade();
	}
}
