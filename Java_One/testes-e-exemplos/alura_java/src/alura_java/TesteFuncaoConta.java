package alura_java;

public class TesteFuncaoConta {

	public static void main(String[] args) {
		Conta contaJoao = new Conta();
		Conta contaMaria = new Conta();
		Conta contaMarcia = new Conta();
		boolean conseguiuTranferir;
		
		contaJoao = contaMaria;
		//acessando o metodo (nomeDaConta.nomeDoMetodo)
		contaJoao.depositar(100);
		conseguiuTranferir =contaJoao.transferir(30, contaMaria);
		conseguiuTranferir = contaJoao.transferir(30, contaMarcia);
		
		contaJoao.nomeDoTitular = "Marinaldo";
		System.out.println("Saldo Maria: " + contaMaria.saldo);
		System.out.println("Conta Marcia: " + contaMarcia.saldo);
		System.out.println("Conta Joao: " + contaJoao.saldo);
		System.out.println(contaJoao.nomeDoTitular);
	
		
	}
}
