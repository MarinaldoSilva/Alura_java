package br.com.bytebank.banco.teste.util;

import java.util.Comparator;
import java.util.*;
import br.com.bytebank.banco.modelo.*;

public class Lambda_teste1 {

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
          
        List<Conta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
      
//        lista.sort(new Comparator<Conta>(){
//        	
//	                	@Override
//	                	public int compare(Conta c1, Conta c2) {
//	                		
//	                		String nomec1 = c1.getTitular().getNome();
//	                		String nomec2 = c2.getTitular().getNome();
//	                		return nomec1.compareTo(nomec2);
//	                	}
//        		  }	
//        );
        
//        lista.sort( (Conta c1,Conta c2) -> { return Integer.compare( c1.getNumero(), c2.getNumero() ); });
//        lista.sort( (Conta c1,Conta c2) -> Integer.compare(c1.getNumero(), c2.getNumero() )) ;
        lista.sort( (c1 ,c2) -> { return c1.getNumero() - c2.getNumero(); } );
        lista.sort(new ContasPorOrdemAlfabetica());
      
        for (Conta conta : lista) {
           //System.out.println(conta + " = " + conta.getTitular().getNome());
        	 System.out.println(conta + " - " + conta.getTitular().getNome() );
        }
   }
}




































class ContasPorOrdem implements Comparator<Conta>{

	@Override
	public int compare(Conta c1, Conta c2) {
		return Integer.compare(c1.getNumero(), c2.getNumero());
	}
	
}

class ContasPorOrdemAlfabetica implements Comparator <Conta>{
	@Override
	public int compare(Conta c1, Conta c2) {
		String cc1 = c1.getTitular().getNome();
		String cc2 = c2.getTitular().getNome();
		
		return cc1.compareTo(cc2);
	}
}

		
	


