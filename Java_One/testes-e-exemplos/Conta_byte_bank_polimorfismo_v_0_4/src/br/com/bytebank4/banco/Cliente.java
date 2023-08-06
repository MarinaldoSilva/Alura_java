package br.com.bytebank4.banco;

public class Cliente implements Autenticavel{
	
	
	private AutenticacaoUtil util;
	
	public Cliente(){
		this.util  = new AutenticacaoUtil();
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
