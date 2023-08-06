package pilha;

public class PilhaDeExecucaoComError {

	public static void main(String[] args)  {
		System.out.println("inicio do main");
		try {
			metodo1();
			//ArithmeticException | NullPointerException erro
		}catch(Exception erro) {
			System.out.println("ERRO: " + erro.getMessage());
			erro.printStackTrace();
		}
		System.out.println("fim metodo main");
	}
	
	public static void metodo1()  throws MinhaExcecao{
		System.out.println("inicio metodo 1"); 
		metodo2();
		System.out.println("fim metodo 1");
	}
	
	public static void metodo2() throws MinhaExcecao {
		System.out.println("inicio metodo 2 loop");
		//metodo2();
		throw  new MinhaExcecao("TESTE DA MINHA EXCEÇÃO COM ERROS CONTROLADOS");

		//System.out.println("fim metodo 2");
	}

}
