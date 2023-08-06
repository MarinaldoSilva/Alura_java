package br.com.bytebank.banco.teste.util;

import java.util.Comparator;
import java.util.*;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.Cliente;

public class ComparandoStrings {

	public static void main(String[] args) {
		Conta cc1 = new ContaCorrente(22, 33);
		Cliente clienteCC1 = new Cliente();
		clienteCC1.setNome("Nico");
		cc1.setTitular(clienteCC1);
		cc1.deposita(333.0);
		
		Conta cc2 = new ContaPoupanca(22, 44);
        Cliente clienteCC2 = new Cliente();
        clienteCC2.setNome("Guilherme");
        cc2.setTitular(clienteCC2);
        cc2.deposita(444.0);	
    
        Conta cc3 = new ContaCorrente(22, 11);
        Cliente clienteCC3 = new Cliente();
        clienteCC3.setNome("Paulo");
        cc3.setTitular(clienteCC3);
        cc3.deposita(111.0);

        Conta cc4 = new ContaPoupanca(22, 22);
        Cliente clienteCC4 = new Cliente();
        clienteCC4.setNome("Ana");
        cc4.setTitular(clienteCC4);
        cc4.deposita(222.0);        
          
        List<Conta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        for (Conta conta : lista) {
        	System.out.println(conta + " = " + conta.getTitular().getNome());
        }

        
        //new TitularDaConta() desse jeitro eu não preciso inicializar um obj, eu recebo o resultado
        //nessa variavel descatavel
		//lista.sort(new NumeroDaContaComparator());
		
		//esse metodo sort() foi implementado nas versões recentes do java, a versão legada qeu ainda é vista
		//em projetos é usando o Colletions que é uma classe.
		
		//Collections.sort(lista,new NumeroDaContaComparator());
		//funciona do mesmo jeito.
		
		//mais um exemplo, se vc quiser embaralhar a sua lista, tem o metodo shuffle(List<?> list) void Colletions
		//Collections.shuffle(lista);
		//Collections.reverse(lista);
		
        //passando null como paramentro ele vai carregar a ordem natural do array que nos modificamos na claase contaCorrente e CP devido
        //a impletemtação de um contrato com Comparable da classe java.lang.
        lista.sort(null);
        
        //Collections.sort(lista);
        //funciona devido a classe conta implementar um contarto com Comparable do pacote java.lang.Comparable<>
        //que tem um metodo que faz essa comparação, e como CC e CP são filhas de de Conta, o metodo CompareTo(Conta outraConta) 
        //faz a verificação como "(-1 = do amior para o menor /zero = igual / 1= ordem normal )
        
        System.out.println("---------");

        for (Conta conta : lista) {
           System.out.println(conta + " = " + conta.getTitular().getNome());
        }

   }

}

class TitularDaConta implements Comparator<Conta>{

	@Override
	public int compare(Conta c1, Conta c2) {
		
		String nomec1 = c1.getTitular().getNome();
		String nomec2 = c2.getTitular().getNome();
		
		return nomec1.compareTo(nomec2);
	}
	
}


class NumeroDaContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {
	
		//forma mais elegante de usar o compare, o integer já tem um metodo para fazer essa comparação 
		return Integer.compare(c1.getNumero(), c2.getNumero());
		
	//	if(c1.getNumero() < c2.getNumero()) {
	//		return -1;
	//	}
	//
	//	if(c1.getNumero() > c2.getNumero()) {
	//	    return 1;
	//	}
	//
	//	return 0;
	
	//esse metodo abaixo é a simplificação desse de cima
	//return c1.getNumero() - c2.getNumero();
	}
}
		
	


