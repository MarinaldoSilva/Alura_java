package com.br.byteBank.modelo;

public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(int agencia, int conta)  {
		super(agencia, conta);
	}
	
	@Override
	public void depositar(double valor) {
		super.saldo += valor;
	}
	
	@Override
	public void setSenha(int senha) {
		super.setSenha(senha);
	}
	
	
}
