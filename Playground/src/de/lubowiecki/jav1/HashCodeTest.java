package de.lubowiecki.jav1;

import java.util.HashSet;
import java.util.Set;

public class HashCodeTest {

	public static void main(String[] args) {
		
		Object a = new Object();
		Object b = new Object();
		System.out.println(a == b);
		System.out.println(a.equals(b));
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		
		System.out.println();
		
		// Byte-Literal-Pool (Werte von -128 bis 127 sind als Objekte im Pool immer verfügbar)
		// Wird ein Literal mit Größe von -128 bis 127 verwendet, entsteht kein neues Objekt auf dem Heap
		// sondern es wird auf den Wert im Pool referenziert
		Integer i1 = 100; // Wrapper, Verweist auf die 100 im Pool
		Integer i2 = 100; // Verweist ebenfalls auf die 100 im Pool
		i2 = new Integer(100); // Es wird ein neues Objekt auf dem Heap erzeugt (new)
		System.out.println(i1 == i2);
		System.out.println(i1.equals(i2));
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
		
		System.out.println();
		
		String s1 = "Hallo"; // Landet im String-Literal-Pool
		String s2 = "Hallo"; // Referenziert auf den vorhandenen Wert im Pool
		s2 = new String("Hallo"); // Erzeugt ein neuen String auf dem Heap
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(null));
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println();
		
		Person p1 = new Person("Peter", "Parker");
		Person p2 = new Person("Peter", "Parker");
		Person p3 = new Person("Bruce", "Banner");
		
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		// HashCode ist nicht richtig eingebaut!!!!
		
		System.out.println();
		
		// Darf keine Duplikate enthalten
		Set<Person> personen = new HashSet<>(); // Hash basierte Datenstuktur
		
		personen.add(p1);
		personen.add(p2);
		//personen.add(p3);
		
		System.out.println(personen);
	}
}



