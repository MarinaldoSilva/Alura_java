package teste;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TetseInsercaoNoBanco {

public static void main(String[] args) throws SQLException {
		
		FactoryConnection factoryConnection = new FactoryConnection();
		Connection con = factoryConnection.iniciarConecao(); 
			
		//inicio mostar itens do banco
		Statement stm = con.createStatement();
		
		//inicio inserção
		//qnd executar o insert vai retornar tbm o id gerado
		stm.execute("INSERT INTO PRODUTO(NOME, DESCRICAO)VALUES('REDMI NOTE 12','128GB SPDG 720G')", Statement.RETURN_GENERATED_KEYS );
		ResultSet result = stm.getGeneratedKeys();

		while(result.next()) {
			/*
			String nome = result.getString("nome");
			String descricao = result.getNString("descricao");
			*/
			//a primeira coluna em sql não é zero(como os arrays em java) começam com o nº1
			Integer cod = result.getInt(1);
			System.out.println("O id criado foi: " + cod);
		}
		//fim inserção
	}
}
