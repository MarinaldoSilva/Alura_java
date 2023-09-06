package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import modelo.Produto;

public class ProdutoDAO {
	
	private static Connection connection;
	
	public ProdutoDAO (Connection _connection) {
		this.connection = _connection;
	}
	
	public void salvarProdutoNoBnaco(Produto produto) throws SQLException {
		
		String sql = "insert into produto(nome, descricao)values(?,?)";
		
		try(PreparedStatement stm = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
			stm.setString(1, produto.getNome());
			stm.setString(2, produto.getDescricao());
			stm.execute();
			
			try(ResultSet resultset = stm.getGeneratedKeys()){
				while(resultset.next()) {
					produto.setId(resultset.getInt(1));
					System.out.println(produto.getId());
				}
			}
			
		}catch (Exception e) {
			e.printStackTrace();
			connection.rollback();
			System.out.println("Transação não efetuada");
		}
		
		
	}
	
	public void listarItensDB() throws SQLException{
		String sql = "SELECT id, nome, descricao from Produto";
		try(PreparedStatement stm = connection.prepareStatement(sql) ){	
		stm.execute();
			try(ResultSet result = stm.getResultSet()){
				while(result.next()) {
					System.out.println("--------------------------------------");
					Integer id = result.getInt("id");
					String nome = result.getString("nome"); 
					String desc = result.getString("descricao");
					System.out.println("ID: " + id + ", iTEM " + nome);
					System.out.println("Descrição: " + desc);
				}
			}
		}
	}
	
	public void excluirUnitario(int id) throws SQLException{
		String sql = "delete from produto where id = ?";
		try(PreparedStatement stm = connection.prepareStatement(sql)) {
			stm.setInt(1, id);
			stm.execute();
			
			Integer linhas = stm.getUpdateCount();
			System.out.println("Item de código " + linhas + " removido com sucesso");
				
		}
	}
	
//	public void atualizarItem(Produto produto) throws SQLException {
//		String sql = "UPDATE PRODUTO SET nome = ?, descricao = ? where id = ?";
//		try(PreparedStatement stm = connection.prepareStatement(sql)){
//			
//			produto.setId(1);
//			
//			stm.setInt(1, produto.getId());
//			stm.execute();
//			
//			Integer itemUpdate = stm.getUpdateCount();
//			System.out.println(itemUpdate + " Item(ns) atualizado(s)");
//		}
//	}
	
}
	

