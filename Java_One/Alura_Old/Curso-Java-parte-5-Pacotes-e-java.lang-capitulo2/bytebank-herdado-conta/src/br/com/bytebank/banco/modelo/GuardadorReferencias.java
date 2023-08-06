package br.com.bytebank.banco.modelo;

public class GuardadorReferencias {
	
	//criando um obj array do tipo conta sem tamanho definido.
	private Object [] refObjects;
	private int indice;
	
	public GuardadorReferencias() {
		
		this.refObjects = new Object[10];
		indice =0;
	
	}
	
	public void adicionarContas (Conta contaCriada) {
		//refObjects[0] = contaCriada;
		this.refObjects[indice] = contaCriada;
		indice ++;
		
	}
	
	public Object recuperarInformacoesDoArray(int posicao) {
		return this.refObjects[posicao];
	}
	
	public int quantidadeDeContasCriadas() {
		return this.indice;
	}
	
}
