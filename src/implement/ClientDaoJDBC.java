package implement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import dao.ClientDAO;
import db.DB;
import db.DbException;
import entities.client;

public class ClientDaoJDBC implements ClientDAO {

	private Connection conn; 
	
	public ClientDaoJDBC(Connection conn) {
		this.conn = conn; 	
	}
	
	@Override
	public void insert(client obj) {
		PreparedStatement st = null;
		try {
			st = conn.prepareStatement(
					"INSERT INTO cliente " +
			        "(nome,endereco,telefone) " +
					"VALUES " + 
			        "(?, ?, ?)",
			        Statement.RETURN_GENERATED_KEYS);
			
			st.setString(1, obj.getName());
			st.setString(2, obj.getAddress());
			st.setString(3, obj.getTelephone());
			
			int rowsAffected = st.executeUpdate();
			
			if(rowsAffected > 0) {
				ResultSet rs = st.getGeneratedKeys();
				if(rs.next()) {
					int id = rs.getInt(1); 
					obj.setId(id);
				}
			}
			else {
				throw new DbException("Unexpected error! No rows affected");
			}
		}
		catch(SQLException e) {
			throw new DbException(e.getMessage());
		}
		finally {
			DB.closeStatement(st);
		}
		
		
		
	}

	@Override
	public void update(client obj) {
		PreparedStatement st = null;
		try {
			st = conn.prepareStatement(
					"UPDATE cliente " +
			        "SET nome = ?,endereco = ?,telefone = ? " +
					"WHERE id = ?");
			
			st.setString(1, obj.getName());
			st.setString(2, obj.getAddress());
			st.setString(3, obj.getTelephone());
			st.setInt(4, obj.getId()); 
			
			st.executeUpdate(); 
		}	
		catch(SQLException e) {
			throw new DbException(e.getMessage());
		}
		finally {
			DB.closeStatement(st);
		}
		
	}

	@Override
	public void deleteByID(int id) {
		PreparedStatement st = null; 
		try {
		st = conn.prepareStatement("DELETE FROM cliente WHERE id = ?");
		st.setInt(1, id);
		st.executeUpdate();
		}
		catch(SQLException e) {
			throw new DbException(e.getMessage());
		}
		finally {
			DB.closeStatement(st);	
		}
	}

	@Override
	public client get(int id) {
		PreparedStatement st = null;
		ResultSet rs = null; 
		try {
			st = conn.prepareStatement(
				"SELECT cliente.* " +
			    "FROM cliente " + 
				"WHERE id = ? ");
			
			st.setInt(1, id);
			rs = st.executeQuery();
			if (rs.next()) {
				client obj = new client(); 
				obj.setId(rs.getInt("id"));
				obj.setName(rs.getString("nome"));
				obj.setAddress(rs.getString("endereco"));
				obj.setTelephone(rs.getString("telefone"));
				System.out.println("Cliente gerado");
				return obj; 
			} 
			return null; 
		}
		catch(SQLException e) {
			throw new DbException(e.getMessage());
		}
		finally {
			DB.closeStatement(st);
		}
	}

}
