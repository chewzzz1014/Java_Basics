package Lab5;

public class NumberFormatException extends Exception {
	 private double division;
	 
	public NumberFormatException(double division) {
		super("Result of division should not less than 2.\n"+"Division Result: "+division);
		this.division = division;
	}
	
	public double getDivision() {
		return this.division;
	}
}
