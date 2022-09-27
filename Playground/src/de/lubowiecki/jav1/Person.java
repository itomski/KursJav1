package de.lubowiecki.jav1;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Person {
	
	private static int count;
	
	private int id;
	private String firstName;
	private String lastName;
	private boolean active;
	
	public Person() {
		//super(); // Der Konstruktor der Eltern-Klasse (Object) wird automatisch verwendet 
		id = ++count;
	}
	
	public Person(String firstName, String lastName) {
		this(); // Ruft den eigenen parameterlosen Konstruktor auf
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Person(String firstName, String lastName, boolean active) {
		this(firstName, lastName);
		this.active = active;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public boolean isActive() {
		return active;
	}
	
	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
//		StringBuilder builder = new StringBuilder();
//		builder.append("Person [id=");
//		builder.append(id);
//		builder.append(", firstName=");
//		builder.append(firstName);
//		builder.append(", lastName=");
//		builder.append(lastName);
//		builder.append(", active=");
//		builder.append(active);
//		builder.append("]");
//		return builder.toString();
		
		return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println(firstName + " " + lastName + ": UGH... ARRRGHHHH!!!!");
		super.finalize();
	}
}
