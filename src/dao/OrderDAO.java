package dao;

import entities.order;

public interface OrderDAO {

	void insert(order obj);
	void update(order obj);
	void deleteByID(int id);
	String get(int id);  
	
}
