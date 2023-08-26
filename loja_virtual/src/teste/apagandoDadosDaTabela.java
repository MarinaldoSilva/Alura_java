package teste;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class apagandoDadosDaTabela {
	@SuppressWarnings("unused")
	public static void main(String[] args) throws SQLException {
		
		
		FactoryConnection factoryConnection = new FactoryConnection();
		Connection con = factoryConnection.iniciarConecao(); 
		
		String sql = "DELETE FROM PRODUTO WHERE ID > ? ";
		int id = 133;
		
		PreparedStatement stm = con.prepareStatement(sql);
		stm.setInt(1, id);
		stm.execute();
		
		//retorna qnts linhas forma modificadas aopos executado
		stm.getUpdateCount();
		
		Integer linhasModificadas = stm.getUpdateCount();
		
		if(linhasModificadas != null) {
			System.out.println(linhasModificadas + " itens apagados");
		}else {
			System.out.println("Erro ao remover item : Item inexistente");
		}
		
	}
}
