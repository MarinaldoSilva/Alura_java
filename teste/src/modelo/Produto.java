package modelo;
public class Produto {
	
		private String nome;
		private String descricao;
		private Integer id;
		
		public Produto(String nome, String descricao) {
			
			this.nome = nome;
			this.descricao = descricao;
		}
		
		public void setId(Integer id) {
			this.id = id;
		}
		
		public String getNome() {
			return nome;
		}
		
		public String getDescricao() {
			return descricao;
		}
		
		public Integer getId(){
			return id;
		}
		
//		
//		public String toString() {
//			return String.format("O produto criado foi: %d, %s, %s ", this.id, this.nome, this.descricao);
//		}
		
		@Override
		public String toString() {
			
			return String.format("O produto adicionado foi: %d %s %s",this.id, this.nome, this.descricao);
			
			
		}
		
}
