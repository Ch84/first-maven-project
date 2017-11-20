package com.classes;

public class Person {
	private int age = 0;
	private String firstName = " ";
	private String lastName = " ";
	private char gender = ' ';
	
	public Person(String firstName, String lastName, int age, char gender) {
		System.out.println(firstName + lastName + age + gender);
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
}


