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
		
		System.out.println("=== TEST 1: getClient===");
		String client = clientdao.get(1);
		
		System.out.println(client);
		
		System.out.println("=== TEST 2: INSERT===");
		client client2 = new client("Júnior Dantas","Rua Laranjeira","12343-321354");
		clientdao.insert(client2);
		System.out.println("Inserted! New id = " + client2.getId());
	}
}
