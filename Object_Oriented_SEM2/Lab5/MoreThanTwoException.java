package Lab5;

public class MoreThanTwoException extends Exception {
	 private double division;
	 
	public MoreThanTwoException(double division) {
		super("Result of division should not greater than 2.\n"+"Division Result: "+division);
		this.division = division;
	}
	
	public double getDivision() {
		return this.division;
	}
}

