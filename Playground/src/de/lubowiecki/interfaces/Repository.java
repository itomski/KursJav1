package de.lubowiecki.interfaces;

import java.util.List;

public interface Repository<T> {
	
	void add(T t);
	
	List<T> findAll();
	
	T findOne(int id);
	
	void edit(T t, int id);
	
	void delete(T thing);
	
	void delete(int id);
}
