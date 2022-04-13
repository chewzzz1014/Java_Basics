package week4;

public class GradeActivity {
	
	private double score;
	private char grade;
	
	GradeActivity(){
		
	}
	
	public double getScore() {
		return this.score;
	}
	
	public char getGrade() {
		return grade;
	}
	
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
	
	public String toString() {
		return "Score: "+this.getScore()+"\nGrade: "+this.getGrade()+"\n";
	}
	
}
