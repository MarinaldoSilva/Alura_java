package Banco;

public class FuncionarioAutenticado extends Funcionario {

	private int senha;
	
		
	@Override
	public double getBonificacao() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public int getSenha() {
		return this.senha;
	}

}
