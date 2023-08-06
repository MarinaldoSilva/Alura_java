package br.com.bytebank4.banco;

public class Administrador extends Funcionario implements Autenticavel{
	
	private AutenticacaoUtil util;
	
	public Administrador() {
		this.util = new AutenticacaoUtil();
	}
	
	public double getBonificacao(){
		return super.getSalario() * 0.6;
	}

	@Override
	public boolean setSenha(int senha) {
		return this.util.setSenha(senha);
	}

	@Override
	public boolean autenticarSenha(int senha) {
		return this.util.autenticarSenha(senha);
	}
}
