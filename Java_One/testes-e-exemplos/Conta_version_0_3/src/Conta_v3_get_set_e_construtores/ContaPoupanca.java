package Conta_v3_get_set_e_construtores;

public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(int agencia, int conta) {
		super(agencia, conta);
	}
	
	@Override
	public void depositar(double valor) {
		super.saldo += valor;
	}
	
	
}
