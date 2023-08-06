package com.br.byteBank.modelo;

public class Endereco {
	private String estado;
	private String cidade;
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public String getEstado() {
		return estado;
	}
}
