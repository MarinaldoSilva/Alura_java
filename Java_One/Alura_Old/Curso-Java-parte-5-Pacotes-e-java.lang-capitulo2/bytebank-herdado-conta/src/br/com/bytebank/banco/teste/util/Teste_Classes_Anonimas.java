package br.com.bytebank.banco.teste.util;
import java.util.*;
import br.com.bytebank.banco.modelo.*;


public class Teste_Classes_Anonimas {

	public static void main(String[] args) {
		
		List<Conta> lista = new ArrayList<>();

		Conta cc1 = new ContaCorrente(22, 33);
		Conta cc2 = new ContaPoupanca(22, 44);
		Conta cc3 = new ContaCorrente(22, 11);
		Conta cc4 = new ContaPoupanca(22, 22);
		
		Cliente clienteCC1 = new Cliente();
		Cliente clienteCC2 = new Cliente();
		Cliente clienteCC3 = new Cliente();
		Cliente clienteCC4 = new Cliente();
		
		clienteCC1.setNome("Nico");
		clienteCC2.setNome("Guilherme");
		clienteCC3.setNome("Paulo");
		clienteCC4.setNome("Ana");
		
		cc1.setTitular(clienteCC1);
		cc2.setTitular(clienteCC2);
		cc3.setTitular(clienteCC3);
		cc4.setTitular(clienteCC4);
		
		cc1.deposita(333.0);
        cc2.deposita(444.0);	
        cc3.deposita(111.0);
        cc4.deposita(222.0);        
        
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);
        
        Comparator<Cliente> comparator = new Comparator<Cliente>() {
        	
  @Override public int compare(Cliente c1, Cliente c2) {
				return Integer.compare(c1.getContaAtiva(), c2.getContaAtiva());
			}
        };

        //quando a gnt cria esses objs com um unico intuito de usar os metodos presentes nos tipos instanciados, sem a necessidade real de usar 
        //como membros ativos do programa, é chamada de **Function Objetc** um obj que encapsula uma função, porem podemos simplificar esse código
        //NumeroDaContaComparator2 numConta = new NumeroDaContaComparator2();
       
        
        TitularDaConta titularConta = new TitularDaConta();  
        lista.sort(new NumeroDaContaComparator());
       
        //lista.sort(numConta);
        
        //podemos também ao invés de criar um obj do um tipo especifico, podemos instanciar e usar seu metodo desejado, olhe o exemplo abaixo
        //estamos inicializando um novo Comparator<Conta>() e abrimos chaves e sobreescrevemos o seu metodo 
        
        
        
        //classe anonima- dentro da pasta do projeto porém na pasta bin foi gerado uma classe de nome Teste2$1.class
        //que é uma classe que é inicializada por baixo dos panos
        lista.sort(
        	new Comparator<Conta>() { 
        		@Override
	        	public int compare(Conta c1, Conta c2) {
	        		return Integer.compare(c1.getNumero(), c2.getNumero());		
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
        
        

        System.out.println("******************************************");
        for (Conta conta : lista) {
           System.out.println(conta + " = " + conta.getTitular().getNome());
        }

   }
}























































//class TitularDaConta2 implements Comparator<Conta>{
//
//	@Override
//	public int compare(Conta c1, Conta c2) {
//		
//		String nomec1 = c1.getTitular().getNome();
//		String nomec2 = c2.getTitular().getNome();
//		
//		return nomec1.compareTo(nomec2);
//	}
//	
//}


//class NumeroDaContaComparator2 implements Comparator<Conta> {
//
//	@Override
//	public int compare(Conta c1, Conta c2) {
//		return Integer.compare(c1.getNumero(), c2.getNumero());
//		
//	}

		
	


