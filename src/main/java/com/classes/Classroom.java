package com.classes;

import java.util.ArrayList;

public class Classroom {
	private String classroomName = " ";
	private String classroomTerm = " ";
	private ArrayList<Student> students = new ArrayList<Student>();
	
	public Classroom(String classroomName, String classroomTerm, ArrayList<Student> students) {
		super();
		this.classroomName = classroomName;
		this.classroomTerm = classroomTerm;
		this.students = students;
	}

	public String getClassroomName() {
		return classroomName;
	}

	public void setClassroomName(String classroomName) {
		this.classroomName = classroomName;
	}

	public String getClassroomTerm() {
		return classroomTerm;
	}

	public void setClassroomTerm(String classroomTerm) {
		this.classroomTerm = classroomTerm;
	}

	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
	public void addANewStudent(Student student) {
		this.students.add(student);
		
	}
	public void removeAStudent(String firstName) {
		
		for (int k = 0; k < students.size(); k++) {
			
			if (students.get(k).getFirstName().equals(firstName)) {
				
				this.students.remove(k);
				System.out.println("Student " + firstName + " successfully removed!");
				
			} else {
				System.out.println("This student " + firstName + " does not exist!");
			}
			
		}
		
	}
	public String toString() {
		
		String genderAmount = " ";
		int genderFemale = 0;
		int genderMale = 0;
		int gender0 = 0;
		
		for (int k = 0; k < students.size(); k++) {
			
			if (students.get(k).getGender() == 'F') {
				genderFemale++;
				
			} else if (students.get(k).getGender() == 'M') {
				genderMale++;
				
			} else {
				gender0++;
			}
		}
		genderAmount = "The average of the students is " + genderFemale + " girls" 
				+ genderMale + " boys" + gender0 + "no definition of gender ";
		
		return genderAmount;
		
	}
	public String printFullRelatory() {
		
		String fullrelatory = "Classroom " + getClassroomName() + "\tTerm: " + getClassroomTerm() 
		+ "\nStudents: ";
		
		for (int k = 0; k < students.size(); k++) {
			fullrelatory += students.get(k).toString() + "\n";
		}
		return fullrelatory + "\n";
	}
		
}


