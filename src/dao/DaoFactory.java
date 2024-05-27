package dao;

import db.DB;
import implement.ClientDaoJDBC;

public class DaoFactory {
	
	public static ClientDAO createClientDAO() {
		return new ClientDaoJDBC(DB.getConnection());
	}
	

}
