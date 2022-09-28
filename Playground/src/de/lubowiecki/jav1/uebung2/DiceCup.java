package de.lubowiecki.jav1.uebung2;

/**
 * Cup of dices with predefined size
 * @author Tomasz Lubowiecki
 * @version 1.0
 */
public class DiceCup {

	private final Dice DICE;

	/**
	 * 
	 * @param dice Dicetype
	 */
	public DiceCup(Dice dice) {
		DICE = dice;
	}
	
	/**
	 * Roll single dice
	 * @return
	 */
	public int roll() {
		return DICE.roll();
	}
	
	/**
	 * Roll number of dice 
	 * @param count
	 * @return
	 */
	public int[] roll(int count) {
		int[] arr = new int[count];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = roll();
		}
		return arr;
	}
	
	/**
	 * Print the values
	 * @param arr Array with dicerolls
	 * @return
	 */
	public String summary(int[] arr) {
		StringBuilder output = new StringBuilder();
		
		int[] values = count(arr);
		
		for (int i = 0; i < values.length; i++) {
			output.append(i + 1)
				  .append(" : ")
				  .append(values[i])
				  .append(" mal \n");
		}
		
		return output.toString();
	}
	
	/**
	 * Count the values
	 * @param arr Array with dicerolls
	 * @return
	 */
	private int[] count(int[] arr) {
		
		int[] counts = new int[DICE.getSize()];
		
		for (int d : arr) {
			counts[d - 1]++;
		}
		
		return counts;
	}
}
