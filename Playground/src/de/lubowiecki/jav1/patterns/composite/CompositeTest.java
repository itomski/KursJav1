package de.lubowiecki.jav1.patterns.composite;

public class CompositeTest {

	public static void main(String[] args) {
		
		Composite c1 = new Rhino();
		c1 = new Lion();
		c1.doSomething(); // Methode wird auf dem Objekt auf dem Heap ausgeführt
		
		System.out.println();
		
		Rudel r = new Rudel();
		r.add(new Rhino());
		r.add(new Rhino());
		r.add(new Lion());
		r.add(new Leopard());
		r.add(new Leopard());
		r.add(new Rhino());
		
		Rudel r2 = new Rudel();
		r2.add(new Leopard());
		r2.add(new Leopard());
		r2.add(new Leopard());
		r2.add(new Leopard());
		r2.add(new Leopard());
		
		Rudel r3 = new Rudel();
		r3.add(new Rhino());
		r3.add(new Rhino());
		r3.add(new Rhino());
		
		r.add(r2);
		r.add(r3);
		
		r.doSomething(); // Anweisung wird an jedes Tier delegiert

	}
}
