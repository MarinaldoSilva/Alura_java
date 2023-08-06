package teste;

public class testeConectar {

	public static void main(String[] args) throws Exception {
	
		try(modelo.Concexao con = new modelo.Concexao()){
			con.leDados();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
