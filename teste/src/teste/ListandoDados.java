package teste;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ListandoDados {

	public static void main(String[] args) throws SQLException{
		FactoryConnector conDB = new FactoryConnector();
		Connection con = conDB.factoryConnector();
		String sql = "SELECT id, nome, descricao from Produto";
		
		PreparedStatement stm = con.prepareStatement(sql);
		listarItensDB(stm);
	
	}
	
	private static void listarItensDB(PreparedStatement stm) throws SQLException{
		
		stm.execute();
		ResultSet result = stm.getResultSet();
		
		while(result.next()) {
			System.out.println("--------------------------------------");
			Integer id = result.getInt("id");
			System.out.println(id);
			String nome = result.getString("nome"); 
			System.out.println(nome);
			String desc = result.getString("descricao");
			System.out.println(desc);
		}
	}

}
