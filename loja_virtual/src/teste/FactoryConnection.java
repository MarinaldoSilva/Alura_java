package teste;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FactoryConnection {
public Connection iniciarConecao() throws SQLException{
		
		String dbUrl = "jdbc:mysql://localhost/loja_virtual?useTimezone=true&serverTimezone=UTC";
		String user  = "root";
		String senha = "segsuporte";
		
		return DriverManager.getConnection(dbUrl, user, senha);
	}
}
