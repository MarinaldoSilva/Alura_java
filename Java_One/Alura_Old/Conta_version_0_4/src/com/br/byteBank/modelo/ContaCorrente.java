package com.br.byteBank.modelo;

public class ContaCorrente extends Conta implements Tributavel {
	private double valorPorSaque = 6.50;
	 double valorParaSacar;
	 
	public ContaCorrente(int agencia, int conta) throws AgenciaEcontaInvalidaException, SaldoInsuficienteException {
		super(agencia, conta);
	}
	
	@Override //sobrepor->reescrever
	public void sacar(double valor) throws AgenciaEcontaInvalidaException, SaldoInsuficienteException{
		//taxa de 6.50 por saque 
		valorParaSacar = valor + getValorPorSaque();
		super.sacar(valorParaSacar);
	}
	
	public void valorPorSaque() {
		System.out.println(getValorPorSaque());
	}
	
	public void depositar(double valor)  {
		super.saldo += valor;
	}

	@Override
	public double getValorImposto() {
		return super.saldo  * 0.15;	
	}

	public void setSenha(int senha) {
		super.setSenha(senha);
	}

	public double getValorPorSaque() {
		return valorPorSaque;
	}
	
}
