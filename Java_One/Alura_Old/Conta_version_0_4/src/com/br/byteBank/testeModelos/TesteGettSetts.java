package com.br.byteBank.testeModelos;
import com.br.byteBank.modelo.*;
public class TesteGettSetts {

	public static void main(String[] args) throws AgenciaEcontaInvalidaException, SaldoInsuficienteException{
		
		ContaCorrente conta =  new ContaCorrente(2399, 227587);
		
		Cliente clienteMario = new Cliente();
		Cliente clienteJoana = new Cliente();
		
		
		//vinculando conta a cliente(acessando o metedo setTitular(clienteMario)) 
		//e adicionando o clliente no parametro assim vinculando e acessando um metodo private.
		conta.setTitular(clienteMario);
		conta.setTitular(clienteJoana);
		
		clienteJoana.setNome("joana");
		clienteJoana.setCpf("70099895647");
		clienteJoana.setProfissao("Dev");
		
		conta.depositar(100);
		clienteMario.setNome("mario");
		clienteMario.setCpf("700.990.074-44");
		clienteMario.setProfissao("informatica");
		
		System.out.println("Olá " + clienteMario.getNome() + " seu saldo é R$ " + conta.getSaldo());
		System.out.println("Sua profissão é: " + clienteMario.getProfissao());
		System.out.println("CPF: " + clienteMario.getCpf());
		System.out.println();
		//conta.getTitular().setProfissao("Mecanico");
		//vamos pensar como se fosse diretorios, a classe conta tem um obj do tipo Cliente
		//esse obj do tipo cliente tem acesso aos atributos e metodos da classe cliente
		//então qnd acessamos o get.Titular() e como se fosse uma pasta, e dentro dessa pasta tem os atributos e metodos 
		//da classe Cliente, assim podemos acessar os atributos e metodos desse jeito conta.getTitular().getCpf();
		System.out.println(conta.getTitular().getNome());
		System.out.println(conta.getTitular().getProfissao());
		
	}
}
