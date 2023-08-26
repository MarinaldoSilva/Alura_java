package teste;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class testeLojaSexoShop {
	public static void main(String[] args) throws SQLException{
		
		ConexaoDB conexaoDB = new ConexaoDB();
		Connection connection =  conexaoDB.iniciarConexao();
		
		Statement stm = connection.createStatement();
		stm.execute("SELECT CODIGO, NOME, DESCRICAO FROM MERCADORIAS");
		
		ResultSet result = stm.getResultSet();
		
		while (result.next()) {
			Integer codigo = result.getInt("codigo");
			String nome = result.getString("nome");
			String descricao = result.getNString("descricao");
			
			System.out.println("Cód: " + codigo);
			System.out.println("Nome: " + nome);
			System.out.println("Descricão: " + descricao);
		}
		
		

	}
}
