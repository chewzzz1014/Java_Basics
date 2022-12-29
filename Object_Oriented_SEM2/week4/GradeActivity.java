// Week 4 Question 2
// CHEW ZI QING 212360
package week4;

public class GradeActivity {
	//private data fields
	private double score;
	private char grade;
	
	GradeActivity(){
	//no-args constructor that did nothing. Declared to avoid error when another class inherits this class	
	}
	
	//accessor of private data field so that this class's subclass can access private data fields as well
	public double getScore() {
		return this.score;
	}
	
	public char getGrade() {
		return grade;
	}
	
	//setter of private data field so that this class's subclass can modify private data fields as well
	public void setScore(double score) {
		this.score = score;
	}
	
	public void setGrade() {
		
		char grade;
		if (this.score>100 || this.score<0)
			grade = 'N';		//invalid score and grade
		else if (this.score>=90)
			grade = 'A';
		else if (this.score>=80)
			grade = 'B';
		else if (this.score>=70)
			grade = 'C';
		else if (this.score>=60)
			grade = 'D';
		else
			grade = 'F';
		this.grade = grade;	
	}
	
	//return data fields in a string
	public String toString() {
		return "Score: "+this.getScore()+"\nGrade: "+this.getGrade()+"\n";
	}
	
}
