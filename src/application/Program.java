package application;
import java.sql.Connection;
import java.util.Scanner;

import dao.ClientDAO;
import dao.DaoFactory;
import db.DB;
import entities.client;
import entities.medicine;
import implement.ClientDaoJDBC;


public class Program {

	public static void main(String[] args) {
		
		ClientDAO clientdao = DaoFactory.createClientDAO();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=== TEST 1: getClient===");
		client client = clientdao.get(7);
		
		System.out.println(client);
		
		//System.out.println("=== TEST 2: INSERT===");
		//client client2 = new client("Júnior Dantas","Rua Laranjeira","12343-321354");
		//clientdao.insert(client2);
		//System.out.println("Inserted! New id = " + client2.getId());
		
		System.out.println("=== TEST 3: UPDATE===");
		//client client3 = clientdao.get(5);
		//client3.setName("William"); 
		//clientdao.update(client3);
		//System.out.println("Updated completed!");
		
		System.out.println("=== TEST 4: DELETE===");
	   // System.out.println("Enter id for delete test");
	    //int id = sc.nextInt();
	    //clientdao.deleteByID(id);
	    //System.out.println("Delete completed");
		
			
		
	}
}
