package alura_java;

public class Conta {

	double saldo;
	int agencia, conta;
	String nomeDoTitular;
	
	public void saldo() {
		System.out.println(this.saldo);
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public boolean sacar (double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}else {
			System.out.println("Saldo insuficiente para transação");
			return false;
		}

	}
	
	public boolean transferir(double valor, Conta destinatario) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destinatario.depositar(valor); 
			return true;
		}else {
			return false;
		}
	}
	
}
