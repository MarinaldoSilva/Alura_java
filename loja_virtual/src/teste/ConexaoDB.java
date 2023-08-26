package teste;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {
	public Connection iniciarConexao() throws SQLException {
		String dbUrl = "jdbc:mysql://localhost/sexshop?useTimezone=true&serverTimezone=UTC";
		String user = "root";
		String pass = "segsuporte";
		return DriverManager.getConnection(dbUrl, user, pass);
	}
}
