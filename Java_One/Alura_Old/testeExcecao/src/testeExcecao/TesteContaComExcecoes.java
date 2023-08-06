package testeExcecao;

public class TesteContaComExcecoes {

	public static void main(String[] args) {//throws MinhaExcecao na assinatura do metodo
		Conta conta = new Conta();
		
		try {
			conta.deposita(100);
		}catch(MinhaExcecao e) {
			System.out.println(e.getMessage());
		}
	}

}
