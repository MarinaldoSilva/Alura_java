package banco;

public abstract interface Autenticar {
	public abstract void setSenha(int senha);
	public abstract boolean autenticarSenha(int senha);
}
