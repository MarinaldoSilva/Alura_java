package br.com.bytebank.banco.modelo;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;	
	}
	
	@Override
	public String toString() {
		return "Conta Poupança " + super.toString();
	}

	@Override
	public int compareTo(Conta outraConta) {
		
		return this.getNumero() - outraConta.getNumero();
		//se o return for zero as contas são iguais
		//se for positivo a outraConta é menor que a This.
		//se this for menor retona negativo
		
	}
	
}
