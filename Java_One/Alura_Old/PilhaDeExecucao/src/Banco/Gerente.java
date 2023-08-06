package Banco;

public class Gerente extends FuncionarioAutenticado implements Autenticacao{

	private ComposicaoAutenticador validadorComposicao;
	
	public Gerente() {
		this.validadorComposicao = new ComposicaoAutenticador();
	}
	
	public double getBonificacao() {
		return super.getSalario();
	}

	@Override
	public boolean autenticar(int senha) {
		return validadorComposicao.autenticar(senha); 
	}
	
	@Override
	public int getSenha() {
		return super.getSenha();
	}
	
	@Override
	public boolean setTrocaSenha(int senha) {
		return this.validadorComposicao.setSenha(senha);
	}
}
