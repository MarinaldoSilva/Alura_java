package com.br.byteBank.testeModelos;
public class teste {
	public static void main(String[] args) {
		System.out.println("INI MAIN");
		metodo1();	
		System.out.println("FIM MAIN");
	}
	
	private static void metodo1() {
		System.out.println("ini met1");
		try{
			metodo2();
		}catch(ArithmeticException e) {
			System.out.println("erro aritimetico");
		}
		System.out.println("fim met1");
	}
	
	private static void metodo2() {
		System.out.println("ini met2");
			for(int i = 0; i< 5; i++) {
				System.out.println(i);
				int a = i/0;
			System.out.println("fim met 2");
	
			}		
	}	
}
