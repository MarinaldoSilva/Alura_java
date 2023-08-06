package Conta_Update;

public class TesteSaqueContaNegativa {
	public static void main(String[] args) {
		Conta conta = new Conta();
		Cliente paulo = new Cliente();
		
		//vinculando 
		conta.titular = paulo;
		paulo.nome = "Paulo";
		conta.depositar(100);
		
		System.out.println(conta.titular.nome);		
		conta.sacar(200);
		System.out.println("Olá " + paulo.nome + 
				" seu saldo é R$ " +conta.getSaldo());
	}
}
