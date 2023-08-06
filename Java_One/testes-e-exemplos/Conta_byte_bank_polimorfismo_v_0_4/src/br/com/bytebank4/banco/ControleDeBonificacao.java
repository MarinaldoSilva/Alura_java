package br.com.bytebank4.banco;

public class ControleDeBonificacao {
	
	private static double soma;
	
	public void bonificacao(Funcionario f) {
		f.getBonificacao();
		soma = soma + f.getBonificacao();
	}	
	
	public double getSoma() {
		return soma;
	}
	
}
