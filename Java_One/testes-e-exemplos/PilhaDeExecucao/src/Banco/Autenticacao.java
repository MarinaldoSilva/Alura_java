package Banco;

public abstract interface Autenticacao {
	//uma interface não tem implemnetação. é algo abstrato/ interface é um alternativa ao plymorfismo
	//polymorfismo -> interface
	public abstract boolean autenticar(int senha);
	public abstract boolean setTrocaSenha(int senha);
	
}
