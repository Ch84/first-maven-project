package com.main;

import java.util.ArrayList;

import com.classes.Classroom;
import com.classes.Student;

public class MainStudent {

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();
		
		Classroom c = new Classroom("Kvalit17 ", "Fall 2017 ", students);
		
		Student student = new Student("Christian ", "Hall ", 33, 'M');
		c.addANewStudent(student);
		student.setFirstGrade(20.0);
		student.setSecondGrade(7.1);
		student.setThirdGrade(1.0);
		student.calculateAverageGrade();
		student.getAverageGrade();
		
		Student student1 = new Student("Gayathri ", "Kashunika Hall ", 26, 'F');
		student1.setFirstGrade(20.0);
		student1.setSecondGrade(5.0);
		student1.setThirdGrade(1.0);
		student1.calculateAverageGrade();
		student1.getAverageGrade();
		
		Student student2 = new Student("Rani ", "Hall ", 55, 'F');
		student2.setFirstGrade(20.0);
		student2.setSecondGrade(7.0);
		student2.setThirdGrade(1.0);
		student2.calculateAverageGrade();
		student2.getAverageGrade();
		
		Student student3 = new Student("Anders ", "Jonsson ", 57, 'M');
		student3.setFirstGrade(15.0);
		student3.setSecondGrade(8.0);
		student3.setThirdGrade(1.0);
		student3.calculateAverageGrade();
		student3.getAverageGrade();
		
		Student student4 = new Student("Jan ", "Hall ", 67, 'M');
		student4.setFirstGrade(17.0);
		student4.setSecondGrade(7.0);
		student4.setThirdGrade(1.0);
		student4.calculateAverageGrade();
		student4.getAverageGrade();
		
		System.out.println(c.printFullRelatory());
		double classAverage = (student.getAverageGrade()) + student1.getAverageGrade()
		+ student2.getAverageGrade() + student3.getAverageGrade() + student4.getAverageGrade() / 4;
		
		System.out.println("The average grade of the class is: " + classAverage);
		
		double classAgeAverage = (student.getAge() + student1.getAge() + student2.getAge()
		+ student3.getAge() + student4.getAge()) / 4;
		
		System.out.println("The average age of the class is: " + classAgeAverage);
		System.out.println(c.toString());
		
	}

}
