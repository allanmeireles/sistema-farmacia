package application;
import java.sql.Connection;
import db.DB;
import entities.client;


public class Program {

	public static void main(String[] args) {
		
		client obj = new client(1,"allan","rua azul","40028922");
		System.out.println(obj);
		
	}
}
