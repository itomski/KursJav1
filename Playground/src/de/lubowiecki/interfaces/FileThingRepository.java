package de.lubowiecki.interfaces;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class FileThingRepository implements Repository<Thing> {

	private List<Thing> things;
	
	public FileThingRepository() {
		// Mit einer Datei verbinden und Daten einlesen
		things = readFromFile();
	}
	
	private List<Thing> readFromFile() {
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.ser"))) {
			return (List<Thing>)ois.readObject(); // Daten werden gelesen und deserialisiert
		}
		catch(IOException | ClassNotFoundException e) {
			//e.printStackTrace();
			return new ArrayList<>();
		}
	}
	
	private void saveToFile() {
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.ser"))) {
			oos.writeObject(things); // Thing-Liste wird serialisiert und gespeichert
		}
		catch(IOException e) {
			//e.printStackTrace();
			// Daten konnten nicht gespeichert werden
		}
	}

	@Override
	public void add(Thing thing) {
		things.add(thing);
		saveToFile();
	}

	@Override
	public List<Thing> findAll() {
		return things;
	}

	@Override
	public Thing findOne(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void edit(Thing thing, int id) {
		// TODO Auto-generated method stub
	}

	@Override
	public void delete(Thing thing) {
		// TODO Auto-generated method stub
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
	}
}
