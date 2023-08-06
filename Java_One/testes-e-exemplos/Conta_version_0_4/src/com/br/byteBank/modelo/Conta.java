package com.br.byteBank.modelo;
public abstract class Conta {

	protected double saldo;
	private int agencia, conta, senha; 
	private static int totalDeContasCriadas;
	private Cliente titular;
	
	//inicio contrutor
	public Conta(int agencia, int conta){
		
		if(agencia <= 0 ||conta <= 0) {
			new  AgenciaEcontaInvalidaException ("A agência ou conta invalida, não pode ser igual ou menor que zero." ); 
		
		}
		
		this.conta = conta;
		this.agencia = agencia;
	
		totalDeContasCriadas ++;
	}
	//fim construtor
	
	
	public void validarSenha(int senha) {
			if(this.senha != senha) {
				throw new ValidacaoSenhaException("Senha errada");
			}else {		
				System.out.println();
			}
	}

	
	public void sacar (double valor) {
		
		if(this.saldo < valor) {
			 new SaldoInsuficienteException ("Saldo não é suficiente: " + this.saldo + " "
					+ "o valor solicitado foi de : " + valor);
		}else {
			this.saldo -= valor;}
		
	}
	
	public void transferir(double valor, Conta destinatario)  {
		//se isso funcionar this.sacar(valor); o trecho de codigo "destinatario.depositar(valor)"
		//vai ser acionado e realizar o deposito na conta passada por parametro
		this.sacar(valor);
		destinatario.depositar(valor); 
	}
	
	public void setAgencia(int agencia)  throws AgenciaEcontaInvalidaException{
		if(agencia <= 0) {
			throw new  AgenciaEcontaInvalidaException ("A agência invalida");
		}else {
			this.agencia = agencia;
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

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}
	
}
