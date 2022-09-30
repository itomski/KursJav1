package de.lubowiecki.jav1.uebung4;

import java.util.Scanner;

// Controller
public class App {
	
	private final ProductRepository repository = new ProductRepository();
	private final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		new App().run();
	}
	
	private void run() {
		
		while(true) {
			// SWITCH
		}
		
//		repository.add(new Product("Hammer", "Ganz toller Hammer aus Titan", 100, 35.99));
//		repository.add(new Product("Zange", "Bla bla bla", 200, 19.99));
//		
//		for(Product p : repository.findAll()) {
//			System.out.println(p);
//		}
	}

}
