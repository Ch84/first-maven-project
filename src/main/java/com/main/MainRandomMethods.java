package com.main;

import com.classes.MyRandomMethods;

public class MainRandomMethods {

	public static void main(String[] args) {
		MyRandomMethods mr = new MyRandomMethods();
		
		System.out.println(mr.randomBetween1And10(1));
		System.out.println(mr.randomBetween11And20(11));
		System.out.println(mr.randomBetween21And30(21));
		System.out.println(mr.randomBetween31And40(31));
		System.out.println(mr.randomBetween41And50(41));
	}

}
