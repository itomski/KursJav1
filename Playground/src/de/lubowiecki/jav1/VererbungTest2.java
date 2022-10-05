package de.lubowiecki.jav1;

import java.io.IOException;

public class VererbungTest2 {

	public static void main(String[] args) {
		
		NextMensch m1 = new NextMensch();
		m1.getZeitNutzung();
		m1.getMoeglicheNahrung();
		
		System.out.println();
		
		m1 = new NextStudent();
		m1.getZeitNutzung();
		m1.getMoeglicheNahrung();
		
		System.out.println();
		
		m1 = new NextJuraStudent();
		m1.getZeitNutzung();
		m1.getMoeglicheNahrung();
		
	}
}

class NextMensch {
	
	public NextMensch() {
		System.out.println("NextMensch");
	}
	
	public void getZeitNutzung() {
		System.out.println("Ich gehe verschiedenen Dingen nach...");
	}
	
	public void getMoeglicheNahrung() {
		System.out.println("Verschiedene Dinge z.B. Fleisch und Gemüse");
	}
}

class NextStudent extends NextMensch {
	
	// Ist Konstruktor definiert, stellt Java einen Default-Konstruktor bereit
	public NextStudent() {
		//super(); // Muss die erste Anweisung im Konstruktor sein, wird automatisch verwendet, wenn nicht da
		System.out.println("NextStudent");
	}
	
	@Override
	public void getMoeglicheNahrung() {
		System.out.println("Pizza, Bier und Cola");
	}
}

class NextJuraStudent extends NextStudent {
	
	public NextJuraStudent() {
		super();
		System.out.println(getClass().getSimpleName());
	}
	
	//@Override
	public void getZeitNutzung() {
		System.out.println("Besucht Strafrecht-Seminare");
	}
}

