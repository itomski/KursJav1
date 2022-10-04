package de.lubowiecki.jav1.patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Rudel implements Composite {
	
	List<Composite> rudel = new ArrayList<>();
	
	public void add(Composite c) {
		rudel.add(c);
	}

	@Override
	public void doSomething() {
		for(Composite c : rudel) {
			c.doSomething();
		}
	}
}
