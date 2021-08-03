package com.skp.lamda.basics;

public class Student {
	
	private String name;
	private int grade;
	private double gpa;
	private boolean result;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public boolean isResult() {
		return result;
	}
	public void setResult(boolean result) {
		this.result = result;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", grade=" + grade + ", gpa=" + gpa + ", result=" + result + "]";
	}
	public Student(String name, int grade, double gpa, boolean result) {
		super();
		this.name = name;
		this.grade = grade;
		this.gpa = gpa;
		this.result = result;
	}
	
}
