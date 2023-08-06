package banco;

public class autenticarSenha {
	
	private int senha;
	
	public boolean autenticarSenha(int senha) {
		
		if(this.senha == senha) {
			return true;
		}else {
			return false;
		}
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
}
