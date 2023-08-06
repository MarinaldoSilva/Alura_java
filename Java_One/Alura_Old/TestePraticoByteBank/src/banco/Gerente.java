package banco;

public class Gerente extends Funcionario implements Autenticar{
	
	private autenticarSenha autenticador;
	private int senha;
	
	public Gerente() {
		this.autenticador = new autenticarSenha();
	}
	
	@Override
	public boolean autenticarSenha(int senha) {
		autenticador.autenticarSenha(senha);
		return false;
	}
	
}
