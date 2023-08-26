package teste;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class testeConexa {
	
		public static void main(String []ags) {
			
			try {
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost/loja_virtual?useTimezone=true&serverTimezone=GMT", "root", "segsuporte");
				System.out.println("Conexão finalizada");
				con.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		
		}
	
}
