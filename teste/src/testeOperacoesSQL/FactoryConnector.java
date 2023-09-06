package testeOperacoesSQL;
import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class FactoryConnector {
	
	protected String urlDB = "jdbc:mysql://localhost/loja_virtual?useTimezone=true&serverTimezone = UTC";
	protected String user = "root";
	protected String pass = "segsuporte";

	protected DataSource dataSource;
	//construtor padrão
	public FactoryConnector() {
		//iniciandi conexão com o pooled de conexões para expor no  datasource 
		ComboPooledDataSource comboPooled = new ComboPooledDataSource();
		comboPooled.setJdbcUrl(urlDB);
		comboPooled.setUser(user);
		comboPooled.setPassword(pass);
		comboPooled.setMinPoolSize(5);
		comboPooled.setMaxPoolSize(20);
		
		this.dataSource = comboPooled;
	}
	
	
	public Connection iniciarConexao() throws SQLException {	
		return this.dataSource.getConnection();
	}
}
