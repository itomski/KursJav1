package de.lubowiecki.jav1;

import java.util.Random;

public class RandomTest {
	
	public static void main(String[] args) {
		
		System.out.println((int) Math.floor(Math.random() * 6) + 1);
		
		Random rand = new Random();
		System.out.println(rand.nextInt(6));
		
	}

}
