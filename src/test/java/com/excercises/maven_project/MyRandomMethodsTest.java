package com.excercises.maven_project;

import static org.junit.Assert.*;

import org.junit.Test;

import com.classes.MyRandomMethods;

public class MyRandomMethodsTest {
	MyRandomMethods mr = new MyRandomMethods();

	@Test
	public void testMethodBetween1And10() {
		int result = mr.randomBetween1And10(0);
		assertTrue((result >=1) && (result <= 10));
		
	}
	@Test
	public void testMethodBetween11And20() {
		int result = mr.randomBetween11And20(0);
		assertTrue((result >= 11) && (result <= 20));
		
	}
	@Test
	public void testMethodBetween21And30() {
		int result = mr.randomBetween21And30(0);
		assertTrue((result >= 21) && (result <= 30));
		
	}
	@Test
	public void testMethodBetween31And40() {
		int result = mr.randomBetween31And40(0);
		assertTrue((result >= 31) && (result <= 40));
		
	}
	@Test
	public void testMethodBetween41And50() {
		int result = mr.randomBetween41And50(0);
		assertTrue((result >= 41) && (result <= 50));
	}
		
}


