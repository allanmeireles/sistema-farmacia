package dao;

import entities.medicine;

public interface MedicineDAO {
	
	void insert(medicine obj);
	void update(medicine obj);
	void deleteByID(int id);
	String get(int id); 
	
	

}
