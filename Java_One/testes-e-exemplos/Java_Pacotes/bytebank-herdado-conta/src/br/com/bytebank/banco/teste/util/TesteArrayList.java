package br.com.bytebank.banco.teste.util;

import java.util.*;
import br.com.bytebank.banco.modelo.*;

public class TesteArrayList {

	public static void main(String[] args) {
		
		//classe que simplifica o acesso ao array do pacote  java.util
		
		//com esse código abaixo o array é inicializado de maneira automatica com varias posições disponiveis 		
		
		//Collection <Conta >lista = new ArrayList <Conta>(); tbm funciona porém não temos os metodos como .get/size e etc.
		List <Conta >lista = new ArrayList <Conta>();
		
		//criando um arraylist mais especifico onde só podemos guardar referencias do tipo Conta
		//ArrayList <Conta> lista = new ArrayList <Conta>();

		Cliente cliente = new Cliente();
		Conta conta1 =  new Conta(12, 150);
		Conta conta2 =  new Conta(11, 149);
		
		lista.add(conta1);
		lista.add(conta2);
		
		System.out.println("qnd de conta: " + lista.size());
		
		System.out.println(lista.get(1));

		Conta ref1 = (Conta) lista.get(1);
		
	System.out.println(ref1.getAgencia());
	System.out.println(ref1.getNumero());
	
	//lista.remove(0);
	System.out.println("qntd de conta: " + lista.size());		
	
	Conta conta3 =  new Conta(14, 151);
	Conta conta4 =  new Conta(15, 152);
	
	Conta ref2 = (Conta) lista.get(1);
	System.out.println(ref2.getNumero());
	
	System.out.println("com uso do for:");
	System.out.println();
	
	for(int i =0; i< lista.size();i++) {
		
		Object  refObjetc = lista.get(i); 
		System.out.println(refObjetc);
		
	}
	
	System.out.println();
	System.out.println("Usando o for Reach");
	
	for (Object refObjetc : lista) {
		System.out.println(refObjetc);
	}
	
	//se o array for mais especifivo como por exemplo
	
	// arraylist <Conta> lista = new arraylista <Conta>();
	//podemos usar o foreach assim
	//for(Conta variavel: lista){
	//System.out.println(conta);
	
	//}
	
	}

}
