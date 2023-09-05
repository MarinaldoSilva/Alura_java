package testeOperacoesSQL; 

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ListandoDados {

	public static void main(String[] args) throws SQLException{
		
		FactoryConnector conDB = new FactoryConnector();
		
		try(Connection con = conDB.iniciarConexao()){
			
			String sql = "SELECT id, nome, descricao from Produto";
			
			try(PreparedStatement stm = con.prepareStatement(sql)){
				listarItensDB(stm);
			}
		}
	}
	
	
	
	private static void listarItensDB(PreparedStatement stm) throws SQLException{
		
		stm.execute();
		
		try(ResultSet result = stm.getResultSet()){
			
			while(result.next()) {
			
				System.out.println("--------------------------------------");
				Integer id = result.getInt("id");
				String nome = result.getString("nome"); 
				String desc = result.getString("descricao");

				System.out.println("ID: " + id + ", iTEM " + nome);
				System.out.println("Descrição: " + desc);
			}
		}
	}
}
