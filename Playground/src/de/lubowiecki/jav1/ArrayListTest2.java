package de.lubowiecki.jav1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrayListTest2 {

	public static void main(String[] args) {
		
		// Default-Size des iunternen Arrays ist 10
		ArrayList<Integer> zahlen = new ArrayList<>();
		zahlen.add(5);
		
		// asList liefert eine Fixed-Size-List: Größe ist nicht veränderbar
		List<Integer> zList = Arrays.asList(5,7,9,22,18,11);
		// zList.add(5); // Exception
		
		// Werte der Fixed-Size-List werden in die neue, flexible ArrayList eingefügt
		zahlen = new ArrayList<>(Arrays.asList(5,7,9,22,18,11));
		
		// ist erst ab Java 9 verfügbar
		//zList = List.of(5,7,9,22,18,11);
		
		// [5][7][9][22][18][11][][][][]
		
		zahlen.add(100);
		// [5][7][9][22][18][11][100][][][]
		
		zahlen.add(1, 200);
		// [5][200][7][9][22][18][11][100][][]
		
		zahlen.remove(2);
		// [5][200][9][22][18][11][100][][][]
		
		// List Vorteile
		// Zugriff auf Elemente über einen Index
		// Ist geordnet, Einfügereihenfolge
		
		// ArrayList Vorteile
		// Schneller Wahl-Freier-Zugriff
		
		// ArrayList Nachteile
		// Änderungen mitten im Array sind nicht besonders schnell (großer Aufwand)
		
		// Werte aus der ArrayList werden in die LinkedList eingefügt
		LinkedList<Integer> lList = new LinkedList<>(zahlen);
		
		// (5)<->(200)<->(7)<->(9)<->(22)
		lList.add(1, 200);
		
		// LinkedList Vorteile
		// Änderungen mitten im Array sind sehr schnell
		
		// LinkedList Nachteile
		// Langsamer Wahl-Freier-Zugriff
		
		
		List<Integer> data = new ArrayList<>();
		data.add(1);
		data.add(3);
		data.add(22);
		data.add(18);
		
		// Wechsel von ArrayList zu LinkedList
		data = new LinkedList<>(data);
		data.add(1, 200);
		data.add(4, 30);
		
		// Wechsel von LinkedList zu ArrayList
		data = new ArrayList<>(data);
		
		System.out.println(data.get(5));
	}
}
