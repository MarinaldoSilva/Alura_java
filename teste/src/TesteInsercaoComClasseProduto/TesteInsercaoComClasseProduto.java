package TesteInsercaoComClasseProduto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

import modelo.Produto;
import testeOperacoesSQL.*;
public class TesteInsercaoComClasseProduto {

	public static void main(String[] args) throws SQLException{
		
		//FactoryConnector conn = new FactoryConnector();
		
		Produto produto = new Produto("comoda", "vertical 2mts");
		
		try(Connection con = new FactoryConnector().iniciarConexao() ){
			String sql = "insert into produto(nome, descricao)values(?,?)";
			PreparedStatement stm = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			stm.setString(1, produto.getNome());
			stm.setString(2, produto.getDescricao());
			stm.execute();
			
			try( ResultSet resultset = stm.getGeneratedKeys()){
				while(resultset.next()) {
					produto.setId(resultset.getInt(1));
					System.out.println(produto);
				}
			}
			
		}
		
		

	}

}
