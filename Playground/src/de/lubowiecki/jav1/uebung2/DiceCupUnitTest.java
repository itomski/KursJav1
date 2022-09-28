package de.lubowiecki.jav1.uebung2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DiceCupUnitTest {

	@Test
	void testW6() {
		DiceCup cup = new DiceCup(Dice.W6);
		int val = cup.roll();
		assertTrue(val > 0 && val <= 6);
	}
	
	@Test
	void testW10() {
		DiceCup cup = new DiceCup(Dice.W10);
		int val = cup.roll();
		assertTrue(val > 0 && val <= 10);
	}
	
	@Test
	void testW100() {
		DiceCup cup = new DiceCup(Dice.W100);
		int val = cup.roll();
		assertTrue(val > 0 && val <= 100);
	}
}
