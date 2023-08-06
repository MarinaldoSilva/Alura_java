package atvd16_17;
import java.util.Scanner;

public class Atvd17_13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int base, expoente, resultado;
		
		System.out.println("Digite o numero base:");
		base = scan.nextInt();
		
		System.out.println("Digite o numero expoente:");
		expoente = scan.nextInt();
		
		resultado = base;
		
		for(int i=1; i < expoente; i++) {
			resultado *= base;
		}
		
		System.out.println("O numero " + base + " foi elevado a " + expoente);
		System.out.println("Resultado: " + resultado);
		
	}
}
