package br.com.bytebank.banco.modelo;

public class GuardaContas {
	
	//criando um obj array do tipo conta sem tamanho definido.
	private Conta [] referencias;
	private int posicaoLivre;
	
	public GuardaContas(){
		
		this.referencias = new Conta[10];
		posicaoLivre =0;
	
	}
	
	public void adicionar(Conta contaCriada) {
		
		this.referencias[this.posicaoLivre] = contaCriada;
		this.posicaoLivre++;
//		referencias[0] = contaCriada;
	}
	
	public int qntdContasCriadas() {
		return this.posicaoLivre;
	}

	public Conta getReferecia(int posicao) {
		return this.referencias[posicao];
	}
	
}
