package com.br.byteBank.testeModelos;
import com.br.byteBank.modelo.*;
public class TesteContas {
	
	public static void main(String[] args)  {
		ContaCorrente cc = new ContaCorrente(2399,46661 );
		ContaPoupanca cp = new ContaPoupanca(214,7654);
		Cliente cliente = new Cliente();
		Endereco enderco = new Endereco();
		
		cc.setTitular(cliente);
		cliente.setEndereco(enderco);
		
		enderco.setEstado("Pernambuco");
		enderco.setCidade("Recife");
		cliente.setNome("Bruno Dominado");
	
//		System.out.println("Olá " + cliente.getNome());
//		System.out.println("Seu endereço foi atualizado segue dados novos: Estado -> " + cliente.getEndereco().getEstado() + ", Cidade -> " + cliente.getEndereco().getCidade());
		
		System.out.println("cc");
		cc.depositar(100);
		cc.saldo();
		System.out.println("cp");
		cp.saldo();

		try {
			cp.transferir(150, cc);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
