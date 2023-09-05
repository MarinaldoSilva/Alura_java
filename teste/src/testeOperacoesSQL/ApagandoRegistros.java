package testeOperacoesSQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ApagandoRegistros {

	public static void main(String[] args) throws SQLException {
		FactoryConnector conDB = new FactoryConnector();
		Connection con = conDB.iniciarConexao();
		String sql = "DELETE FROM PRODUTO WHERE id >= ? ";
		
		PreparedStatement stm = con.prepareStatement(sql);
		LinhasRemovidas(stm);
		
	}
	
	private static void LinhasRemovidas(PreparedStatement stm) throws SQLException {
		
		try {
			
			stm.setInt(1, 1);
			stm.execute();
			Integer linhasApagadas = stm.getUpdateCount();
		
			if(linhasApagadas != 0) {
				System.out.println(linhasApagadas +  " registro removido");
			}else {
				System.out.println("Nenhum registo removido");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
