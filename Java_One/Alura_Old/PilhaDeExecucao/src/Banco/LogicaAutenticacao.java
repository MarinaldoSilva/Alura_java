package Banco;

public class LogicaAutenticacao {
	
	private int senha = 2020;
	
	public boolean autenticarSenha(int senha) {
		if(this.senha == senha) {
			System.out.println("Logica de autenticacao: acesso liberado");
			return true;
		}else {
			System.out.println("Logica de autenticacao: acesso negado");
			return false;
		}
	}
	public boolean setSenha(int senha) {
		this.senha = senha;
		return true;
	}
}
