package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayReferencia {

	public static void main(String[] args) {
		//int conta [] = new int[2];
		Conta [] conta = new ContaCorrente[10];
		//reservando 10 espaços na memória para guardar essas referencias
		
		Conta cc = new ContaCorrente(2399, 154785);
		
		conta[0] = cc;
		
		ContaCorrente ref = (ContaCorrente) cc;
		ref.deposita(100);
		System.out.println(ref.getSaldo());
		
		

	}

}
