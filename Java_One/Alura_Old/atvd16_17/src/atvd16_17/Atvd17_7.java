package atvd16_17;
import java.util.Scanner;
public class Atvd17_7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int menorNumero = Integer.MIN_VALUE;
		
		for(int i=0;i<5;i++) {
			System.out.println("Informe um número:");
			int numero = scan.nextInt();
			
			if(numero > menorNumero) {
				menorNumero = numero;
			}
		}
		System.out.println("O maior numero dos 5 digitados é: " + menorNumero);
		
	}
}
