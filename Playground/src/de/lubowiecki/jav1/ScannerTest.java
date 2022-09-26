package de.lubowiecki.jav1;

import java.util.Scanner;

public class ScannerTest {

	// Konstante
	private final Scanner SCANNER = new Scanner(System.in);
	
	public static void main(String[] args) {
		new ScannerTest().start();
	}

	private void start() {
		
		String sInput = SCANNER.next(); // Liest String bis zum nächsten Leerzeichen ein
		System.out.println(sInput);
		
		int iInput = SCANNER.nextInt();
		System.out.println(iInput);
		
		// Muss im landestüpischen Format eingegeben werden
		double dInput = SCANNER.nextDouble();
		System.out.println(dInput);
		
		sInput = SCANNER.next();
		dInput = Double.parseDouble(sInput); // Wandelt einen String in Double um
		System.out.println(sInput);
		
		SCANNER.nextLine(); // Fix... ist nach anderen next-Methoden nötig
		
		sInput = SCANNER.nextLine(); // Liest die komplette Eingabe ein
		System.out.println(sInput);
		
	}
}
