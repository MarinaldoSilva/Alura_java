package Conta_v3_get_set_e_construtores;

public class TesteContas {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(2399,46661);
		ContaPoupanca cp = new ContaPoupanca(2399,46661);
		
		cp.depositar(100);
		cp.transferir(20, cc);
		cp.transferir(90, cc);
		
		
		System.out.println("cp: " + cp.getSaldo());
		System.out.println("cc: " + cc.getSaldo());
		
	}

}
