package banco;

public class Funcionario {

		private int senha, matricula;
		private String nome;
		
		public int getSenha() {
			return senha;
		}
		public void setSenha(int senha) {
			this.senha = senha;
		}
		
		public int getMatricula() {
			return matricula;
		}
		public void setMatricula(int matricula) {
			this.matricula = matricula;
		}
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
}
