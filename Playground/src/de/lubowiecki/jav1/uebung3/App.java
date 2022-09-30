package de.lubowiecki.jav1.uebung3;

import java.util.Scanner;

public class App {
	
	// Nimmt die Eigaben des Users entgegen
	private final Scanner SCANNER = new Scanner(System.in);

	public static void main(String[] args) {
		// Einstieg in das Programm
		new App().run();
	}
	
	public void run() {
		Board board = new Board();
		Robot robot = new Robot(board);
		
		// Fragt die Eingabe des Users ab bis exit eingegeben wird
		while(true) {
			System.out.println(board); // Zeigt aktuellen Zustand des Boars an
			
			System.out.print("\nEingabe: ");
			String input = SCANNER.nextLine().trim().toLowerCase();
			
			if(input.equals("exit"))
				break;
			
			String[] controls = input.split(""); // Zerlegt die Eingabe des Users in einezelne Zeichen
			
			// c ist das aktuelle Zeichen aus der Sammlung (controls)
			for(String c : controls) {
				// Jedes eingegebene Zeichen wird wird geprüft und ausgeführt
				switch(c) {
					case ">":
						if(!robot.moveForward()) {
							System.out.println("Ungültig");
						}
						break;
						
					case "<":
						if(!robot.moveBackward()) {
							System.out.println("Ungültig");
						}
						break;
						
					case "r":
						robot.rotateRight();
						break;
						
					case "l":
						robot.rotateLeft();
						break;
						
					default:
						// Wird ausgegeben, wenn aktuelles Zeichen (c) ungültig war
						System.out.println("Ungültige Anweisung (" + c + ")");
				}
			}
		}
		
		System.out.println("Programm ist beendet.");
	}

}
