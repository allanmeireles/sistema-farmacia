package application;
import java.sql.Connection;

import dao.ClientDAO;
import dao.DaoFactory;
import db.DB;
import entities.client;
import entities.medicine;
import implement.ClientDaoJDBC;


public class Program {

	public static void main(String[] args) {
		
		ClientDAO clientdao = DaoFactory.createClientDAO();
		
		String client = clientdao.get(1);
		
		System.out.println(client);
		
	}
}
