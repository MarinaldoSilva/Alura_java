package br.com.pacotes.teste.execucao;

import br.com.pacotes.teste.classes.*;

public class teste1 {

	public static void main(String[] args)  {
		
		try(Conexao con = new Conexao()){	
			con.lerDados();

		}catch(Exception e) {
			e.getMessage();
			System.out.println(e.getMessage());		
		}
		
		//metodo2
		
//		banco.Conexao con = new banco.Conexao();
//		
//		try{
//			con.lerDados();
//		}catch(Exception e) {
//			String erro = e.getMessage();
//			System.out.println(erro);
//		}finally {
//			if(con != null) {
//				System.out.println("finally");
//				con.close();
//			}
//		}
}

//	@Override
//	public void close() throws Exception {
//		// TODO Auto-generated method stub
//	}
}
