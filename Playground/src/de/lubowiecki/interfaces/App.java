package de.lubowiecki.interfaces;

public class App {

	public static void main(String[] args) {
		new MainController(new DbThingRepository()).run();
	}
}
