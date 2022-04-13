// week 4 question 3
//CHEW ZI QING 212360
package week4;
//inherits class Person
public class Employee extends Person {
	//private data fields
	private String employeeNum;
	private double basicSalary;
	
	Employee(){
		//no-args constructor
	}
	
	//accessor of private data fields
	public String getEmployeeNum() {
		return this.employeeNum;
	}
	
	public double getBasicSalary() {
		return this.basicSalary;
	}
	//setter of private data fields
	public void setEmployeeNum(String employeeNum) {
		this.employeeNum = employeeNum;
	}
	
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	
	//overriding toString()
	public String toString() {
		return this.getName()+"(employee number "+this.getEmployeeNum()+") has a salary of "+this.getBasicSalary();
	}

}
