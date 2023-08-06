package br.com.bytebank.banco.teste.util;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import br.com.bytebank.banco.modelo.*;

public class LinkedList_e_ArrayList {

	public static void main(String[] args) {
		
		LinkedList lista = new LinkedList();
		List listaa = new LinkedList();
		List <Conta>listaas = new Vector<Conta>(); 
		
		Conta conta = new ContaCorrente(2399, 4729);
		lista.add(conta);
		
		Conta refe1 =(ContaCorrente) lista.get(0);
		refe1.deposita(100);
		
		refe1.getSaldo();
		
		
		
	}

}

//1ºlinkedList não usa um array por debaixo dos panos, porém usa uma "lista duplamente encadeiada" p/
//-guaradar os dados, o obj na posição grave a posição de seu proximo, por exemplo, 
//temos 4 elementos, e removemos o da posição 2, então o elemento 1 vai gravar o proximo 
//como o de sua proxima posição, que neste caso vai ser o terceiro elemento e assim segue essa ordem
//se o 3 for apagado o 2 vai gravar como seu proximo a posição 4
//2ºo primeiro elento q vc add e a primera conta que vc recebe numa interação, o primeiro elemento
//-é guaradado como referencia
//3º a interação no linked list sempre começa no inicio, na posição 1, tem baixa eficiencia se comparado ao array
//
