package de.lubowiecki.interfaces;

import java.util.Scanner;

public class MainController {

	private Repository<Thing> repository;
	
	private final Scanner scanner = new Scanner(System.in);
	
	
	public MainController(Repository<Thing> repository) {
		this.repository = repository;
	}
	
	public void run() {
		
		app: while(true) {
			switch(getInput("Eingabe").toLowerCase()) {
				case "add":
					add();
					break;
					
				case "show":
					show();
					break;
					
				case "exit":
					break app;
					
				default:
					System.out.println("Üngültige Eingabe");
			}
		}
		
		System.out.println("Ende des Programms");
		
		
	}
	
	private void show() {
		for(Thing t : repository.findAll()) {
			System.out.println(t);
		}
	}
	
	private void add() {
		repository.add(create());
	}
	
	private Thing create() {
		return new Thing(getInput("Name"));
	}
	
	private String getInput(String label) {
		System.out.printf("%n%s: ", label);
		return scanner.nextLine().trim();
	}
}
