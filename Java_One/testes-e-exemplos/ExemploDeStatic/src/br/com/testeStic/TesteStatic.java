package br.com.testeStic;

public class TesteStatic {
	
	class Soma{
		public static int resultado(int num1, int num2){
			return (num1 + num2);
		}
	}

	public class TestaSomaEstatica {
		public static void main(String[] args) {
			System.out.println(Soma.resultado(10,50));
		}
	}
}
