package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteObjetc {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(125, 10);
		ContaPoupanca cp = new ContaPoupanca(2324, 145);
		Cliente cliente = new Cliente();
		
		println(cc);
		println(cp);
	}
	
	static void println(int x) {
		System.out.println(x);
	}
	
	static void println(String x) {
		System.out.println(x);
	}
	
	static void println(double x) {
		System.out.println(x);
	}
	
	static void println(boolean x) {
		System.out.println(x);
	}
	
	static void println(Object x) {
		System.out.println(x);
	}
	
}
