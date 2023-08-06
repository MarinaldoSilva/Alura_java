package br.com.bytebank4.banco;

public class SistemaInterno {
	private int senha = 15;//qnd não tem valor definido é zero;
	
	public void autenticacaoSenha(Autenticavel fa) {
		if(fa.autenticarSenha(this.senha)) {
			System.out.println("acesso liberado");
		}else {
			System.out.println("Acesso negado");
		}
	}
}
