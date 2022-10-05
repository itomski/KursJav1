package de.lubowiecki.jav1.uebung4;

import java.time.LocalDate;
import java.util.Scanner;

// Controller
public class App {
	
	private final ProductRepository repository = new ProductRepository();
	private final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		new App().run();
	}
	
	// Mehrsprachigkeit kann mir ResourceBundles umgesetzt werden
	
	private void run() {
		
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
		for(Product p : repository.findAll()) {
			System.out.println(p);
		}
	}
	
	private void add() {
		repository.add(create());
	}
	
	private Product create() {
		
		Product p;
		
		if(getInput("Verderbliches Produkt [j/n]").toLowerCase().equals("j")) {
			p = new PershableProduct();
		}
		else {
			p = new Product();
		}
		
		p.setName(getInput("Name"));
		
		p.setDescription(getInput("Beschreibung"));
		
		if(p instanceof PershableProduct) {
			
			while(true) {
				try {
					LocalDate expiryDate = LocalDate.parse(getInput("Verfallsdatum"));
					((PershableProduct) p).setExpiryDate(expiryDate);
					break;
				}
				catch(Exception e) {
					System.out.println("Ungültiges Datums-Format (JJJJ-MM-TT).");
				}
			}
		}
		
		while(true) {
			try {
				double price = Double.parseDouble(getInput("Preis"));
				p.setPrice(price);
				break;
			}
			catch(Exception e) {
				System.out.println("Ungültiger Preis (z.B. 19.99).");
			}
		}
		
		while(true) {
			try {
				int count = Integer.parseInt(getInput("Anzahl"));
				p.setCount(count);
				break;
			}
			catch(Exception e) {
				System.out.println("Ungültige Zahl.");
			}
		}
		
		return p;
	}
	
	private String getInput(String label) {
		System.out.printf("%n%s: ", label);
		return scanner.nextLine().trim();
	}
}
