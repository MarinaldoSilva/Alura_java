package br.com.bytebank.banco.teste;

import java.util.ArrayList;
import java.util.List;

public class TesteAuto_e_Un_boxing {

	public static void main(String[] args) {
		//Integer nuumInteger = new Integer(29);
		//esse jeito iniciar um obj com esse construtor foi depreciado desde o java 9
		int num =29;
		//transformando um primitivo em obj
		Integer refIdade = Integer.valueOf(num);
		//retorna um primitivo
		int valorPrimitivo = refIdade.intValue(); 
		
		
		List<Integer> lista = new ArrayList<Integer>();
		//lista.add(29) e por baixo dos panos o java faz isso abaixo.
		lista.add(Integer.valueOf(num));//autoboxing
		
		String s = args[0];
		Integer stringEmNumero = Integer.valueOf(s);
		System.out.println(stringEmNumero);
		
		int numero = Integer.parseInt(s);
		
		
		
		
		
		

	}

}
