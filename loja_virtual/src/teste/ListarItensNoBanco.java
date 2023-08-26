package teste;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ListarItensNoBanco {

	public static void main(String[] args) throws SQLException {
		
		FactoryConnection factoryConnection = new FactoryConnection();
		Connection con = factoryConnection.iniciarConecao(); 
		
		String sql = "SELECT ID, NOME, DESCRICAO FROM PRODUTO";
		
		//assinamos com a interface Statement e acessemos o metodo create.Statement() para usar os comandos do BD como INSERT INTO/ SELECT
		//no mundo java esses comandos são conhecidos como Statements
		PreparedStatement stm = con.prepareStatement(sql);
		
		//O metodo execute devolve true qnd o resultado e um java.sql.Resu ltSet e false caso contrario(update, delete e etc.)
		//o execute envia o comando para o banco de dados
		//boolean result = stm.execute("SELECT ID, NOME, DESCRICAO FROM PRODUTO");
		//List<> produtos = stm.execute("SELECT * FROM PRODUTO");
		
		stm.execute();
		ResultSet rst = stm.getResultSet();
		
		//o  =.next() verifica se tem um proximo item na lista
		
		while(rst.next()) {
		
			Integer id = rst.getInt("ID");
			System.out.print(id + "-" );
			
			String nome = rst.getString("NOME");
			System.out.println(nome);
			
			String descricao = rst.getString("DESCRICAO");
			System.out.println(descricao);
			
		}
		
		con.close();
	}
	
}