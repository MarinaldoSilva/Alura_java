package br.com.bytebank.banco.teste.util;

import java.util.Comparator;
import java.util.*;
import br.com.bytebank.banco.modelo.*;

public class Teste_Lambidas {

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

        //quando a gnt cria esses objs com um unico intuito de usar os metodos presentes nos tipos instanciados, sem a necessidade real de usar 
        //como membros ativos do programa, é chamada de **Function Objetc** um obj que encapsula uma função, porem podemos simplificar esse código
        //NumeroDaContaComparator2 numConta = new NumeroDaContaComparator2();
        TitularDaConta titularConta = new TitularDaConta();  
        lista.sort(new NumeroDaContaComparator());
        //lista.sort(numConta);
        
        //podemos também ao invés de criar um obj do um tipo especifico, podemos instanciar e usar seu metodo desejado, olhe o exemplo abaixo
        //estamos inicializando um novo Comparator<Conta>() e abrimos chaves e sobreescrevemos o seu metodo 
        
        
        //jeito 1 de fazer: extremamente simplificado
        lista.sort(
        		//lambida sempre usa essa seta para explicitar que é uma lambda
        		//não precisamos dizer o tipo de c1 e c2 pois na lista já tem explicito qual é o tipo na lista com o uso dos generics<Conta>;
        	(c1, c2) ->	Integer.compare(c1.getNumero(), c2.getNumero())
        );
        
        //jeito 2 de fazer, também simplificado
        //em ambos os casos não precisamos inicializar nenhum obj do tipo p/ poder usar os metodos, algumas classes como Integer por exemplo
        //tem varios metodos que podemos utulizar para realizar comparações, classe string por exemplo é a mesma situação, ja exite metodods 
        //para realizar comparações
        
//        lista.sort(
//        	(Conta c1, Conta c2) -> {
//        		return Integer.compare(c1.getNumero(), c2.getNumero());
//        	}
//        );
//        
        lista.sort(new Comparator<Conta>(){
        	
	                	@Override
	                	public int compare(Conta c1, Conta c2) {
	                		
	                		String nomec1 = c1.getTitular().getNome();
	                		String nomec2 = c2.getTitular().getNome();
	                		return nomec1.compareTo(nomec2);
	                	}
        		  }	
        );
        
        
        Comparator <Conta> comparar = new Comparator<Conta>(){

        	@Override
        	public int compare(Conta c1, Conta c2) {
        		
        		String nomec1 = c1.getTitular().getNome();
        		String nomec2 = c2.getTitular().getNome();
        		return nomec1.compareTo(nomec2);
        	}
        };

        
        for (Conta conta : lista) {
           System.out.println(conta + " = " + conta.getTitular().getNome());
        }

   }
}

		
	


