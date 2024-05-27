package implement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(client obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteByID(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String get(int id) {
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
				return obj.toString(); 
			} 
			return null; 
		}
		catch(SQLException e) {
			throw new DbException(e.getMessage());
		}
		finally {
			DB.closeConnection();
		}
		
	}

}
