package br.com.bytebank4.banco;

public class AutenticacaoUtil {
	
	private int senha;
	
	public boolean setSenha(int senha) {
		this.senha = senha;
		return true;
	}
	
	public boolean autenticarSenha(int senha) {
		if(this.senha == senha) {
			return true;
		}else {
			return false;
		}
	}
}
