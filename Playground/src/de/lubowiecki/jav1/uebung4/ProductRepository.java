package de.lubowiecki.jav1.uebung4;

import java.util.ArrayList;
import java.util.List;

// CRUD: Create, Read, Update, Delete
public class ProductRepository {
	
	private int nextId;
	
	private ArrayList<Product> products = new ArrayList<>();
	
	public void add(Product product) {
		product.setId(++nextId);
		products.add(product);
	}
	
	public Product findById(int id) {
		throw new UnsupportedOperationException("Noch nicht implementiert");
	}
	
	public List<Product> findAll() {
		return products;
	}
	
	public void update(Product product, int id) {
		throw new UnsupportedOperationException("Noch nicht implementiert");
	}
	
	public void delete(Product product) {
		throw new UnsupportedOperationException("Noch nicht implementiert");
	}
	
	public void deleteById(int id) {
		throw new UnsupportedOperationException("Noch nicht implementiert");
	}
}
