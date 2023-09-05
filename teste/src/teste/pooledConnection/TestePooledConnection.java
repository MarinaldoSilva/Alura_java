package teste.pooledConnection;
import java.sql.SQLException;

import testeOperacoesSQL.*;
public class TestePooledConnection  {

	public static void main(String[] args) throws SQLException {
		FactoryConnector factoryConnector = new FactoryConnector();
		
		for(int i =0; i<50; i++) {
			factoryConnector.iniciarConexao();
			System.out.println("con nº " + i);
		}
		
	}

}
