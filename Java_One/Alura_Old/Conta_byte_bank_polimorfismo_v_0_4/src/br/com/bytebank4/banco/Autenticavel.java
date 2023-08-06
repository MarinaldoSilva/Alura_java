package br.com.bytebank4.banco;
//contrato autenticavel
	//quem assina o contrato precisa, implementar 
		//metodo setSenha
		//metodo autentica

public abstract interface Autenticavel{
	public abstract boolean setSenha(int senha);
	public abstract boolean autenticarSenha(int senha);
	
}
