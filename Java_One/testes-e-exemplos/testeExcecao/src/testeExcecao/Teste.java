package testeExcecao;
	
public class Teste {
	
	public static void main(String[] args) {
		System.out.println("inicio main");
		metodo1();
		System.out.println("fim main");
	}
	
	private static void metodo1() {
		System.out.println("inicio metodo 1");
		metodo2();
		System.out.println("fim metodo 1");
	}
	
	private static void metodo2() {
		System.out.println("inicio metodo 2");
	try {
		for(int i =0; i< 10; i++) {
			System.out.println("valor de i = " + i);
			int a  = i/0;
		}
	}catch(ArithmeticException e) {
		//e.printStackTrace();
		System.out.println("mensagem de erro -> "  + e.getMessage());
	}
			System.out.println("fim metodo 2");
	}
	
}	
