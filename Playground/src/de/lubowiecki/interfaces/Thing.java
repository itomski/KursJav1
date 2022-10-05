package de.lubowiecki.interfaces;

import java.io.Serializable;

// Immutable
public class Thing implements Serializable {
	
	private static final long serialVersionUID = -817747628604521513L;
	
	private final String name;

	public Thing(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Thing [name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}
}
