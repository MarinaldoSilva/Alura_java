package testeOperacoesSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InserirDados {

	public static void main(String[] args) throws SQLException {
		
		FactoryConnector factoryConnector = new FactoryConnector();
		Scanner scan = new Scanner(System.in);
		String nomeProd, descProd;
		
		String sql = "INSERT INTO PRODUTO (nome, descricao) VALUES(? , ?)";
		
		try(Connection con = factoryConnector.iniciarConexao()){
			
			con.setAutoCommit(false);//o commit para o DB é feito de maneira manual agora, para executar tem que usar o con.commit();
			
			try(PreparedStatement stm = con.prepareStatement(sql,
					Statement.RETURN_GENERATED_KEYS)){
				
				System.out.println("Digite o nome do produto: ");
				nomeProd = scan.nextLine();
				
				System.out.println("Descrição do produto: ");
				descProd =  scan.nextLine();
				
				inserirDados(nomeProd, descProd, stm);
				con.commit();
				
			}catch(Exception e) {
				e.printStackTrace();
				System.out.println("Operação não finalizada");
				con.rollback();
			}
			
		} catch (Exception e) {
			System.out.println("Erro de acesso ao banco de dados, entre em contato com o suporte");
			e.printStackTrace();
		}
			
	}
	
	public static void inserirDados(String nomeProd, String descProd, PreparedStatement stm) throws Exception {
		stm.setString(1, nomeProd);
		stm.setString(2, descProd);
		stm.execute();
		
		try(ResultSet result = stm.getGeneratedKeys()){
			while (result.next()) {
				Integer id = result.getInt(1);
				System.out.println(id);
			}
		}
	} 
	
}
