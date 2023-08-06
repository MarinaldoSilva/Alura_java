package pilha;

public class ConexaoException extends Exception {

	class Conexao{
		public void fecha() throws ConexaoException{
			System.out.println("ok");
		}
	}
		
}

