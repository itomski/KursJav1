package de.lubowiecki.products;

import java.util.ArrayList;
import java.util.List;

// CRUD: Create, Read, Update, Delete
public class ProductMemRepository {
	
	private int nextId;
	
	private ArrayList<Product> products = new ArrayList<>();
	
	public void add(Product product) {
		product.setId(++nextId);
		products.add(product);
	}
	
	public Product findById(int id) {
		
		for(Product p : products) {
			if(p.getId() == id)
				return p;
		}
		
		return null;
	}
	
	public int findIndexById(int id) {
		
		for(int i = 0; i < products.size(); i++) {
			if(products.get(i).getId() == id)
				return i;
		}
		
		return -1;
	}
	
	public List<Product> findAll() {
		return products;
	}
	
	public void update(Product product) {
		int index = findIndexById(product.getId());
		if(index >= 0)
			products.set(index, product); // Element an Position ersetzen
	}
	
	public void delete(Product product) {
		deleteById(product.getId());
	}
	
	public void deleteById(int id) {
		int index = findIndexById(id);
		if(index >= 0)
			products.remove(index); // Element an Position entfernen
	}
}
