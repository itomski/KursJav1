package de.lubowiecki.jav1;

import java.util.Scanner;

public class HelloWithProtocol {
	
	// Instanzvariable
	//private String protocol = "";
	
	// Klassenvariable
	private static String protocol = "";
	
	// Klassenmethode
	public static void main(String[] args) {
		
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
