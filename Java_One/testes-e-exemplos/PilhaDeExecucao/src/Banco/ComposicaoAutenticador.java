package Banco;

public class ComposicaoAutenticador {
	
	private LogicaAutenticacao validacao;
	
	@SuppressWarnings("unused")
	private int senha;
	
	public boolean autenticar(int senha) {
		
		if(validacao.autenticarSenha(senha)) {
			System.out.println("acesso liberado");
			return true;
		}else {
			System.out.println("Acesso negado");
			return false;
		}
	}

	
	public boolean setSenha(int senha) {
		this.senha = senha;
		return true;
	}
}
