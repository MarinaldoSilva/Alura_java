package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Teste {

	public static void main(String[] args) {
//		 	Double f = Double.valueOf("10");
//		    System.out.println(f);
//		    
//		    Integer i = new Integer(10);
//		    int teste = i.intValue();
//		    System.out.println(teste);
//		    
//		    String teste1 = "147852369";
//		    
//		    String num1 = teste1.valueOf(teste1);
//		    System.out.println(num1);
		
		System.out.println("Inicio HashSet");
		System.out.println();
			Set<String> nomes = new HashSet<>();
			nomes.add("Super Mario");
			nomes.add("Yoshi"); 
			nomes.add("Donkey Kong"); 
	
			Iterator<String> it = nomes.iterator();
	
			while(it.hasNext()) {
			  System.out.println(it.next());
			}
			
			System.out.println();
		System.out.println("fim HashSet");
		
		System.out.println();
		
	
		
		System.out.println("Inicio HasNext");
	
		
		List<String> nomes1 = new ArrayList<>();
		nomes.add("Super Mario");
		nomes.add("Yoshi"); 
		nomes.add("Donkey Kong"); 

		Iterator<String> it1 = nomes1.iterator();

		while(it1.hasNext()) {
		  System.out.println(it1.next());
		}
		System.out.println();
		System.out.println("Fim HasNext");
		    
	}

}
