package com.classes;

import java.util.Random;

public class MyRandomMethods {
	public int randomBetween1And10(int numberOne) {
		Random random = new Random();
		numberOne = random.nextInt(10) + 1;
		
		return numberOne;
		
	}
	public int randomBetween11And20(int numberEleven) {
		Random random = new Random();
		numberEleven = random.nextInt(10) + 11;
		
		return numberEleven;
	}
	public int randomBetween21And30(int numberTwentyOne) {
		Random random = new Random();
		numberTwentyOne = random.nextInt(10) + 21;
		
		return numberTwentyOne;
	}
	public int randomBetween31And40(int numberThirtyOne) {
		Random random = new Random();
		numberThirtyOne = random.nextInt(10) + 31;
		
		return numberThirtyOne;
	}
	public int randomBetween41And50(int numberFortyOne) {
		Random random = new Random();
		numberFortyOne = random.nextInt(10) + 41;
		
		return numberFortyOne;
	}
		
	
	

}
