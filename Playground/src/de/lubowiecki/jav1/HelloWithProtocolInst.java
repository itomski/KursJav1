package de.lubowiecki.jav1;

import java.util.Scanner;

public class HelloWithProtocolInst {
		
	// Instanzvariable
	private String protocol = "";
		
	// Klassenmethode
	public static void main(String[] args) {
		new HelloWithProtocolInst().start();
		new HelloWithProtocolInst().start();
		new HelloWithProtocolInst().start();
	}
		
	// Instanzmethode
	private void start() {
		// lokale Variable
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("Eingabe: ");
			String input = scanner.nextLine();
			
			if(input.equalsIgnoreCase("exit")) {
				break;
			}
			
			protocol += input + "\n";
			
			System.out.println(input);
		}
		
		System.out.println("---------------");
		System.out.println(protocol);
		
		System.out.println("ENDE");
	}
}
