package de.lubowiecki.jav1;

public class BeziehungenTest {

	public static void main(String[] args) {
		
		// HAS-A, Ein Objekt enthält ein anderes Objekt
		ClassA a = new ClassA();
		a.b = new ClassB();
		System.out.println(a.b.name);
		
		// IS-A, Wird durch Vererbung herbeigeführt
		
		Mensch m = new Mensch();
		m = new Student(); // Student IS-A Mensch
		
		Object o = new Student(); // Student IS-A Mensch, Mensch IS-A Object

	}
}

class ClassA {
	
	// HAS-A
	public ClassB b;
	
}

class ClassB {
	
	public String name = "B";
	
}

class Mensch {
	
}

class Student extends Mensch {
	
}