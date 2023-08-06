package br.com.bytebank4.banco;

public abstract class Funcionario {
	
	protected int senha;//protected é publico para os filhos e da classe pai/mãe
	private String nome;
	private String cpf;
	private double salario;

	//quando declaramos como abstrato é para garantir que as classes filhas as implementem seu próprio método 
	public abstract double getBonificacao();
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
}
