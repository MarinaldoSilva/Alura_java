package teste;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaInsercaoComParametro {
	
	public static void main(String[] args) throws SQLException {
		
			String nome = "vem de nome";
			String descricao = "vem de descricao";
			String sql = "INSERT INTO PRODUTO(NOME, DESCRICAO)VALUES('" + nome +"','" + descricao + "')";
			
			FactoryConnection factoryConnection = new FactoryConnection();
			Connection con = factoryConnection.iniciarConecao(); 
					
			Statement stm = con.createStatement();
			
			stm.execute(sql,Statement.RETURN_GENERATED_KEYS );
			ResultSet result = stm.getGeneratedKeys();
				
			while(result.next()) {
				Integer cod = result.getInt(1);
				System.out.println("O id criado foi: " + cod);
			}
	
		}
}
