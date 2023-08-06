package Banco;

public class Administrador extends FuncionarioAutenticado implements Autenticacao {

	private ComposicaoAutenticador validadorComposicao;
	
	//toda vez que iniciar um adm vai iniciar uma composicao(referencia para compisção de reutilização de codigo da herança)
		public Administrador() {
			this.validadorComposicao =  new ComposicaoAutenticador();
		}
	
	public double getBonificacao() {
		//adm tem bonus de 60% do salario
		return super.getSalario() * 0.6;
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
		super.setSenha(senha);
		return true;
	}
	
}
