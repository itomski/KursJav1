package de.lubowiecki.jav1.uebung3;

import java.util.Scanner;

public class App {
	
	private final Scanner SCANNER = new Scanner(System.in);

	public static void main(String[] args) {
		new App().run();
	}
	
	public void run() {
		Board board = new Board();
		Robot robot = new Robot(board);
		
		while(true) {
			System.out.println(board);
			
			System.out.print("\nEingabe: ");
			String input = SCANNER.nextLine().trim().toLowerCase();
			if(input.equals("exit"))
				break;
			
			String[] controls = input.split("");
			for(String c : controls) {
				switch(c) {
					case ">":
						System.out.println(robot.moveForward() ? "" : "Ungültig");
						break;
						
					case "<":
						System.out.println(robot.moveBackward() ? "" : "Ungültig");
						break;
						
					case "r":
						robot.rotateRight();
						break;
						
					case "l":
						robot.rotateLeft();
						break;
						
					default:
						System.out.printf("Ungültige Anweisung (%s) \n", c);
				}
			}
		}
		
		System.out.println("Programm ist beendet.");
	}

}
