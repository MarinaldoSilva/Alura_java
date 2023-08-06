package br.com.bytebank.banco.teste.util;
import java.util.*;
import br.com.bytebank.banco.modelo.*;
public class TesteArrayListEquals {
	//Desvantagem do arrayList = tem uma capacidade 'x' especifica.
	//se remover um elemento do array (remover algo da posição 2) de maneira autematica 
	//o arrayList poxa a fila e realoca todos os outros objetos em cadeia, se o 2 for removido 
	// o terceiro vai para o lugar do segundo, o quarto para o lugar do terceiro e assim vai.
	
	public static void main(String[] args) {
		//teste
		ArrayList <Conta >lista = new ArrayList <Conta>();
		
		
		Conta conta1 =  new ContaCorrente(11, 192);
		lista.add(conta1);
		
		Conta conta2 =  new ContaCorrente(11, 19);
		lista.add(conta2);
		
//		boolean existeNoArray = conta1.ehIgual(conta2);
//		System.out.println(existeNoArray);
		
		Conta conta3 =  new ContaCorrente(11, 14);
		
		boolean existeNoArray = lista.contains(conta3);
		
		//System.out.println("Conta existe no array? " + existeNoArray);
		
		boolean existe = lista.contains(conta3);
		//System.out.println("Conta existe no array? " + existe +".");
		
		for(Conta conta : lista) {
			
			if(conta.equals(conta1)) {		
				System.out.println(conta + " já existe");
				break;
			}else {
				System.out.println("conta inexistente");
				
				break;
			}
		
		}
		
	}
	
}
