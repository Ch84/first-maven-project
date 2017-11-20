package com.classes;

import java.text.DecimalFormat;

public class Student extends Person {
	private double firstGrade;
	private double secondGrade;
	private double thirdGrade;
	private double averageGrade;
	
	
	
	public Student(String firstName, String lastName, int age, char gender) {
		super(firstName, lastName, age, gender);
		
	}
	public Student(String firstName, String lastName, int age, char gender, double firstGrade, double secondGrade,
			double thirdGrade, double averageGrade) {
		super(firstName, lastName, age, gender);
		this.firstGrade = firstGrade;
		this.secondGrade = secondGrade;
		this.thirdGrade = thirdGrade;
		this.averageGrade = averageGrade;
	}


	public double getFirstGrade() {
		return firstGrade;
	}
	public void setFirstGrade(double firstGrade) {
		this.firstGrade = firstGrade;
	}
	public double getSecondGrade() {
		return secondGrade;
	}
	public void setSecondGrade(double secondGrade) {
		this.secondGrade = secondGrade;
	}
	public double getThirdGrade() {
		return thirdGrade;
	}
	public void setThirdGrade(double thirdGrade) {
		this.thirdGrade = thirdGrade;
	}
	public double getAverageGrade() {
		return averageGrade;
	}
	public void setAverageGrade(double averageGrade) {
		this.averageGrade = averageGrade;
	}
	public double calculateAverageGrade() {
		
		double averageGrade = (firstGrade + secondGrade + thirdGrade)/3;
		
		this.setAverageGrade(averageGrade);
		
		return averageGrade;
	}
	double calculateAverage(double firstGrade, double secondGrade, double thirdGrade) {
		
		averageGrade = (firstGrade + secondGrade + thirdGrade)/3;
		
		return averageGrade;
		
	}
	boolean hasClearedTheCourse() {
		if (averageGrade < 6.0) {
			
			return false;
		
		} else {
			
			return true;
		}
		
	}
	public String toString() {
		calculateAverage(this.firstGrade, this.secondGrade, this.thirdGrade);
		DecimalFormat df = new DecimalFormat("#.0");
		df.format(firstGrade);
		df.format(secondGrade);
		df.format(thirdGrade);
		
		if (hasClearedTheCourse()) {
			return "Student: " + getFirstName() + " " + getLastName() + "\nGrades: " + getFirstGrade() + ", " + getSecondGrade() + ", " + getThirdGrade() + "\nThe student has cleared the course" + "\n------------------------";
			
		} else {
			return "Student: " + getFirstName() + " " + getLastName() + "\nGrades: " + getFirstGrade() + ", " + getSecondGrade() + ", " + getThirdGrade() + "\nThe student has not cleared the course" + "\n------------------------";

		}
		
	}
	
}
