package loja_virtual_alura;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class testeListagem {

	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/loja_virtual?useTimezone=true&serverTimezone=GMT", "root", "segsuporte");
		System.out.println("Conexão finalizada");
		
		//assinamos com a interface Statement e acessemos o metodo create.Statement() para usar os comandos do BD como INSERT INTO/ SELECT
		//no mundo java esses comandos são conhecidos como Statement
		Statement stm = con.createStatement();
		
		//o execute("comando sql) retorna somente se vai ter um retorno ou não, e mostra um true para sim e false p/ não
		boolean result = stm.execute("SELECT ID, NOME, DESCRICAO FROM PRODUTO");
		//List<> produtos = stm.execute("SELECT * FROM PRODUTO");
		
		ResultSet rst = stm.getResultSet();
		
		//o  =.next() verifica se tem um proximo item na lista
		while(rst.next()) {
			Integer id = rst.getInt("ID");
			System.out.print(id + "-" );
			
			String nome = rst.getString("NOME");
			System.out.println(nome);
			System.out.println("teste");
			String descricao = rst.getString("DESCRICAO");
			System.out.println(descricao);
			
		}
		
		con.close();
	}

}
