package de.lubowiecki.jav1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class SwitchTest {
	
	public static void main(String[] args) {
		
		byte i = 10;
		
		// Wert in switch muss String, Ganzzahlenwert (außer long) oder Enum sein
		switch(i) {
			
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.println("<=5");
				break;
			
			case 6:
			case 7:
			case 8:
				System.out.println(">5 && <=8");
				break;
				
			default:
				// Wird benutzt wenn es keinen Case für den Wert gibt
				System.out.println("<= 0 || > 8 ");
				break; // optional
		}
		
		
		final byte V1 = 1; // Compile-Time-Konstante
		final byte V2;
		V2 = 10; // Runtime-Time-Konstante
		
		switch(i) {
		
			case V1 + 3: // Muss eine Compile-Time-Konstante sein
				System.out.println("A");
				break;
				
//			case V2 + 3: // Error!!! Dar keine Runtime-Time-Konstante sein
//				System.out.println("G");
//				break;	
				
			case 2:
				System.out.println("B");
				break;
			case 3:
				System.out.println("C");
				break;
		}
		
		
		//for(;;System.out.println(i++));
		
//		for(;;) { // Endlosschleife
//			
//		}
		
//		int z;
//		while((z = 10) < 100) {
//			System.out.println(z++);
//			int y = 20;
//		}
		
//		do {
//			int y = 20;
//		}
//		while(y < 20); // y ist out-of-scope
		
		
		List<String> namen = Arrays.asList("Peter", "Carol", "Bruce", "Natasha", "Tony", "Steve");
		
		for(String s : namen) {
			System.out.println(s);
		}
		
		System.out.println();
		
		for(int j = 0; j < namen.size(); j++) {
			System.out.println(namen.get(j));
		}
		
		System.out.println();
		
		Iterator<String> itr = namen.iterator(); // Iterationsobjekt
		
		while(itr.hasNext()) {
			// next gibt das Objekt an aktueller Position und verschiebt den Cursor auf das nächste Objekt
			System.out.println(itr.next());  
		}
		
		System.out.println();
		
		namen.forEach(e -> System.out.println(e)); // Arbeitet mit Lambdas, seit Java 1.8
	}
}
