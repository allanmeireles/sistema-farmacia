package dao;

import entities.client;

public interface ClientDAO {
	
	void insert(client obj);
	void update(client obj);
	void deleteByID(int id);
	client get(int id); 
	
}
