package de.lubowiecki.jav1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ScopeTest {

	public static void main(String[] args) {
		
		
		if(true) {
			int x = 10; // #1
			
			if(true) {
				//int x = 10; // x aus #1 noch sichtbar
			}
		}
		
		int x = 20; // x aus #1 nicht mehr verfügbar
		
		System.out.println(x);
		
		
		int y;
		
		final boolean b = true; // Compiletime-Konstante
		
		if(b) {
			y = 10;
		}
		
		System.out.println(y);
		
		// Array verbleibt im Speicher bis der Scope beendet ist
		int[] arr = new int[100_000_000];
		
		{
			// Array verbleibt im Speicher bis der umgebende block beendet ist
			int[] arr2 = new int[100_000_000];
		} // Objekt hinter arr2 steht für GC bereit
		
		System.out.println();

		// Variablen zahlen, list und erg blieben im Speicher bis zur Ende der Main-Methode
		Integer[] zahlen = {1,7,22,100,27,29,5,18};
		Arrays.sort(zahlen);
		List<Integer> list = Arrays.asList(zahlen);
		int erg = Collections.binarySearch(list, 17);
		System.out.println(erg);
		
		// zahlen2 bliebt im Speicher bis zur Ende der Main-Methode
		Integer[] zahlen2 = {1,7,22,100,27,29,5,18};
		Arrays.sort(zahlen2);
		System.out.println(Collections.binarySearch(Arrays.asList(zahlen2), 17));
	}

}
