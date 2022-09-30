package de.lubowiecki.jav1.uebung4;

import java.time.LocalDate;

public class Product {
	
	private int id, count;
	
	private final LocalDate createdAt;
	
	private String name, description;
	
	private double price;
	
	public Product() {
		createdAt = LocalDate.now();
	}

	public Product(int id, String name, String description, int count, double price) {
		this();
		this.id = id;
		this.name = name;
		this.description = description;
		this.count = count;
		this.price = price;
	}
	
	public Product(String name, String description, int count, double price) {
		this(0, name, description, count, price);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getCreatedAt() {
		return createdAt;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Product [id=");
		builder.append(id);
		builder.append(", createdAt=");
		builder.append(createdAt);
		builder.append(", name=");
		builder.append(name);
		builder.append(", description=");
		builder.append(description);
		builder.append(", count=");
		builder.append(count);
		builder.append(", price=");
		builder.append(price);
		builder.append("]");
		return builder.toString();
	}
	
	
}
