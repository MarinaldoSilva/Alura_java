package teste;
import modelo.Conectar;

public class TesteConexao {
	
	public static void main(String[] args) {
		
		try(modelo.Conectar con = new modelo.Conectar()){
			
			con.lerDados();
			
		}catch(Exception e) {
		
			System.out.println(e.getMessage());
		}	
	}
}


//Concexao con =  null;
//		
//		try{
//			con = new Concexao();
//			con.leDados();
//		}catch(Exception e) {
//			System.out.println(e.getMessage());
//		}
//		finally{
//		System.out.println("");
//			if(con != null ){
//			con.close();
//			}
//		
//		}

