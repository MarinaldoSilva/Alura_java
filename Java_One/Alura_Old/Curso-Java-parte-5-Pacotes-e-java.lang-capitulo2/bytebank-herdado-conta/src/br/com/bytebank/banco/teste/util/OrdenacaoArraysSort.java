package br.com.bytebank.banco.teste.util;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class OrdenacaoArraysSort {

	public static void main(String[] args) {
			
		List<Conta> lista = new ArrayList<Conta>();
		ComparadorConta comparador = new ComparadorConta();
		
		Conta cc1 = new ContaCorrente(10, 2369);
		lista.add(cc1);
		Conta cc2 = new ContaPoupanca(10, 2375);
		lista.add(cc2);
		Conta cc3 = new ContaCorrente(10, 2373);
		lista.add(cc3);
		Conta cc4 = new ContaPoupanca(10, 2376);
		lista.add(cc4);
		
		
		for (Conta conta : lista) {
			System.out.println(conta);
		}
		
		System.out.println("-----------------------------------------");
		System.out.println("-----------------------------------------");
		System.out.println("-----------------------------------------");
		System.out.println("-----------------------------------------");
		
		lista.sort(comparador);
		
		for (Conta conta : lista) {
			System.out.println(conta);
		}
		
	}

}

class ComparadorConta implements Comparator<Conta>{

	@Override
	public int compare(Conta c1, Conta c2) {
		
		if(c1.getNumero() < c2.getNumero()) {
			return -1;
		}
		
		if(c1.getNumero() > c2.getNumero()) {
			return 1;
		}
		
		return 0;
	}
	
}
