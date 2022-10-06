package de.lubowiecki.locale;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class MultiLangTest {
	
	public static void main(String[] args) {
		
		final Scanner scanner = new Scanner(System.in);
		
		Locale.setDefault(Locale.FRANCE);
		
		ResourceBundle labels = ResourceBundle.getBundle("de.lubowiecki.locale.pack");
		
		System.out.println(labels.getString("headline"));
		
		System.out.println(labels.getString("questioin.name"));
		
		System.out.print(labels.getString("input") + " ");
		String name = scanner.nextLine();
		
		System.out.println(labels.getString("answer.name") + " " + name);
	}
}
