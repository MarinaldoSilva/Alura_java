package TesteInsercaoComClasseProduto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import DAO.ProdutoDAO;
import modelo.Produto;


import testeOperacoesSQL.*;
public class OperacoesSQLComProdutos {

	public static void main(String[] args) throws SQLException{
		Scanner scan = new Scanner(System.in);
		Produto produto1 = new Produto("java", "swing java");
		Produto produto = new Produto("motorola", "razer 2");
		
		try(Connection con = new FactoryConnector().iniciarConexao()){
			ProdutoDAO produtoDAO = new ProdutoDAO(con);
			
			//contolerProduto.salvarProdutoNoBnaco(produto1);
			//contolerProduto.salvarProdutoNoBnaco(produto);
			//contolerProduto.listarItensDB();
			//contolerProduto.atualizarItem(produto);
			
			//contolerProduto.excluirUnitario(201);
			//contolerProduto.listarItensDB();
			
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("Erro de acesso ao banco de dados");
		}
		
		
		
		try(Connection con = new FactoryConnector().iniciarConexao()){
			ProdutoDAO controlerProduto = new ProdutoDAO(con);
			
			controlerProduto.listarItensDB();
			System.out.println("\n");
			
			System.out.println("Qual id deseja excluir do banco de itens?");
			int id = scan.nextInt();
			
			controlerProduto.excluirUnitario(id);
			controlerProduto.listarItensDB();
		}
	}
}
