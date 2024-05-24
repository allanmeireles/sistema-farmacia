package application;
import java.sql.Connection;
import db.DB;
import entities.client;
import entities.medicine;


public class Program {

	public static void main(String[] args) {
		
		client obj = new client(1,"allan","rua azul","40028922");
		
		medicine medicine = new medicine(1,"dipirona",23,2);
		
		System.out.println(medicine);
		
	}
}
