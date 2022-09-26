package de.lubowiecki.jav1;

// LocalDate liegt in einem anderen package und muss importiert werden
import java.time.*;
import java.sql.Date;


// Alles aus package java.lang ist immer OHNE Import verfügbar

/**
 * Sagt einfach nur Hallo
 * 
 * @author Tomasz Lubowiecki
 * @version 1.0
 * @since 1.0
 *
 */
public class HalloWelt {
	
	/* Variablen: Klassenvariablen, Instanzvariablen und lokale Variablen */

	public static void main(String... args) {
		
//		if(args.length > 0) {
//			for (String str : args) {
//				System.out.println(str);
//			}
//		}
		
		/* System.out.println("Moin Moin"); */
		
		System.out.println(LocalDate.now()/* ABC */);
		
		int sum = add(1,5,7,19,22,8,2);
		System.out.println(sum);
		
		int[] zahlen = {1,5,7,19,22,8,2}; // Array mit Zahlen
		System.out.println(add(zahlen));
		
		System.out.println(new java.util.Date());
		System.out.println(new Date(1));
		
	}
	
	/**
	 * Wandelt Zeichenketten in Ganzzahlen um
	 * @param str Muss eine gültige Zahl sein
	 * @return Umlgewandelte Ganzzahl
	 */
	public int machWas(String str) {
		return Integer.parseInt(str);
	}
	
	public static int add(int... zahlen) {
		
		int sum = 0;
		for (int i : zahlen) {
			sum += i;
		}
		
		return sum;
	}
	
}

class Xyz {
	
}
