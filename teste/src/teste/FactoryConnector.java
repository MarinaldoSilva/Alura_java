package teste;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FactoryConnector {
	
	public Connection factoryConnector() throws SQLException {	
		String urlDB = "jdbc:mysql://localhost/loja_virtual?useTimezone=true&serverTimezone = UTC";
		String user = "root";
		String pass = "segsuporte";
		
		return DriverManager.getConnection(urlDB, user, pass);
	}
}
