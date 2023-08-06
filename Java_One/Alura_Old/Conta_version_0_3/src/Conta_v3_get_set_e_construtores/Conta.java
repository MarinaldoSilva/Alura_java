package Conta_v3_get_set_e_construtores;
public abstract class Conta {

	protected double saldo;
	private int agencia, conta, senha; 
	private static int totalDeContasCriadas;
	private Cliente titular;
	
	//inicio contrutor
	public Conta(int agencia, int conta) {
		this.agencia = agencia;
		this.conta = conta;
		totalDeContasCriadas ++;
	}
	//fim construtor
	
	public boolean validarSenha(int senha) {
		if(this.senha == senha) {
			System.out.println("acesso liberado");
			return true;
		}else {
			System.out.println("acesso negado");
			return false;
		}
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
	
	public void setAgencia(int agencia) {
		if(agencia > 0) {
			this.agencia = agencia;
		}else {
			System.out.println("O número da agencia " + "'" + agencia + "'" + " esta incorreto");
			return;
		}	
	}
	
	public boolean transferir(double valor, Conta destinatario) {
		if(this.sacar(valor)) {
			destinatario.depositar(valor); 
			return true;
		}else {
			return false;
		}
	}
	
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public void saldo() {
		System.out.println(this.saldo);
	}
	
	public double getSaldo(){
		return this.saldo;
	}
	
	// os filhos para usarem esse metodo tem que implementa-lo 	
	public abstract void depositar(double valor);
	
	public int getAgencia() {
		return agencia;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}
	
}
