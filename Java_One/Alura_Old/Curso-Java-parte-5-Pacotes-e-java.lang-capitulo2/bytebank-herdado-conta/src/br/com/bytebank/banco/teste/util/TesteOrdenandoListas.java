package br.com.bytebank.banco.teste.util;
import java.util.*;
import br.com.bytebank.banco.modelo.*;

public class TesteOrdenandoListas {

	public static void main(String[] args) {

        Conta cc1 = new ContaCorrente(22, 33);
        cc1.deposita(333.0);

        Conta cc2 = new ContaPoupanca(22, 44);
        cc2.deposita(444.0);

        Conta cc3 = new ContaCorrente(22, 11);
        cc3.deposita(111.0);

        Conta cc4 = new ContaPoupanca(22, 22);
        cc4.deposita(222.0);

        List<Conta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);
        
        for (Conta conta : lista) {
			System.out.println(conta);
		}
        
        System.out.println("-------------------------------");     
        NumeroDaContaComparador numeroDaContaComparador = new NumeroDaContaComparador();
        
        lista.sort(numeroDaContaComparador);
        for (Conta conta : lista) {
			System.out.println(conta);
		}

	}
}

class NumeroDaContaComparador implements Comparator <Conta>{
	
	NumeroDaContaComparador(){
		System.out.println("inicializando o construtor padrão, toda vez que um obj"
				+ "do tipo NumeroDaContaComparador for inicializado o construtor"
				+ " padrão é incialidado");
	}
	
	@Override
	public int compare(Conta c1, Conta c4) {
		if(c1.getNumero() > c4.getNumero()) {
			//qnd mais proximo do negativo for o nº, ele vai ser alocado do menor para o maior, nesse 
			//caso 11 é mais próximo de -1 que o nº 44
			return -1;
		}
		return 1;
	}
	
}
