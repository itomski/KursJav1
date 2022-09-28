package de.lubowiecki.jav1;

public class OperatorTest {

	public static void main(String[] args) {
		
		int x = 10;
		int y = x++; // Vormerkung für Increment hat Pro 1
		System.out.println(y);
		System.out.println(x);
		
		System.out.println();
		
		x = 10;
		x = x++; // Die Neuzuweisung überschreibt die Vormerkung für Increment
		System.out.println(x);
		

	}

}
