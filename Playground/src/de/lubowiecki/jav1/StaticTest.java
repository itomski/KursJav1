package de.lubowiecki.jav1;

public class StaticTest {
	
	public static void main(String[] args) {
		
		Thing t1 = new Thing();
		Thing t2 = new Thing();
		Thing t3 = new Thing();
		
		// t1.toString(); // Konvertiert das Objekt in erin String
		
		t1.zahl1 = 1;
		t2.zahl1 = 2;
		
//		t1.zahl2 = 10;
//		t2.zahl2 = 20;
		Thing.zahl2 = 50;
		
		//System.out.println(t1.machWas("Hallo", "Welt"));
		System.out.println(Thing.machWas("Hallo", "Welt"));
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
	}

}

class Thing { // ist von Object abgeleitet
	
	public int zahl1; // Instanzvariable
	public static int zahl2; // Klassenvariable
	
	public int getZahl1() {
		return zahl1;
	}

	public int getZahl2() {
		return zahl2;
	}
	
//	public static int getStaticZahl1() {
//		return zahl1; // Error: Statische Methoden haben keinen Zugang zu Instanz-Variablen/Methoden
//	}

	public static int getStaticZahl2() {
		return zahl2;
	}
	
	// Utility-Method, Verarbeitet die Eingangsparameter
	public static String machWas(String a, String b) {
		return (a + " " + b).toUpperCase();
	}
	
	// Utility-Class: enthält nur statische Methoden und Konstanten (Beispiel: Math)

	@Override
	public String toString() {
		return String.format("Thing [zahl1=%s zahl2=%s] ", zahl1, zahl2);
	}
}
