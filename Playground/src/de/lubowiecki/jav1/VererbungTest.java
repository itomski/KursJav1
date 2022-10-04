package de.lubowiecki.jav1;

import java.util.ArrayList;
import java.util.List;

public class VererbungTest {

	public static void main(String[] args) {
		
		List<Fahrzeug> fahrzeuge = new ArrayList<>();
		fahrzeuge.add(new PKW()); // PKW IS-A Fahrzeug
		fahrzeuge.get(0).setKennzeichen("HH AB123");
		
		
		PKW p = new PKW();
		p.setKennzeichen("HH CD234");
		fahrzeuge.add(p);
		
		p = new PKW();
		p.setKennzeichen("HH GH112");
		fahrzeuge.add(p);
		
		fahrzeuge.add(new LKW()); // LKW IS-A Fahrzeug
		// fahrzeuge.add(new UFO()); // Kein Fahrzeug
		
		// add nimmt Fahrzeug und Objekte von Klassen, die von Fahrzeug abgeleitet sind entgegen
		fahrzeuge.add(new Fahrzeug()); 
		
		for(Fahrzeug f : fahrzeuge) {
			// über die Referenz vom Typ Fahrzeg sehen wir nur Methoden und Eigenschaften von Fahrzeug
			System.out.println(f);
			
			// Über eine Referenz von Fahrzeug sehe ich nur, was wirklich in jedem Fahrzug (PKW, LKW, etc)
			// 100%ig verfügbar ist
			
//			if(f instanceof PKW) {
//				PKW pInner = (PKW) f; // ClassCastException wenn das Objekt auf dem Heap kein PKW ist
//				System.out.println(pInner.getInsassen());
//			}
		}
		
		PKW p1 = new PKW();
		// PKW als Kindklasse erbt alle (nicht private) Methoden und Eigenschaften von Fahrzeug
		p1.getKennzeichen();
		
		LKW l1 = new LKW();
		// LKW als Kindklasse erbt alle (nicht private) Methoden und Eigenschaften von Fahrzeug
		l1.getKennzeichen();
		
		// Objekt auf dem Heap: PKW
		// Referenz auf dem Stack: Fahrzeug
		
		// Referenzyp	/ Objekttyp
		Fahrzeug f2 = new PKW(); // Jeder PKW ist ein Fahrzeug: OK
		
		//PKW p2 = new Fahrzeug(); // Nicht jedes Fahrzeug ist ein PKW: Error
		
		
	}
}

//Object ist die Elternklasse
class Fahrzeug {
	
	private String kennzeichen;
	
	private String marke;
	
	private String typ;
	
	private int baujahr;

	public String getKennzeichen() {
		return kennzeichen;
	}

	public void setKennzeichen(String kennzeichen) {
		this.kennzeichen = kennzeichen;
	}

	public String getMarke() {
		return marke;
	}

	public void setMarke(String marke) {
		this.marke = marke;
	}

	public String getTyp() {
		return typ;
	}

	public void setTyp(String typ) {
		this.typ = typ;
	}

	public int getBaujahr() {
		return baujahr;
	}

	public void setBaujahr(int baujahr) {
		this.baujahr = baujahr;
	}
}

// Fahrzeug ist die Elternklasse
class PKW extends Fahrzeug {
	
	private int insassen;

	public int getInsassen() {
		return insassen;
	}

	public void setInsassen(int insassen) {
		//super.getMarke(); // Super ist eine Referenz auf ein Fahrzeug Objekt (Objekt der Elternklasse)
		this.insassen = insassen;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PKW [insassen=");
		builder.append(insassen);
		builder.append(", kennzeichen()=");
		builder.append(getKennzeichen());
		builder.append(", marke()=");
		builder.append(getMarke());
		builder.append(", typ()=");
		builder.append(getTyp());
		builder.append(", baujahr()=");
		builder.append(getBaujahr());
		builder.append("]");
		return builder.toString();
	}
}

class LKW extends Fahrzeug {
	
	private int ladung;

	public int getLadung() {
		return ladung;
	}

	public void setLadung(int ladung) {
		this.ladung = ladung;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LKW [ladung=");
		builder.append(ladung);
		builder.append(", kennzeichen()=");
		builder.append(getKennzeichen());
		builder.append(", marke()=");
		builder.append(getMarke());
		builder.append(", typ()=");
		builder.append(getTyp());
		builder.append(", baujahr()=");
		builder.append(getBaujahr());
		builder.append("]");
		return builder.toString();
	}
}

// Object ist die Elternklasse
class UFO {
	
}
