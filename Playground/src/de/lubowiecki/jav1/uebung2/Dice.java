package de.lubowiecki.jav1.uebung2;

import java.util.Random;

/**
 * Single dice
 * @author Tomasz Lubowiecki
 * @version 1.0
 */
public enum Dice {
	
	W6, W10, W20, W100;
	
	private final Random rand = new Random();
		
	/**
	 * Roll single dice
	 * @return
	 */
	public int roll() {
		return rand.nextInt(getSize()) + 1;
	}
	
	/**
	 * 
	 * @return Size of the dice
	 */
	public int getSize() {
		return Integer.parseInt(this.toString().substring(1));
	}
}
