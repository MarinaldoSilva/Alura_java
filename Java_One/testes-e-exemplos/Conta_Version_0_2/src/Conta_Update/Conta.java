package Conta_Update;
public class Conta {

	private double saldo;
	int agencia, conta;
	Cliente titular;
	
	//como o atributo saldo é privado, para acessar temos que utilizar um metodo para mostrar esse saldo
	public void saldo() {
		System.out.println(this.saldo);
	}
	
	//com esse metedo simples o saldo é retornado após ser invocado este metodo
	public double getSaldo(){
		return this.saldo;
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
