package com.br.byteBank.testeModelos;
import com.br.byteBank.modelo.*;
public class TestaValores {
	
	public static void main(String[] args) {
		
		ContaCorrente conta = new ContaCorrente(1, 1);
		Cliente cliente = new Cliente();
		
		cliente.setNome("Mario");
		cliente.setProfissao("dev");
		
		conta.setTitular(cliente);
		conta.getTitular().getNome();
		
		Cliente clienteM = new Cliente(); 
		conta.setTitular(clienteM);
		
		conta.depositar(1500);
		conta.sacar(153.50);
		
		System.out.println("saldo restante: " + conta.getSaldo());
		System.out.println("Valor por saque: " + conta.getValorPorSaque());
		
//		System.out.println(conta.getAgencia());
//		System.out.println(conta.getConta());
//		System.out.println();
//		System.out.println(cliente.getNome());
//		
//		cliente.setNome("Joana");
//		System.out.println(cliente.getNome());
//		cliente.setNome("Mario2");
//		System.out.println(cliente.getNome());
//		System.out.println(cliente.getProfissao());
		
	}

}
