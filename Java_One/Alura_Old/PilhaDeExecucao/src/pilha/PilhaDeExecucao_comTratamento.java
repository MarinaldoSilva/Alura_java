package pilha;

public class PilhaDeExecucao_comTratamento {

	public static void main(String[] args) {
		System.out.println("inicio do main");
		try {
			metodo1();
			//ArithmeticException | NullPointerException erro
		}catch(Exception erro) {
			System.out.println("ERRO: " + erro.getCause());
			erro.printStackTrace();
		}
		System.out.println("fim metodo main");
	}
	
	public static void metodo1() throws MinhaExcecao{
		System.out.println("inicio metodo 1"); 
		metodo2();
		System.out.println("fim metodo 1");
	}
	
	public static void metodo2() throws MinhaExcecao {
		System.out.println("inicio metodo 2");
		for(int i =1; i<=5; i++) {
			System.out.println(i);
			Conta conta = new Conta();
			conta.deposita(1);
		}
		System.out.println("fim metodo 2");
	}

}
