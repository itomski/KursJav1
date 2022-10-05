package de.lubowiecki.products;

import java.time.LocalDate;

public class PershableProduct extends Product {
	
	private LocalDate expiryDate;

	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PershableProduct [expiryDate=");
		builder.append(expiryDate);
		builder.append(", id=");
		builder.append(getId());
		builder.append(", createdAt=");
		builder.append(getCreatedAt());
		builder.append(", name=");
		builder.append(getName());
		builder.append(", description=");
		builder.append(getDescription());
		builder.append(", count=");
		builder.append(getCount());
		builder.append(", price=");
		builder.append(getPrice());
		builder.append("]");
		return builder.toString();
	}
}
