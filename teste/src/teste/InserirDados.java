package teste;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InserirDados {

	public static void main(String[] args) throws SQLException {
		Scanner scan = new Scanner(System.in);
		boolean infoValidas = false;
		String nomeProduito;
		String descProduito;
		
		FactoryConnector conDB =  new FactoryConnector();
		Connection con = conDB.factoryConnector();
		
		String sql = "INSERT INTO PRODUTO(nome, descricao) values(?,?) ";
		PreparedStatement stm = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
		
		do {
			System.out.println("Digite o nome do produto:");
			nomeProduito = scan.nextLine();
			
			System.out.println("Digite a descrição da mercadoria:");
			descProduito = scan.nextLine();
			
			if(nomeProduito.isEmpty() || descProduito.isEmpty()) {
				System.out.println("todos so campos devem ser preencidos, revise a tente novamente.");
			}else {
				infoValidas = true;
			}
			
		}while(!infoValidas);
		
		try {		
			inserirDados(nomeProduito ,descProduito , stm);
		}catch(Exception e) {
			e.fillInStackTrace();
			con.rollback();
		}
	}	
	
	private static void inserirDados(String nome, String descricao, PreparedStatement stm) throws SQLException {
		
		stm.setString(1, nome);
		stm.setString(2, descricao);
		
		stm.execute();
		
		ResultSet result = stm.getGeneratedKeys();
		
		while(result.next()) {
			Integer id = result.getInt(1);
			System.out.println(id);
		}
	}
	
}
