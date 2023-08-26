package teste;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EvitandoSqlInjection {
	
	public static void main(String[] args) throws SQLException {
			
		FactoryConnection factoryConnection = new FactoryConnection();
		Connection con = factoryConnection.iniciarConecao(); 
		con.setAutoCommit(false);
		
		String sql = "INSERT INTO PRODUTO(NOME, DESCRICAO)VALUES(? , ?)";
		
		try {
			PreparedStatement stm = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			
			adicionarVariaveis(" SAMSUNG TV 55 ", " ANDROID 8K", stm);
			adicionarVariaveis(" XBOX SERIES S ", " 500GB SSD", stm);
			adicionarVariaveis(" PLAYSTATION 5", " 85GB SSD", stm);
			adicionarVariaveis(" TV PHILCO 55 ", " FULL HD SMART ", stm);
			adicionarVariaveis("", "", stm);
			
			con.commit();
			stm.close();
			con.close();
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Transação não foi realizada, ações desfeitas");
			con.rollback();
		}
		
		
	}

	private static void adicionarVariaveis(String nome, String descricao, PreparedStatement stm) throws SQLException  {
		stm.setString(1, nome);
		stm.setString(2, descricao);
		
//		if(nome.equals(" TV PHILCO 55 ")) {
//			throw new RuntimeException(nome + "" + descricao + ": Item não pode seer adicionado");
//		}
		
		stm.execute();

		ResultSet result = stm.getGeneratedKeys();
				
		while(result.next()) {
			Integer cod = result.getInt(1);
			System.out.println("O id criado foi: " + cod);
		}
		
	}
}
