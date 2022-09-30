package de.lubowiecki.jav1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		
		// ArrayList ist die konkrete Klasse
		// List ist eine Interface
		List<String> list = new ArrayList<>(); // <String> = kann nur Strings enthalten
		//list = new LinkedList<>();
		
		list.add("Hallo"); // Nimmt einen String entgegen
		String str = list.get(0); // Liefert einen String
		
		// Object wird als Typ für Elemente verwendet
		ArrayList list1 = new ArrayList();
		
		// Nimmt ein Object entgegen
		list1.add("Hallo..."); // Widening von String zu Object
		list1.add(10.5); // Autoboxing von double zu Double, Widening von Double zu Object
		list1.add(10); // Autoboxing von int zu Integer, Widening von Integer zu Object
		
		// Liefert ein Object zurück
		str = (String) list1.get(0);
		str = (String) list1.get(1);
		

	}
}
