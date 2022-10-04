package de.lubowiecki.jav1.patterns.composite;

public class Lion implements Composite {

	@Override
	public void doSomething() {
		System.out.println("... frisst alle Zebras...");
	}
}
