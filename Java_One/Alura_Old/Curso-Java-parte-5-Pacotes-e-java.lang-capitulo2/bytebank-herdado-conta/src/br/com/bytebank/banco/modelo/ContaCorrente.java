package br.com.bytebank.banco.modelo;

//new ContaCorrente()
public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void saca(double valor) throws SaldoInsuficienteException{
		double valorASacar = valor + 0.2;
		super.saca(valorASacar);
	}

	@Override
	public void deposita(double valor) {
        super.saldo += valor;
    }

	@Override
	public double getValorImposto() {	
		return super.saldo * 0.01;
	}
	
	@Override
	public String toString() {
		
		return "Conta Corrente " +  super.toString();
	}

	@Override
	public int compareTo(Conta outraConta) {
		
		//exemplo de como comparar pelo saldo
		//return Double.compare(this.saldo, outraConta.getSaldo());
		
		//exemplo de como comparar pela numero da conta
		return this.getNumero() - outraConta.getNumero();
		//se o return for zero as contas são iguais
		//se for positivo a outraConta é menor que a This.
		//se this for menor retona negativo
	}
	
}
