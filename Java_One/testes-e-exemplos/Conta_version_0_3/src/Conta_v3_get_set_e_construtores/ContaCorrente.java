package Conta_v3_get_set_e_construtores;
public class ContaCorrente extends Conta implements Tributavel{
	
	public ContaCorrente(int agencia, int conta) {
		super(agencia, conta);
	}
	
	@Override //sobrepor->reescrever
	public boolean sacar(double valor) {
		return super.sacar(valor);
	}
	
	public void depositar(double valor)  {
		super.saldo += valor;
	}
		
	@Override
	public double getValorImposto() {
		return super.saldo  * 0.15;	
	}
	
	
}
