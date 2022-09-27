package de.lubowiecki.jav1.rechner;

import java.util.Scanner;

public class RechnerController {
	
	private final Scanner SCANNER = new Scanner(System.in);
	
	// Protocol-Instanz
	
	public void start() {
		
		while(true) {
			
			switch(selectOperation()) {
				case "add":
					// Validieren
					System.out.print("\nZahl 1: ");
					double a = SCANNER.nextDouble();
					System.out.print("\nZahl 2: ");
					double b = SCANNER.nextDouble();
					SCANNER.nextLine(); // fix
					System.out.println(Rechner.add(a, b));
					break;
			}
		}
	}
	
	private String selectOperation() {
		System.out.print("\nOperation: ");
		// Validierung
		return SCANNER.nextLine().toLowerCase();
	}
}
