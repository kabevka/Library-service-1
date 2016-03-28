package edu.ita.softserve.dao;

import java.util.List;

public interface GenericDao<T,V> {
	
	void add(T t);
	T findById(V id);
	void update(T t);
	void delete(T t);
	List<T> getAll();
 
}
