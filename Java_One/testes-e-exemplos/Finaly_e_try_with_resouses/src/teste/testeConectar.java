package teste;
import modelo.*;
public class testeConectar {

	public static void main(String[] args) throws Exception {
	
		try(modelo.Conectar con = new modelo.Conectar()){
			con.lerDados();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
