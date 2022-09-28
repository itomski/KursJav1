package de.lubowiecki.jav1;

public class StringTest {

	public static void main(String[] args) {
		
		String s1 = "Moin"; // Moin landet im StringLiteralPool
		String s2 = s1; // s2 ist eine Referenz auf Objekt hinter s1
		s2 = "Moin"; // Verweis auf das Objekt im StringLiteralPool
		String s3 = "Moin"; // Verweis auf das Objekt im StringLiteralPool
		
		s2 = new String("Moin"); // Landet nicht im Pool, neuer String wird auf dem Heap erzeugt
		
		// Bei Objekten
		System.out.println(s1 == s2); // Referenz-Gleichheit wird geprüft
		System.out.println(s1.equals(s2)); // Zustands-Gleichheit wird geprüft
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println();
		
		NextThing nt1 = new NextThing("Hammer", 2.5);
		NextThing nt2 = new NextThing("Hammer", 2.5);
		System.out.println(nt1 == nt2); // Referenz-Gleichheit
		System.out.println(nt1.equals(nt2)); // Zustands-Gleichheit
		
		System.out.println(nt1);
		System.out.println(nt2);
		
		System.out.println();
		
		// String ist Immutable
		String s5 = "Hallo";
		s5 += " Welt";
		System.out.println(s5);
		
		System.out.println(s5.hashCode());
		
		s5 = s5.toUpperCase();
		
		System.out.println(s5);
		System.out.println(s5.hashCode());

	}
}

class NextThing {
	
	private String name;
	
	private double weight;

	public NextThing(String name, double weight) {
		this.name = name;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("NextThing [name=");
		builder.append(name);
		builder.append(", weight=");
		builder.append(weight);
		builder.append("]");
		return builder.toString();
	}
}
