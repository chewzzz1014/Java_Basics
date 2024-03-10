package com.example.sem2.Object_Oriented_SEM2.code;
import java.util.*;
// improved version of Course class
public class Course_Improved {

	private List<Student> students = new ArrayList<>();
	private String courseName;
	private int numStudents;
	
	Course_Improved(String courseName, Student[]studentsArr){
		this.setCourseName(courseName);
		this.students = Arrays.asList(studentsArr);
	}
	
	Course_Improved(String courseName, ArrayList<Student> students){
		this.setCourseName(courseName);
		this.students = students;
	}
	
	public void setCourseName(String courseName){
		this.courseName = courseName;
	}
	
	public String getCourseName() {
		return this.courseName;
	}
	
	public int getNumStudents() {
		return this.numStudents;
	}
	
	public void addStudent(Student student) {
		this.students.add(student);
		this.numStudents++;
	}
	
	public void addStudent(int idx, Student student) {
		this.students.add(idx, student);
		this.numStudents++;
	}
	
	public void deleteStudent(Student student) {
		students.remove(student);
		this.numStudents--;
	}
	
	public void deleteStudent(int idx) {
		students.remove(idx);
		this.numStudents--;
	}
	
	public List<Student> getAllStudents() {
		return this.students;
	}
	
	public Student getStudent(int idx) {
		return students.get(idx);
	}
}
