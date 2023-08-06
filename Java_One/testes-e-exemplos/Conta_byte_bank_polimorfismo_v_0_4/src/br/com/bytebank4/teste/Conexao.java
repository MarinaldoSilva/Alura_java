package br.com.bytebank4.teste;

import br.com.bytebank4.banco.Conexao.*;

@SuppressWarnings("unused")
public class Conexao {

	@SuppressWarnings("static-access")
	public static void main(String[] args)  throws Exception {	
		
		try(br.com.bytebank4.banco.Conexao con =  new br.com.bytebank4.banco.Conexao()){
			
			con.lerDados();
			
		}catch(Exception e) {
			e.getMessage();
			//System.out.println(e.getMessage());
		
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
//		
	}
}
