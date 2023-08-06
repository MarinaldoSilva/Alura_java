package pilha;

public class PilhaDeExecucao {

	public static void main(String[] args) throws MinhaExcecao  {
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
	
	public static void metodo1()  {
		System.out.println("inicio metodo 1"); 
		try {
			metodo2();
		} catch (MinhaExcecao e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("fim metodo 1");
	}

	public static void metodo2()  throws MinhaExcecao{
		System.out.println("inicio metodo 2");	
		//jogo em cima da pilha.
		throw new MinhaExcecao("deu ruim");
		
	
		//System.out.println("fim metodo 2");	
	}
	
}
