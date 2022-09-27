package de.lubowiecki.jav1;

import java.util.function.Consumer;

public class FinalTest {
	
	public static final String KEYS = "\n-----------------------------------------"
										+ "\n e = exit"
										+ "\n n = neu"
										+ "\n s = anzeigen"
										+ "\n-----------------------------------------";
	
	private static int z2;

	public static void main(String[] args) {
		
		// Lokale Compiletime-Konstante;
		final int a = 10;
		//a = 15; // Error, Wert kann nicht mehr geändert werden
		
		// Lokale Runtime-Konstante;
		final int b;
		b = 10;
		
//		while(b == 10) {
//			System.out.println("Moin");
//		}
//		System.out.println("Ende");
		
		// finale Variable
		final int c = 10;
		
		// effektiv finale Variable - Variable wird NIE geändert
		int d = 20;
		
		// Lambda
		Consumer<String> cons = (s) -> System.out.println(s + " " + d);
		// d = 30; // ist nicht mehr effektiv finale
		
		System.out.println(KEYS);
		
		int z;
		//System.out.println(z); // Error: z inst nicht initialisiert
		System.out.println(z2);
		
		int zahl = 0x10;
		System.out.println(zahl);
		
		zahl = 100_000_000;
	}

}
