package Banco;

public class Cliente implements Autenticacao{
	
	@SuppressWarnings("unused")
	private int senha;
	
	private ComposicaoAutenticador validadorComposicao;
	
	public Cliente() {
		this.validadorComposicao = new ComposicaoAutenticador();
	}
	
	@Override
	public boolean autenticar(int senha) {
		
		return validadorComposicao.autenticar(senha);
	}

	@Override
	public boolean setTrocaSenha(int senha) {
		return validadorComposicao.setSenha(senha);
		
	}

}
