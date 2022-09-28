package de.lubowiecki.jav1.uebung2;

import java.util.Arrays;

public class DiceCupTest {

	public static void main(String[] args) {

		// TODO: UI implementieren
		
		System.out.println(Dice.W6.roll());
		System.out.println(Dice.W100.roll());
		System.out.println(Dice.W10.roll());
		System.out.println(Dice.W20.roll());
		
		System.out.println("--------------");
		
		DiceCup dc1 = new DiceCup(Dice.W6);
		System.out.println(dc1.roll());
		
		int[] rolls = dc1.roll(50);
		
		System.out.println(Arrays.toString(rolls));
		
		System.out.println(dc1.summary(rolls));
	}
}
